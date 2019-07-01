package timeClock;

import java.util.GregorianCalendar;

public class Clock {
	GregorianCalendar currentTime = new GregorianCalendar();
	GregorianCalendar inTime = new GregorianCalendar();
	GregorianCalendar outTime = new GregorianCalendar();

	public long calcTime(GregorianCalendar cal1,
			GregorianCalendar cal2) {
		return cal1.getTimeInMillis() - cal2.getTimeInMillis();
	}

	public double calcTotalEarnings(double time, double rate) {
		return time * rate;
	}

	public double calcHourEarnings(long time, double money) {
		return money / time;
		// use this for time in millis (time / (1000 * 60 * 60 * 24));
	}

	public double calcMinEarnings(long time, double money) {
		// use this for time in millis (time / (1000 * 60 * 60));
		return money / time;
	}

	public double calcSecEarnings(long time, double money) {
		// use this for time in millis (time / (1000 * 60));
		return money / time;
	}

	public void setInTime(String in) {
		GregorianCalendar tempIn = new GregorianCalendar();
	}

	public void setOutTime(String out) {
		GregorianCalendar tempOut = new GregorianCalendar();

	}
}
