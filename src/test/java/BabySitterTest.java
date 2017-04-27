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
	
	}
	
	
}

