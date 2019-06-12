package a.arrays;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo2 {

	public static void main(String[] args) {

		// array of objects
		String[] arr1 = new String[5];
		arr1[2] = "aaa";
		System.out.println(Arrays.toString(arr1));

		// static initialization
		String[] arr2 = { "aaa", "bbb", "ccc" };
		System.out.println(Arrays.toString(arr2));

		Date[] arr3 = new Date[3];
		arr3[0] = new Date(); // now
		arr3[1] = new Date(System.currentTimeMillis() - (1000 * 60 * 60 * 24)); // yesterday
		arr3[2] = new GregorianCalendar(1980, Calendar.MAY, 25).getTime();

		System.out.println(Arrays.toString(arr3));

	}

}
