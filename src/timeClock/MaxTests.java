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

}
