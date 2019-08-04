package punchClock;

/**
 * The Week class handles all actions that have to do with the time worked
 * throughout the week, Also handles the export and import features.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class Week {

	/** Total Hours Worked variable. **/
	private double totHrsWorked = 0.0;

	/**
	 * Array that holds the in and out times for
	 *  each day of the week, the AM/PM
	 * settings of the time, and the total hours worked per day.
	 */
	private int[][] weekData = new int[7][6];

	/**
	 * Array that holds the time worked for each day.
	 *  Used to find the sum of the weekly total.
	 */
	private double[] timeWorked = new double[7];

	/**
	 * setter method for totHrsWorked.
	 * 
	 * @param time
	 *            Double value of the total hours worked.
	 */
	public void setTotHrsWorked(final double time) {
		totHrsWorked = time;
	}

	/**
	 * Getter method for the totHrsWorked variable.
	 * 
	 * @return totHoursWorked variable.
	 */
	public double getTotHrsWorked() {
		return totHrsWorked;
	}

	/**
	 * Setter method for weekData array.
	 * 
	 * @param day
	 *            Day of the week where data is changed.
	 * @param unit
	 *            Field location (in Hour, Out Min, AMPM, ect.)
	 * @param dataValue
	 *            int value that that's a unit of time or a value for AM/PM.
	 */
	public void setWeekData(final int day, final int unit,
			final int dataValue) {
		weekData[day][unit] = dataValue;
	}

	/**
	 * Getter method for weekData array.
	 * 
	 * @param day
	 *            Day of the week being targeted.
	 * @param unit
	 *            Data location being targeted
	 * @return Integer value in the location.
	 */
	public int getWeekData(final int day, final int unit) {

		return weekData[day][unit];
	}

	/**
	 * Setter method for the time worked in a day.
	 * 
	 * @param day
	 *            Integer value where Sun = 0, Sat = 6
	 * @param time
	 *            Double value of the time worked.
	 */
	public void setTimeWorked(final int day, final double time) {
		timeWorked[day] = time;
	}

	/**
	 * Getter method for the time worked in a day.
	 * 
	 * @param day
	 *            Day being targeted
	 * @return Double value of the time worked.
	 */
	public double getTimeWorked(final int day) {
		return timeWorked[day];
	}

	/**
	 * The calcTime method takes in the "clock-in" time,
	 * and the "clock-out" time in hour, minute, and AM/PM sections.
	 * The method takes the difference between the two times to
	 * calculate the total time worked for the day.
	 * How the difference is calculated is based on the
	 *  AM/PM of each time to make sure the calculated
	 * time difference is within the typical 24-hour day time schedule.
	 * 
	 * @param time1H
	 *            Integer of hour clocked-in
	 * @param time1M
	 *            Integer of minute clock-in
	 * @param time1AMPM
	 *            Integer representing AM or PM. 0 = AM and 1 = PM.
	 * @param time2H
	 *            Integer of hour clocked-out
	 * @param time2M
	 *            Integer of minute clocked-out
	 * @param time2AMPM
	 *            Integer representing AM or PM. 0 = AM and 1 = PM.
	 * @return Double vale of total time worked
	 */
	public double calcTime(final int time1H, final int time1M,
			final int time1AMPM, final int time2H, final int time2M,
			final int time2AMPM) {
		double difference = 0.00;

		double time1 = 0.00;
		double time2 = 0.00;
		int time1Hour = time1H;
		int time2Hour = time2H;

		// Error checking for invalid inputs.
		if (time1Hour < 1 || time1Hour > 12 || time1M < 0
				|| time1M > 59 || time2Hour < 1 
				|| time2Hour > 12
				|| time2M < 0 || time2M > 59) {
			return 0.00;
		} else { // continue

			// checking in input time is AM
			if (time1AMPM == 0) {
				// if input hour is 12 AM
				if (time1Hour == 12) {
					 // set to 0 for 24 hour scale.
					time1Hour = 0;
				}
				// input time is in PM
			} else {

				if (time1Hour >= 1 && time1Hour <= 11) {
					time1Hour += 12;
				}
			}

			// checking in output time is AM
			if (time2AMPM == 0) {
				// if output hour is 12 AM
				if (time2Hour == 12) {
					// set to 0 for 24 hour scale.
					time2Hour = 0; 
				}
				// output time is in PM
			} else {

				if (time2Hour >= 1 && time2H <= 11) {
					time2Hour += 12;
				}
			}

			// converting given hours and minutes
			// into full time value.
			time1 = time1Hour + (time1M / 60.0);
			time2 = time2Hour + (time2M / 60.0);

			// AM to AM calculation
			if (time1AMPM == 0 && time2AMPM == 0) {

				// checking if out-time is greater
				// than in-time
				if (time1 > time2) {
					difference = 24.0 
						- Math.abs(time2 - time1);
				} else {
					difference = Math.abs(time1 - time2);
				}
			}

			// PM to PM calculation
			if (time1AMPM == 1 && time2AMPM == 1) {

				// checking if out-time is greater
				// than in-time
				if (time1 > time2) {
					difference = 24.0 
						- Math.abs(time2 - time1);
				} else {
					difference = Math.abs(time1 - time2);
				}
			}

			// AM to PM calculation
			if (time1AMPM == 0 && time2AMPM == 1) {
				difference = Math.abs(time2 - time1);
			}

			// PM to AM calculation
			if (time1AMPM == 1 && time2AMPM == 0) {

				difference = 24.0 - Math.abs(time2 - time1);
			}

			return difference;
		}
	}

}
