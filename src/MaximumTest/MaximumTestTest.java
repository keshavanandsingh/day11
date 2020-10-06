package MaximumTest;

import static org.junit.Assert.*;
import org.junit.Test;

class MaximumTestTest {
	MaximumTest maximumTest;

	@Test
	public void testMaximumInteger() {
		// taking 5 parameters in
		maximumTest = new MaximumTest<>(2, 8, -12, 61, 9);
		assertEquals(61, maximumTest.maximum());
	}

	@Test
	public void testMaximumFloat() {
		// taking 4 parameters in
		maximumTest = new MaximumTest<>(4.5f, 2.6f, -9.8f, 2.1f);
		assertEquals(4.5f, maximumTest.maximum());
	}

	@Test
	public void testMaxString() {
		// taking 2 parameters in
		maximumTest = new MaximumTest<>("Mango", "Peach");
		assertEquals("Peach", maximumTest.maximum());
	}

	@Test
	public void testMaximumWithNoElement() {
		// taking no parameter
		// should return null instead of throwing an error
		maximumTest = new MaximumTest<>();
		assertEquals(null, maximumTest.maximum());
	}
	
}
