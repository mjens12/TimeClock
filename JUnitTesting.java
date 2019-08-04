package punchclock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


/**
 * This class handles all JUnit test cases
 * for both Week.java and PunchWeekGUI.java.
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
		Money test = new Money();
		assertEquals(1, test.calcGrossEarnings(1, 1, 0));
	}

	/**
	 * basic test for calcGrossEarnings.
	 * testing with a negative input.
	 */
	@Test
	public void testGENeg() {
		Money test = new Money();
		assertEquals(-1, test.calcGrossEarnings(-1, 1, 0));
	}
	
	/**
	 * basic test for calcNetEarnings.
	 */
	@Test
	public void testNEBasic() {
		Money test = new Money();
		test.taxAmounts(0.0, 0.0, 0.0, 0.0, 100000);
	}
	
	/**
	 * Test 1 for AM to PM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoPM1() {
		Week test = new Week();
		assertEquals(8.00, test.calcTime(9, 00, 0, 5, 00, 1));
	}
	
	/**
	 * Test 2 for AM to PM calculation.
	 */
	@Test
	public void testCalcTimeAMtoPM2() {
		Week test = new Week();
		assertEquals(16.00, test.calcTime(5, 00, 0, 9, 00, 1));
	}
	
	/**
	 * Test 1 for resetting "day" at 12 AM.
	 */
	@Test
	public void testCalcTime12AMReset() {
		Week test = new Week();
		assertEquals(6.00, test.calcTime(12, 00, 0, 6, 00, 0));
	}
	
	/**
	 * Test 2 for resetting "day" at 12 AM.
	 */
	@Test
	public void testCalcTime12AMReset2() {
		Week test = new Week();
		assertEquals(3.00, test.calcTime(9, 00, 1, 12, 00, 0));
	}
	
	/**
	 * Test 1 for PM to PM time calculation.
	 */
	@Test
	public void testCalcTimePMtoPM1() {
		Week test = new Week();
		assertEquals(20.00, test.calcTime(9, 00, 1, 5, 00, 1));
	}
	
	/**
	 * Test 2 for PM to PM time calculation.
	 */
	@Test
	public void testCalcTimePMtoPM2() {
		Week test = new Week();
		assertEquals(4.00, test.calcTime(5, 00, 1, 9, 00, 1));
	}
	
	/**
	 * Test 1 for AM to AM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoAM1() {
		Week test = new Week();
		assertEquals(20.00, test.calcTime(9, 00, 0, 5, 00, 0));
	}
	
	/**
	 * Test 2 for AM to AM time calculation.
	 */
	@Test
	public void testCalcTimeAMtoAM2() {
		Week test = new Week();
		assertEquals(4.00, test.calcTime(5, 00, 0, 9, 00, 0));
	}
	
	/**
	 * Basic Test for PunchWeekGUI.
	 * Simply runs everything with default values.
	 */
	@Test
	public void testPunchWeekGUIBasic() {
		PunchClockGUI test = new PunchClockGUI();
		test.setWeekDataArray();
		test.updateCalcHrs();
		test.updatePay();
	}
	
	/**
	 * Test 1 for updatePayRate method in
	 * PunchWeekGUI.java.
	 * 
	 * Testing with empty string.
	 */
	@Test
	public void testPunchWeekGUIPayRate1() {
		PunchClockGUI test = new PunchClockGUI();
		test.getPayRateDollars().setText("");
		test.updateCalcHrs();
		test.updatePay();
	}
	
	/**
	 * Test 2 for updatePayRate method in
	 * PunchWeekGUI.java.
	 * 
	 * Testing with negative value string.
	 */
	@Test
	public void testPunchWeekGUIPayRate2() {
		PunchClockGUI test = new PunchClockGUI();
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
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Zero testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMErrorZeros() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Zero testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMErrorZeros() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, 0, 0, 0));
		}
		
		/**
		 * Zero Testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMErrorZeros() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, 0, 0, 1));
		}
		
		//IN HOUR BELOW 0 TEST
		
		/**
		 * Negative hour testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(-1, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Negative hour testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(-1, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Negative hour testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(-1, 0, 0, 0, 0, 0));
		}
		
		/**
		 * Negative hour testing for PM to PM calctime.
		 */
		@Test
		public void testCalcTimePMPMBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(-1, 0, 1, 0, 0, 1));
		}
		
		//IN HOUR ABOVE 12 TEST
		
		/**
		 * Hour higher than 12 testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMAboveTwelve() {
			Week test = new Week();
			assertEquals(0, test.calcTime(13, 0, 0, 0, 0, 1));
		}
		
		/**
		 * Hour higher than 12 testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMAboveTwelve() {
			Week test = new Week();
			assertEquals(0, test.calcTime(13, 0, 1, 0, 0, 0));
		}
		
		/**
		 * Hour higher than 12 testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMAboveTwelve() {
			Week test = new Week();
			assertEquals(0, test.calcTime(13, 0, 0, 0, 0, 0));
		} 
		
		/**
		 * Hour higher than 12 testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMAboveTwelve() {
			Week test = new Week();
			assertEquals(0, test.calcTime(13, 0, 1, 0, 0, 1));
		}
		
		//IN MINUTE BELOW 0 TESTS
		
		/**
		 * Negative minute testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, -1, 0, 12, 0, 1));
		}
		
		/**
		 * Negative minute testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, -1, 1, 12, 0, 0));
		}
		
		/**
		 * Negative minute testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, -1, 0, 12, 0, 0));
		}
		
		/**
		 * Negative minute testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteBelowZero() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, -1, 1, 12, 0, 1));
		} 
		
		
		//IN MINUTE ABOVE 59 TESTS
		
		/**
		 * Minute above 59 Testing for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteAboveFiftyNine() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 60, 0, 12, 0, 1));
		}
		
		/**
		 * Minute above 59 Testing for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteAboveFiftyNine() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 60, 1, 12, 0, 0));
		}
		
		/**
		 * Minute above 59 Testing for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteAboveFiftyNine() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 60, 0, 12, 0, 0));
		}  
		
		/**
		 * Minute above 59 Testing for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteAboveFiftyNine() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 60, 1, 12, 0, 1));
		}
		
		//OUT HOUR BELOW 1 TEST
		
		/**
		 * Negative Out hour AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, -1, 0, 1));
		}
		
		/**
		 * Negative Out hour PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, -1, 0, 0));
		}
		
		/**
		 * Negative Out hour AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, -1, 0, 0));
		}
		
		/**
		 * Negative Out hour PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, -1, 0, 1));
		}
		
		//OUT HOUR ABOVE 12 TEST
		
		/**
		 * Out hour above 12 for AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMAboveTwelveOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, 13, 0, 1));
		}
		
		/**
		 * Out hour above 12 for PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMAboveTwelveOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, 12, 0, 0));
		}
		
		/**
		 * Out hour above 12 for AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMAboveTwelveOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 0, 13, 0, 0));
		}
		
		/**
		 * Out hour above 12 for PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMAboveTwelveOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(0, 0, 1, 13, 0, 1));
		}
		
		//OUT MINUTE BELOW 0
		
		/**
		 * Negative out minute AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 0, 12, -1, 1));
		}
		
		/**
		 * Negative out minute PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 1, 12, -1, 0));
		}
		
		/**
		 * Negative out minute AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 0, 12, -1, 0));
		}
		
		/**
		 * Negative out minute PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteBelowZeroOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 1, 12, -1, 1));
		}
		
		//OUT MINUTE ABOVE 59
		
		/**
		 * Out minute above 59 AM to PM calcTime.
		 */
		@Test
		public void testCalcTimeAMPMMinuteAboveFiftyNineOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 0, 12, 60, 1));
		}
		
		/**
		 * Out minute above 59 PM to AM calcTime.
		 */
		@Test
		public void testCalcTimePMAMinuteAboveFiftyNineOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 1, 12, 60, 0));
		}
		
		/**
		 * Out minute above 59 AM to AM calcTime.
		 */
		@Test
		public void testCalcTimeAMAMMinuteAboveFiftyNineOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 0, 12, 60, 0));
		}
		
		/**
		 * Out minute above 59 PM to PM calcTime.
		 */
		@Test
		public void testCalcTimePMPMMinuteAboveFiftyNineOUT() {
			Week test = new Week();
			assertEquals(0, test.calcTime(12, 0, 1, 12, 60, 1));
		}
		
		/**
		 * Export to .txt file.
		 */
		@Test
		public void testExport() {
			PunchClockGUI test = new PunchClockGUI();
			test.textOut("test");
		}
		
		/**
		 * Test set/get OT.
		 */
		@Test
		public void testOvertime() {
			Money test = new Money();
			test.setOT(true);
			assertEquals(true, test.getOT());
		}
		
		/**
		 * Test set/get OT.
		 */
		@Test
		public void testOvertime2() {
			Money test = new Money();
			test.setOT(false);
			assertEquals(false, test.getOT());
		}
		
		/**
		 * Test Currency Conversion USD.
		 */
		@Test
		public void testUSD() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 0);
		}
		
		/**
		 * Test Currency Conversion Euro.
		 */
		@Test
		public void testEuro() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 1);
		}
		
		/**
		 * Test Currency Conversion Yen.
		 */
		@Test
		public void testYen() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 2);
		}
		
		/**
		 * Test Currency Conversion Pound.
		 */
		@Test
		public void testPound() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 3);
		}
		
		/**
		 * Test Currency Conversion AUD.
		 */
		@Test
		public void testAUD() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 4);
		}
		
		/**
		 * Test Currency Conversion CAD.
		 */
		@Test
		public void testCAD() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 5);
		}
		
		/**
		 * Test Currency Conversion Peso.
		 */
		@Test
		public void testPeso() {
			Money test = new Money();
			test.calcGrossEarnings(1, 10, 6);
		}
		
		/**
		 * Test time condition for OT.
		 */
		@Test
		public void testOT3() {
			Money test = new Money();
			test.setOT(true);
			test.calcGrossEarnings(41.0, 1.0, 0);
		}

		
		/**
		 * Testing PM selection with setWeekDataArray.
		 */
		@Test
		public void testPMSetWeekData() {
			PunchClockGUI test = new PunchClockGUI();
			
			test.getSunInAMPMBox().setSelectedItem("PM");
			test.getSunOutAMPMBox().setSelectedItem("PM");
			test.getMonInAMPMBox().setSelectedItem("PM");
			test.getMonOutAMPMBox().setSelectedItem("PM");
			test.getTuesInAMPMBox().setSelectedItem("PM");
			test.getTuesOutAMPMBox().setSelectedItem("PM");
			test.getWedInAMPMBox().setSelectedItem("PM");
			test.getWedOutAMPMBox().setSelectedItem("PM");
			test.getThursInAMPMBox().setSelectedItem("PM");
			test.getThursOutAMPMBox().setSelectedItem("PM");
			test.getFriInAMPMBox().setSelectedItem("PM");
			test.getFriOutAMPMBox().setSelectedItem("PM");
			test.getSatInAMPMBox().setSelectedItem("PM");
			test.getSatOutAMPMBox().setSelectedItem("PM");
			
			test.setWeekDataArray();
			
			test.textOut("test");
		}
		
		/**
		 * Test for main.
		 */
		@Test
		public void testMain() {
			 String[] args = null;
			
			 PunchClockGUI.main(args);
			
		}
		
		/**
		 * Enable/Disable Days Test.
		 */
		@Test
		public void testEnableDisable() {
			PunchClockGUI test = new PunchClockGUI();
			
			test.reset();
		}


	

}
