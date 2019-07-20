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
		return time * rate;
	}
	
	

	/**
	 * the calcTime method takes in the "clock-in" time, and the
	 * "clock-out" time in hour, minute, and AM/PM sections. 
	 * The method takes the difference between the two times
	 * to calculate the total time worked for the day. How the
	 * difference is calculated is based on the AM/PM of each
	 * time to make sure the calculated time difference is within
	 * the typical 24-hour day time schedule.
	 * 
	 * @param time1H Integer of hour clocked-in
	 * @param time1M Integer of minute clock-in
	 * @param time1AMPM Integer representing AM or PM.
	 * 			0 = AM and 1 = PM.
	 * @param time2H Integer of hour clocked-out
	 * @param time2M Integer of minute clocked-out
	 * @param time2AMPM Integer representing AM or PM.
	 * 			0 = AM and 1 = PM.
	 * @return Double vale of total time worked
	 */
	public double calcTime(int time1H, int time1M, int time1AMPM,
            int time2H, int time2M, int time2AMPM) {
        double toReturn = 0.00;

        double time1 = 0.00;
        double time2 = 0.00;

      //Error checking for invalid inputs.
        if (time1H < 1 || time1H > 12 || time1M < 0 
        		|| time1M > 59 || time2H < 1 
        		|| time2H > 12 || time2M < 0 || time2M > 59) {
            return 0.00; 
        } else { //continue
        	
        	
        	//checking in input time is AM
        	if (time1AMPM == 0) {
        		//if input hour is 12 AM
        		if (time1H == 12) {
        			time1H = 0; //set to 0 for 24 hour scale.
        		}
        	  //input time is in PM	
        	} else {
        		
        		if ( time1H >= 1 && time1H <= 11) {
        			time1H += 12;
        		}
        	}
        	
        	//checking in output time is AM
        	if (time2AMPM == 0) {
        		//if output hour is 12 AM
        		if (time2H == 12) {
        			time2H = 0; //set to 0 for 24 hour scale.
        		}
        	  //output time is in PM	
        	} else {
        		
        		if ( time2H >= 1 && time2H <= 11) {
        			time2H += 12;
        		}
        	}
        	
        	
        	
        	time1 = time1H + (time1M / 60);
        	time2 = time2H + (time2M / 60);
        	
        	
        	
        	// AM to AM calculation
        	if (time1AMPM == 0 && time2AMPM == 0) {
        		
        		//checking if out-time is greater
        		//than in-time
        		if (time1 > time2) {
        			toReturn = 24 - Math.abs(time2 - time1);
        		} else {
        		toReturn = Math.abs(time1 - time2);
        		}
        	}
        	
        	// PM to PM calculation
        	if (time1AMPM == 1 && time2AMPM == 1) {
        		
        		//checking if out-time is greater
        		//than in-time
        		if (time1 > time2) {
        			toReturn = 24 - Math.abs(time2 - time1);
        		} else {
        		toReturn = Math.abs(time1 - time2);
        		}
        	}
        	
        	//AM to PM calculation
        	if (time1AMPM == 0 && time2AMPM == 1) {
        		toReturn = Math.abs(time2 - time1);
        	}
        	
        	//PM to AM calculation
        	if (time1AMPM == 1 && time2AMPM == 0) {
        		
        		toReturn = 24 - Math.abs(time2 - time1);
        	}
        	
        	return toReturn;
        }
	}
	
	/**
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

	
}
