package timeClock;

/**
 * Clock class. Contains methods that convert time units into hourly
 * earnings. This is handles most of the back-end calculating for the
 * Time Clock.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class Clock {

	/**
	 * Array that holds the in and out times for each day of the week,
	 * the AM/PM settings of the time, and the total hours worked per
	 * day.
	 */
	int[][] weekData = new int[7][6];

	/**
	 * Object that holds the value representing Milliseconds in one
	 * hour.
	 */
	private final int millisInHour = (1000 * 60 * 60);

	/**
	 * Object that holds the value representing Milliseconds in one
	 * minute.
	 */
	private final int millisInMin = (1000 * 60);

	/**
	 * Object that holds the value representing Milliseconds in one
	 * second.
	 */
	private final int millisInSec = 1000;

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
	public double calcGrossEarnings(double time, double rate) {
		return time * rate;
	}
	
	/*
	* Takes the gross pay and applies standard U.S taxes
    * to calculate the net pay.
    *
    * @param grossPay double value of total dollars
    * @return double value of net pay
    */
   public double calcNetEarnings(final double grossPay) {
       
       final double fedIncomeTax = 0.11;
       final double socSecurityTax = 0.06;
       final double medicareTax = 0.0145;
       
       final double fedTakeOut = grossPay * fedIncomeTax;
       final double socTakeOut = grossPay * socSecurityTax;
       final double medTakeOut = grossPay * medicareTax;
       
       double netPay = grossPay - fedTakeOut
               - socTakeOut - medTakeOut;
       
       return netPay;
   }

	public void zeroDataArray() {
		for (int x = 0; x < 7; x++) {
			for (int y = 0; y < 6; y++) {
				weekData[x][y] = 0;
			}
		}
	}
	

	public double calcTime(int time1H, int time1M, int time1AMPM,
			int time2H, int time2M, int time2AMPM) {
		double toReturn = 0;

		double time1 = 0;
		double time2 = 0;

		if (time1H < 1 || time1H > 12 || time1M < 0 || time1M > 59 || time2H < 1 || time2H > 12 || time2M < 0 || time2M > 59)
		{
			return 0.00;
		}
		else {

			time1 = time1H + (time1M / 60.0);
			time2 = time2H + (time2M / 60.0);
	
			if (time1AMPM == 1) {
				time1 += 12;
			}
	
			if (time2AMPM == 1) {
				time2 += 12;
			}
	
			toReturn = time2 - time1;
	
			return toReturn;
		}
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
	public double calcTotalEarnings(double time, double rate) {
		return time * rate;
	}

	/**
	 * Calculates earnings per hour with time and total money earned.
	 * 
	 * @param time
	 *            numerical value representing hours "clocked-in"
	 * @param money
	 *            numerical value representing a sum of money
	 * @return a quotient of money and time that represents earnings
	 *         made per hour
	 */
	// Still need to format the output to 2 decimal places
	public double calcHourEarnings(double time, double money) {
		return money / time;
	}

	/**
	 * Calculates earnings per minute with time and total money earned.
	 * 
	 * @param time
	 *            numerical value representing time in minutes
	 * @param money
	 *            numerical value representing a sum of money
	 * @return a quotient of money and time that represents earnings
	 *         made per minute
	 */
	// Still need to format the output to 2 decimal places
	public double calcMinEarnings(double time, double money) {
		return money / time;
	}

	/**
	 * Calculates earnings per second with time and total money earned.
	 * 
	 * @param time
	 *            numerical value representing time in seconds
	 * @param money
	 *            numerical value representing a sum of money
	 * @return a quotient of money and time representing earnings made
	 *         per second
	 */
	// Still need to format the output to 2 decimal places
	public double calcSecEarnings(double time, double money) {
		return money / time;
	}
}
