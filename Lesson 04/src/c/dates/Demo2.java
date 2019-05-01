package c.dates;

import java.util.Calendar;
import java.util.Date;

public class Demo2 {

	public static void main(String[] args) {
		// create a calendar instance
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		// set the date time
		cal.set(1980, Calendar.MARCH, 25, 0, 0, 0);
		// convert to java.util.Date
		Date date = cal.getTime();
		System.out.println(date);

		System.out.println("add 10 days");
		// set the calendar from the java.util.Date
		cal.setTime(date);
		// add 10 days to the calendar
		cal.add(Calendar.DAY_OF_YEAR, 10);
		// convert to java.util.Date
		date = cal.getTime();
		System.out.println(date);

	}
}
