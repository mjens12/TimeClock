package punchClock;

/**
 * The Money class handles all actions and calculations regarding currency
 * earned during the work week.
 * 
 * This class also contains methods to convert one currency to another.
 * 
 * @author Freeman Ogburn, Tyler Hay, Max Jensen
 *
 */
public class Money {

	/**
	 * Variable that determines if overtime is enabled or disabled.
	 */
	private boolean overtime = false;
	// /** Double value for the User's pay rate. **/
	// private double payRate = 0.0;
	/** Double value for the Gross Income. **/
	private double grossIncome = 0.0;
	/** Double value for the Net Income. **/
	private double netIncome = 0.0;

	/**
	 * Setter method for the overtime variable. Method is called when OT is enabled
	 * and the total hours is above 40.0.
	 * 
	 * @param state
	 *            boolean value to enable/disable overtime.
	 */
	public void setOT(final boolean state) {
		overtime = state;
	}

	/**
	 * Getter method that returns the current state of overtime.
	 * 
	 * @return true for enables, false for disabled.
	 */
	public boolean getOT() {
		return overtime;
	}

	/**
	 * Getter for Gross Income.
	 * 
	 * @return Gross Income value
	 */
	public double getGrossIncome() {
		return grossIncome;
	}

	/**
	 * Getter for Net Income.
	 * 
	 * @return Net Income Value
	 */
	public double getNetIncome() {
		return netIncome;
	}

	/**
	 * Calculates total earnings with the time and rate passed in.
	 * 
	 * @param time
	 *            numerical time value in milliseconds
	 * @param rate
	 *            numerical value representing dollar earnings per hour
	 * @return Product of time and rate that represents total earnings
	 */
	// Still need to format the output to 2 decimal places
	public double calcGrossEarnings(final double time,
			final double rate) {

		if (overtime && time >= 40.0) {
			return time * rate * 1.50;
		}

		return time * rate;
	}

	/**
	 * Takes the gross pay and applies standard U.S taxes to calculate the net pay.
	 *
	 * @param grossPay
	 *            double value of total dollars
	 * @return double value of net pay
	 */
	public double calcNetEarnings(final double grossPay) {

		final double fedIncomeTax = 0.11;
		final double socSecurityTax = 0.06;
		final double medicareTax = 0.0145;

		final double fedTakeOut = grossPay * fedIncomeTax;
		final double socTakeOut = grossPay * socSecurityTax;
		final double medTakeOut = grossPay * medicareTax;

		double netPay = grossPay - fedTakeOut - socTakeOut
				- medTakeOut;

		return netPay;
	}

	public double taxAmounts(final double federal, final double soc,
			final double med, final double state,
			final double grossPay) {

		final double fedIncomeTax = federal / 100;
		final double socSecurityTax = soc / 100;
		final double medicareTax = med / 100;
		final double stateTax = state / 100;

		final double fedTakeOut = grossPay * fedIncomeTax;
		final double socTakeOut = grossPay * socSecurityTax;
		final double medTakeOut = grossPay * medicareTax;
		final double stateTakeout = grossPay * stateTax;

		double netPay = grossPay - fedTakeOut - socTakeOut
				- medTakeOut - stateTakeout;

		return netPay;

	}

}
