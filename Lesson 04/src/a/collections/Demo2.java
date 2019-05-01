package a.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(1);
		System.out.println(set);

		System.out.println("size=" + set.size());
		// System.out.println("third element: " + set.get(2));
		System.out.println("removing first instance of 0");
		set.remove(0);
		System.out.println(set);
		System.out.println("replace the fiest element");
		// set.set(0, 10);
		// System.out.println(set);
	}

}
