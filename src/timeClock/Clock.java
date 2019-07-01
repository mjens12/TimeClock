package timeClock;

import java.util.GregorianCalendar;

public class Clock {
	// Final values for the number of milliseconds in hours, minutes,
	// and seconds
	private final int millisInHour = (1000 * 60 * 60);
	private final int millisInMin = (1000 * 60);
	private final int millisInSec = 1000;

	// Calendar for current time (hopefully to use with running clock
	// on GUI)
	GregorianCalendar currentTime = new GregorianCalendar();

	// Calendar for the set in time
	GregorianCalendar inTime = new GregorianCalendar();

	// Calendar for the set out time
	GregorianCalendar outTime = new GregorianCalendar();

	// Calculates the time in milliseconds between two calendars
	public double calcTime(GregorianCalendar cal1,
			GregorianCalendar cal2) {
		return cal1.getTimeInMillis() - cal2.getTimeInMillis();
	}

	// Converts a time in milliseconds into an hh:mm:ss:mmm formatted
	// String. Still need write code to backfill zeroes if the
	// hour/min/sec is one digit or the millis is one or two digits
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

	// Calculates total earnings with the time and rate passed in
	// Still need to format the output to 2 decimal places
	public double calcTotalEarnings(double time, double rate) {
		return time * rate;
	}

	// Calculates earnings per hour with time and total money earned
	// passed in
	// Still need to format the output to 2 decimal places
	public double calcHourEarnings(double time, double money) {
		return money / time;
	}

	// Calculates earnings per minute with time and total money earned
	// passed in
	// Still need to format the output to 2 decimal places
	public double calcMinEarnings(double time, double money) {
		return money / time;
	}

	// Calculates earnings per second with time and total money earned
	// passed in
	// Still need to format the output to 2 decimal places
	public double calcSecEarnings(double time, double money) {
		return money / time;
	}

	// Sets inTime variable based on a passed String, still need to
	// write this
	public void setInTime(String in) {
		GregorianCalendar tempIn = new GregorianCalendar();
	}

	// Sets outTime variable based on a passed String, still need to
	// write this
	public void setOutTime(String out) {
		GregorianCalendar tempOut = new GregorianCalendar();

	}
}
