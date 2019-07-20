package timeClock;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnitTesting {

	@Test
	public void testGEBasic() {
		Clock test = new Clock();
		assertEquals(1, test.calcGrossEarnings(1, 1));
	}

	@Test
	public void testGENeg() {
		Clock test = new Clock();
		assertEquals(-1, test.calcGrossEarnings(-1, 1));
	}
	
	@Test
	public void testNEBasic() {
		Clock test = new Clock();
		assertEquals(81550, test.calcNetEarnings(100000));
	}

}
