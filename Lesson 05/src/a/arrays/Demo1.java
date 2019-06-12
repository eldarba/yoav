package a.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// array of primitive elements
		int[] arr1 = new int[5];
		arr1[0] = 55;
		System.out.println(Arrays.toString(arr1));

		char[] arr2 = { 'A', 'C', 'à', '-' };
		System.out.println(Arrays.toString(arr2));

		// create an array of Hebrew alfabet
		char[] otiot = new char['ú' - 'à' + 1];
		for (int i = 0, c = 'à'; i < otiot.length; i++, c++) {
			otiot[i] = (char) c;
		}
		System.out.println(Arrays.toString(otiot));

		for (int i = 0; i < otiot.length; i++) {
			char curr = otiot[i];
			System.out.println(curr + " - " + (int) curr);
		}

	}

}
