package MaximumTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

class MaximumTestTest {
	@Test
	public void testMaxString() {
		// TC3.1
		assertEquals("Peach", MaximumTest.maxString("Peach", "Apple", "Banana"));
		// TC3.2
		assertEquals("Peach", MaximumTest.maxString("Apple", "Peach", "Banana"));
		// TC3.3
		assertEquals("Peach", MaximumTest.maxString("Banana", "Apple", "Peach"));
	}
}
