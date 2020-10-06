package MaximumTest;

import static org.junit.Assert.*;
import org.junit.Test;

class MaximumTestTest {
	@Test
	public void testMaximumNumber() {
		// TC2.1
		assertEquals((Float) 4.5f, MaximumTest.maxNumber(4.5f, 2.6f, -9.8f));
		// TC2.2
		assertEquals((Float) 4.5f, MaximumTest.maxNumber(2.6f, 4.5f, -9.8f));
		// TC2.3
		assertEquals((Float) 4.5f, MaximumTest.maxNumber(-9.8f, 2.6f, 4.5f));
	}
}
