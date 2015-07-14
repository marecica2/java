package generics;

import java.util.Arrays;
import java.util.List;

public class Algorithm {
	public static <T extends Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
		T max = list.get(begin);
		for (T t : list) {
			if (t.compareTo(max) > 0) {
				max = t;
			}
		}
		return max;
	}

	public static void main(String... args) {
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Double> ds = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
		System.err.println(Algorithm.max(ints, 0, ints.size() - 1));
		System.err.println(Algorithm.max(ds, 0, ds.size() - 1));
	}
}
