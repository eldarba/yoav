package a.arrays;

import java.util.Arrays;

public class Tar1 {

	public static void main(String[] args) {
		int math = 0;
		int english = 1;
		int programming = 2;

		int numOfStudents = 10;
		int numOfGrades = 3;

		int[][] stdentsGrades = new int[numOfStudents][numOfGrades];

		for (int i = 0; i < stdentsGrades.length; i++) {
			for (int j = 0; j < stdentsGrades[i].length; j++) {
				stdentsGrades[i][j] = (int) (Math.random() * 31) + 70;
			}
			System.out.println("student grades: " + Arrays.toString(stdentsGrades[i]));
		}

		int studentNumber = 1;
		int subject = programming;
		System.out.println("grade: " + stdentsGrades[studentNumber - 1][subject]);
	}

}
