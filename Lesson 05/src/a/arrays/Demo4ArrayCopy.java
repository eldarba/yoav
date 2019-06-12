package a.arrays;

import java.util.Arrays;

public class Demo4ArrayCopy {

	public static void main(String[] args) {

		int[] grades = { 100, 80, 95 };

		System.out.println("grades: " + Arrays.toString(grades));

		int[] temp = new int[grades.length + 2];
		System.arraycopy(grades, 0, temp, 0, grades.length);
		// System.out.println("grades: " + Arrays.toString(temp));
		grades = temp;
		grades[3] = 9;
		grades[4] = 8;
		System.out.println("grades: " + Arrays.toString(grades));

	}

}
