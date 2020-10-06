package MaximumTest;

import static org.junit.Assert.*;
import org.junit.Test;

class MaximumTestTest {
	MaximumTest maximumTest;

	@Test
	public void testMaximumInteger() {
		maximumTest = new MaximumTest<>(2, 8, -12);
		assertEquals(8, maximumTest.maximum());
	}

	@Test
	public void testMaximumFloat() {
		maximumTest = new MaximumTest<>(4.5f, 2.6f, -9.8f);
		assertEquals(4.5f, maximumTest.maximum());
	}

	@Test
	public void testMaxString() {
		maximumTest = new MaximumTest<>("Banana", "Apple", "Peach");
		assertEquals("Peach", maximumTest.maximum());
	}

}
