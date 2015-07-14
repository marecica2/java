package generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class Algorithm2 {
	public static <T> int count(Collection<T> collection, Predicate<T> expression) {
		int count = 0;
		for (T t : collection) {
			if (expression.test(t))
				++count;
		}
		return count;
	}

	public static void main(String... args) {
		Collection<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Predicate<Integer> odd = t -> t % 2 > 0;
		System.err.println(Algorithm2.count(ints, odd));
	}
}
