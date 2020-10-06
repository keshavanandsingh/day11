package MaximumTest;

public class MaximumTest {
	@Test
	public void testMaximum() {
		assertEquals((Integer) 6, MaximumTest.maximum(4, 6, -9));
		assertEquals((Float) 4.5f, MaximumTest.maximum(4.5f, 2.6f, -9.8f));
		assertEquals("Peach", MaximumTest.maximum("Banana", "Apple", "Peach"));
	}

}
