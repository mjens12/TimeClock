package timeClock;

public class Main {
	public static void main(String[] args) {
		Clock first = new Clock();
		System.out.println((first.calcTotalEarnings(5.5, 15)));
		System.out.println(first.calcHourEarnings(10, 100));
	}
}
