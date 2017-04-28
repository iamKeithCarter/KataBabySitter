import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BabySitterTest {
	@Test
	public void whenSitterPassedStartTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(6,underTest.setStartTime(6));
	}
	
	@Test
	public void whenSitterPassedAnyStartTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(3,underTest.setStartTime(3));
	assertEquals(11,underTest.setStartTime(11));
	}
	
	@Test
	public void whenSitterPassedAnyEndTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(4,underTest.setEndTime(4));
	assertEquals(7,underTest.setEndTime(7));
	}
	
	@Test
	public void whenSitterPassedBedTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(8,underTest.setBedTime(8));
	assertEquals(12,underTest.setBedTime(12));
	}
	
	@Test
	public void whenGivenAStartAndBedtimeItfindsTheHoursWorkedBeforeBedTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(4,underTest.calculateHoursBeforeBedtime(10,6));
	assertEquals(1,underTest.calculateHoursBeforeBedtime(2,11));
	}
	
	@Test
	public void whenGivenABedtimeAndEndTimeItfindsTheHoursWorkedAfterBedtimeButBeforeMidnight() {
	BabySitter underTest = new BabySitter();
	assertEquals(4,underTest.calculateHoursAfterBedtimeButBeforeMidnight(8,12));
	assertEquals(0,underTest.calculateHoursAfterBedtimeButBeforeMidnight(1,4));
	}
	
	@Test
	public void whenGivenAStartAndEndTimeItfindsTheHoursWorkedAfterMidnight() {
	BabySitter underTest = new BabySitter();
	assertEquals(3,underTest.calculateHoursAfterMidnight(8,3));
	assertEquals(2,underTest.calculateHoursAfterMidnight(1,3));
	}
	
	@Test
	public void whenGivenStartTimeEndTimeAndBedTimeCalulatePay() {
	BabySitter underTest = new BabySitter();
	assertEquals(100,underTest.calculatePay(5,8,2));


	
	}
}

