package a.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo5Map {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		System.out.println(map);

		System.out.println("B is: " + map.get('B'));
	}

}
