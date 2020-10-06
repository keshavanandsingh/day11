package MaximumTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MaximumTest<T extends Comparable<T>> {
	List<T> list = new ArrayList<>();

	public MaximumTest(T... parameters) {
		for (T t : parameters)
			this.list.add(t);
	}

	public T maximum() {
		return MaximumTest.maximum(list);
	}

	public static <T extends Comparable<T>> T maximum(List<T> list) {
		try {
			return Collections.max(list);
		} catch (NoSuchElementException e) {
			System.err.println("There is no element. Pass atleast one element.");
			return null;
		}
	}
}
