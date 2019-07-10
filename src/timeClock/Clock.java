package timeClock;

import java.util.GregorianCalendar;

/**
 * Clock class. Contains methods that convert time units into hourly earnings.
 * This is handles most of the back-end calculating for the Time Clock.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class Clock {

	/**
	 * Array that holds the in and out times for each day of the week, the AM/PM
	 * settings of the time, and the total hours worked per day.
	 */
	int[][] weekData = new int[7][7];

	/**
	 * Object that holds the value representing Milliseconds in one hour.
	 */
	private final int millisInHour = (1000 * 60 * 60);

	/**
	 * Object that holds the value representing Milliseconds in one minute.
	 */
	private final int millisInMin = (1000 * 60);

	/**
	 * Object that holds the value representing Milliseconds in one second.
	 */
	private final int millisInSec = 1000;

	/**
	 * Calendar for current time (to use with running clock on GUI)
	 */
	GregorianCalendar currentTime = new GregorianCalendar();

	/**
	 * Calendar for the "clock-in" time
	 */
	GregorianCalendar inTime = new GregorianCalendar();

	/**
	 * Calendar for the "clock-out time"
	 */
	GregorianCalendar outTime = new GregorianCalendar();

	/**
	 * Calculates the time in milliseconds between two calendars
	 * 
	 * @param cal1
	 *            the first calendar with a given time
	 * @param cal2
	 *            the second calendar with a given time
	 * @return Time value in milliseconds
	 */
	public double calcTime(GregorianCalendar cal1, GregorianCalendar cal2) {
		return cal1.getTimeInMillis() - cal2.getTimeInMillis();
	}

	public void setWeekArray(int[][] array) {
		weekData = array;
	}
	
	public double calcTime2(int time1H, int time1M, int time1AMPM, int time2H, int time2M, int time2AMPM) {
		double toReturn = 0;

		double time1 = 0;
		double time2 = 0;

		time1 = time1H + (time1M / 60.0);
		time2 = time2H + (time2M / 60.0);

		toReturn = time2 - time1;

		return toReturn;
	}

	/**
	 * Converts time in milliseconds into an hh:mm:ss:mmm formatted String
	 * 
	 * Still need write code to backfill zeroes if the hour/min/sec is one digit or
	 * the millis is one or two digits
	 * 
	 * @param time
	 *            numerical time value in milliseconds
	 * @return String object in the format of HH:MM:SS:mmm
	 */
	public String convToTime(double time) {
		String hours = "00";
		String mins = "00";
		String secs = "00";
		String millis = "000";
		String toReturn = "";

		if ((time / (millisInHour)) >= 1) {
			int hoursTemp = (int) (time / (millisInHour));
			time = time - (hoursTemp * millisInHour);
			hours = String.valueOf(hoursTemp);
		}

		if ((time / (millisInMin)) >= 1) {
			int minsTemp = (int) (time / (millisInMin));
			time = time - (minsTemp * millisInMin);
			mins = String.valueOf(minsTemp);
		}

		if ((time / (millisInSec)) >= 1) {
			int secsTemp = (int) (time / (millisInSec));
			time = time - (secsTemp * millisInSec);
			secs = String.valueOf(secsTemp);
		}

		if (time > 0) {
			millis = String.valueOf((int) time);
		}

		toReturn = (hours + ":" + mins + ":" + secs + ":" + millis);

		return toReturn;
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
	 * @return a quotient of money and time that represents earnings made per hour
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
	 * @return a quotient of money and time that represents earnings made per minute
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
	 * @return a quotient of money and time representing earnings made per second
	 */
	// Still need to format the output to 2 decimal places
	public double calcSecEarnings(double time, double money) {
		return money / time;
	}

	/**
	 * Sets inTime variable based on a passed String
	 * 
	 * @param in
	 *            "clock-on" string input formatted into HH:MM:SS:mmm
	 */
	// NOT FINISHED
	public void setInTime(String in) {
		GregorianCalendar tempIn = new GregorianCalendar();
	}

	/**
	 * Sets outTime variable based on a passed String
	 * 
	 * @param out
	 *            "clock-out" string input formatted into HH:MM:SS:mmm
	 */
	// NOT FINISHED
	public void setOutTime(String out) {
		GregorianCalendar tempOut = new GregorianCalendar();

	}
}
