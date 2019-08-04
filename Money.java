package punchclock;

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
	 * Setter method for the overtime variable.
	 *  Method is called when OT is enabled
	 * and the total hours is above 40.0.
	 * 
	 * @param state
	 *            boolean value to enable/disable overtime.
	 */
	public void setOT(final boolean state) {
		overtime = state;
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
	 * @param currency index of selected currency location
	 * @return Product of time and rate that represents total earnings
	 */
	// Still need to format the output to 2 decimal places
	public double calcGrossEarnings(final double time,
			final double rate, final int currency) {

        this.grossIncome = time * rate;
		
		if (getOT() && time >= 40.0) {
			this.grossIncome = this.grossIncome * 1.5;
		}
		
		
		switch (currency) {
			case 1: // EURO
				this.grossIncome = this.grossIncome * .90;
				break;
			case 2: // YEN
				this.grossIncome = this.grossIncome * 106.81;
				break;
			case 3: //POUND
				this.grossIncome = this.grossIncome * .82;
				break;
			case 4: // AUD
				this.grossIncome = this.grossIncome * 1.47;
				break;
			case 5: // CAD
				this.grossIncome = this.grossIncome * 1.32;
				break;
			case 6: // PESO
				this.grossIncome = this.grossIncome * 19.27;
			default:
				break;
		}

		

		return this.grossIncome;
	}

	
	/**
	 * taxAmounts method is the updated version of calcNetEarnings.
	 * The method takes in all of the double values from the
	 * Tax text fields and converts the to a percentage value,
	 * it will then calculate and return the net pay by
	 * multiplying these taxes to the gross pay.
	 * 
	 * @param federal Federal Tax value
	 * @param soc Social Security Tax value
	 * @param med Medicare Tax value
	 * @param state State Tax value
	 * @param grossPay Gross Pay value
	 * @return Double Net Pay value.
	 */
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

		this.netIncome = grossPay - fedTakeOut - socTakeOut
				- medTakeOut - stateTakeout;

		return this.netIncome;

	}

	/**
	 * Getter method for Overtime variable.
	 * @return boolean value
	 * 0 for false and 1 for true
	 */
	public boolean getOT() {
		return overtime;
	}

}
