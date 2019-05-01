package a.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		while (set.size() < 10) {
			set.add((int) (Math.random() * 11));
		}
		System.out.println(set);
	}
}
