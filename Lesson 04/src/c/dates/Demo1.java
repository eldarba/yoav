package c.dates;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// 2 ways to express time

		// 1. machine time
		long ts = System.currentTimeMillis();
		System.out.println(ts);

		// 2. human time (date time)
		Date date = new Date();
		System.out.println(date);

		ts = 999999999;
		date = new Date(ts);
		System.out.println(date);

	}

}
