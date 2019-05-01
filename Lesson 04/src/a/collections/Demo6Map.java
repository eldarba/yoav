package a.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo6Map {

	public static void main(String[] args) {
		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("java", "a programming language");
		dictionary.put("red", "a color");
		dictionary.put("dog", "an animal");

		System.out.print("enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();

		System.out.println(word + ": " + dictionary.get(word));
	}

}
