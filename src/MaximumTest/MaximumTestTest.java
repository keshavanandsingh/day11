package MaximumTest;

import static org.junit.Assert.*;
import org.junit.Test;

class MaximumTestTest {
	@Test
	public void testMaximumNumber() {
		assertEquals((Integer) 4, MaximumTest.maxNumber(2, 4, -9));
	}

}
