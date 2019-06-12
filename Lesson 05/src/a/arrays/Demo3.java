package a.arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		// 2 matrix array
		int[][] matrix1 = new int[5][9];
		matrix1[2][2] = 9;
		matrix1[4][1] = 7;
		for (int i = 0; i < matrix1.length; i++) {
			System.out.println(Arrays.toString(matrix1[i]));
		}

		System.out.println("=================");
		int[][] matrix2 = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 }, { 5, 5, 5 }, };
		for (int i = 0; i < matrix2.length; i++) {
			System.out.println(Arrays.toString(matrix2[i]));
		}

		System.out.println("=================");
		// 2 dimensional array
		int[][] arr1Dim = new int[5][];
		arr1Dim[0] = new int[9];
		arr1Dim[1] = new int[3];
		arr1Dim[2] = new int[11];
		arr1Dim[3] = new int[7];
		arr1Dim[4] = new int[5];

		for (int i = 0; i < arr1Dim.length; i++) {
			System.out.println(Arrays.toString(arr1Dim[i]));
		}

	}
}
