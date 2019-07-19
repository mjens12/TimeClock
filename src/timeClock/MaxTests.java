package timeClock;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MaxTests {

	@Test
	public void GEBasic() {
		Clock test = new Clock();
		;
		assertEquals(1, test.calcGrossEarnings(1, 1));
	}

	@Test
	public void GENeg() {
		Clock test = new Clock();
		assertEquals(-1, test.calcGrossEarnings(-1, 1));
	}
	
	@Test
	public void NEBasic() {
		Clock test = new Clock();
		assertEquals(81550, test.calcNetEarnings(100000));
	}
	
	@Test
	public void TotalEarningsBasic() {
		Clock test = new Clock();
		assertEquals(50, test.calcTotalEarnings(5,10));
	}
	
	@Test
	public void HourEarningsBasic() {
		Clock test = new Clock();
		assertEquals(10, test.calcHourEarnings(5,50));
	}
	
	@Test
	public void MinEarningsBasic() {
		Clock test = new Clock();
		assertEquals((50.0/300), test.calcMinEarnings(300,50));
	}
	
	@Test
	public void SecEarningsBasic() {
		Clock test = new Clock();
		assertEquals((50.0/1800), test.calcSecEarnings(1800,50));
	}

}
