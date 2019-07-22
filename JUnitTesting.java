package timeClock;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * This class handles all JUnit test cases
 * for both Clock.java and TimeClockGUI.java.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen.
 *
 */
public class JUnitTesting {

	/**
	 * basic test for calcGrossEarnings.
	 */
	@Test
	public void testGEBasic() {
		Clock test = new Clock();
		assertEquals(1, test.calcGrossEarnings(1, 1));
	}

	/**
	 * basic test for calcGrossEarnings.
	 * testing with a negative input.
	 */
	@Test
	public void testGENeg() {
		Clock test = new Clock();
		assertEquals(-1, test.calcGrossEarnings(-1, 1));
	}
	
	/**
	 * basic test for calcNetEarnings.
	 */
	@Test
	public void testNEBasic() {
		Clock test = new Clock();
		assertEquals(81550, test.calcNetEarnings(100000));
	}
	
	/**
	 * Test 1 for AM to PM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoPM1() {
		Clock test = new Clock();
		assertEquals(8.00, test.calcTime(9, 00, 0, 5, 00, 1));
	}
	
	/**
	 * Test 2 for AM to PM calculation.
	 */
	@Test
	public void testCalcTimeAMtoPM2() {
		Clock test = new Clock();
		assertEquals(16.00, test.calcTime(5, 00, 0, 9, 00, 1));
	}
	
	/**
	 * Test 1 for resetting "day" at 12 AM.
	 */
	@Test
	public void testCalcTime12AMReset() {
		Clock test = new Clock();
		assertEquals(6.00, test.calcTime(12, 00, 0, 6, 00, 0));
	}
	
	/**
	 * Test 2 for resetting "day" at 12 AM.
	 */
	@Test
	public void testCalcTime12AMReset2() {
		Clock test = new Clock();
		assertEquals(3.00, test.calcTime(9, 00, 1, 12, 00, 0));
	}
	
	/**
	 * Test 1 for PM to PM time calculation.
	 */
	@Test
	public void testCalcTimePMtoPM1() {
		Clock test = new Clock();
		assertEquals(20.00, test.calcTime(9, 00, 1, 5, 00, 1));
	}
	
	/**
	 * Test 2 for PM to PM time calculation.
	 */
	@Test
	public void testCalcTimePMtoPM2() {
		Clock test = new Clock();
		assertEquals(4.00, test.calcTime(5, 00, 1, 9, 00, 1));
	}
	
	/**
	 * Test 1 for AM to AM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoAM1() {
		Clock test = new Clock();
		assertEquals(20.00, test.calcTime(9, 00, 0, 5, 00, 0));
	}
	
	/**
	 * Test 2 for AM to AM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoAM2() {
		Clock test = new Clock();
		assertEquals(4.00, test.calcTime(5, 00, 0, 9, 00, 0));
	}
	
	/**
	 * Basic Test for TimeClockGUI.
	 * Simply runs everything with default values.
	 */
	@Test
	public void testTimeClockGUIBasic() {
		TimeClockGUI test = new TimeClockGUI();
		test.setWeekDataArray();
		test.updateCalcHrs();
		test.updatePay();
	}
	
	/**
	 * Test 1 for updatePayRate method in
	 * TimeClockGUI.java.
	 * 
	 * Testing with empty string.
	 */
	@Test
	public void testTimeClockGUIPayRate1() {
		TimeClockGUI test = new TimeClockGUI();
		test.getPayRateDollars().setText("");
		test.updateCalcHrs();
		test.updatePay();
	}
	
	/**
	 * Test 2 for updatePayRate method in
	 * TimeClockGUI.java.
	 * 
	 * Testing with negative value string.
	 */
	@Test
	public void testTimeClockGUIPayRate2() {
		TimeClockGUI test = new TimeClockGUI();
		test.getPayRateDollars().setText("-1.00");
		test.updateCalcHrs();
		test.updatePay();
	}
	
	//ALL SET TO ZERO TEST
	
	/**
	 * Zero testing for AM to PM calcTime.
	 */
		@Test
		public void testCalcTimeAMPMErrorZeros() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Zero testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMErrorZeros() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Zero testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMErrorZeros() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, 0, 0, 0));
		}
		
		/**
		 * Zero Testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMErrorZeros() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, 0, 0, 1));
		}
		
		//IN HOUR BELOW 0 TEST
		
		/**
		 * Negative hour testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(-1, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Negative hour testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(-1, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Negative hour testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(-1, 0, 0, 0, 0, 0));
		}
		
		/**
		 * Negative hour testing for PM to PM calctime.
		 */
		@Test
		public void testCalcTimePMPMBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(-1, 0, 1, 0, 0, 1));
		}
		
		//IN HOUR ABOVE 12 TEST
		
		/**
		 * Hour higher than 12 testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMAboveTwelve() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(13, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Hour higher than 12 testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMAboveTwelve() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(13, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Hour higher than 12 testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMAboveTwelve() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(13, 0, 0, 0, 0, 0));
		} 
		
		/**
		 * Hour higher than 12 testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMAboveTwelve() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(13, 0, 1, 0, 0, 1));
		}
		
		//IN MINUTE BELOW 0 TESTS
		
		/**
		 * Negative minute testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, -1, 0, 12, 0, 1));
		}
		
		/**
		 * Negative minute testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, -1, 1, 12, 0, 0));
		}
		
		/**
		 * Negative minute testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, -1, 0, 12, 0, 0));
		}
		
		/**
		 * Negative minute testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteBelowZero() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, -1, 1, 12, 0, 1));
		} 
		
		
		//IN MINUTE ABOVE 59 TESTS
		
		/**
		 * Minute above 59 Testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteAboveFiftyNine() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 60, 0, 12, 0, 1));
		}
		
		/**
		 * Minute above 59 Testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteAboveFiftyNine() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 60, 1, 12, 0, 0));
		}
		
		/**
		 * Minute above 59 Testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteAboveFiftyNine() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 60, 0, 12, 0, 0));
		}  
		
		/**
		 * Minute above 59 Testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteAboveFiftyNine() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 60, 1, 12, 0, 1));
		}
		
		//OUT HOUR BELOW 1 TEST
		
		/**
		 * Negative Out hour AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, -1, 0, 1));
		}
		
		/**
		 * Negative Out hour PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, -1, 0, 0));
		}
		
		/**
		 * Negative Out hour AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, -1, 0, 0));
		}
		
		/**
		 * Negative Out hour PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, -1, 0, 1));
		}
		
		//OUT HOUR ABOVE 12 TEST
		
		/**
		 * Out hour above 12 for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMAboveTwelveOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, 13, 0, 1));
		}
		
		/**
		 * Out hour above 12 for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMAboveTwelveOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, 12, 0, 0));
		}
		
		/**
		 * Out hour above 12 for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMAboveTwelveOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 0, 13, 0, 0));
		}
		
		/**
		 * Out hour above 12 for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMAboveTwelveOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(0, 0, 1, 13, 0, 1));
		}
		
		//OUT MINUTE BELOW 0
		
		/**
		 * Negative out minute AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 0, 12, -1, 1));
		}
		
		/**
		 * Negative out minute PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 1, 12, -1, 0));
		}
		
		/**
		 * Negative out minute AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 0, 12, -1, 0));
		}
		
		/**
		 * Negative out minute PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteBelowZeroOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 1, 12, -1, 1));
		}
		
		//OUT MINUTE ABOVE 59
		
		/**
		 * Out minute above 59 AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteAboveFiftyNineOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 0, 12, 60, 1));
		}
		
		/**
		 * Out minute above 59 PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteAboveFiftyNineOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 1, 12, 60, 0));
		}
		
		/**
		 * Out minute above 59 AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteAboveFiftyNineOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 0, 12, 60, 0));
		}
		
		/**
		 * Out minute above 59 PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteAboveFiftyNineOUT() {
			Clock test = new Clock();
			assertEquals(0, test.calcTime(12, 0, 1, 12, 60, 1));
		}
		


	

}
