package a.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(1);
		System.out.println(list);

		System.out.println("size=" + list.size());
		System.out.println("third element: " + list.get(2));
		System.out.println("removing first element");
		list.remove(0);
		list.remove(new Integer(0));
		System.out.println(list);
		System.out.println("replace the fiest element");
		list.set(0, 10);
		System.out.println(list);
	}

}
