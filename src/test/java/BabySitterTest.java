import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BabySitterTest {
	@Test
	public void whenSitterPassedStartTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(6,underTest.determineStartTime(6));
	}
	
	@Test
	public void whenSitterPassedAnyStartTimeItReturnsThatTime() {
	BabySitter underTest = new BabySitter();
	assertEquals(3,underTest.determineStartTime(3));
	assertEquals(11,underTest.determineStartTime(11));
	}
}

