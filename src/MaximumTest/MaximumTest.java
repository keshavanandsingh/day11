package MaximumTest;

public class MaximumTest<T extends Comparable<T>> {
	T a, b, c;

	public MaximumTest(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T maximum() {
		return MaximumTest.maximum(a, b, c);
	}

	public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
}
