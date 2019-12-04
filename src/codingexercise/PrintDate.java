package codingexercise;

import java.util.Calendar;

public class PrintDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int year=cal.get(Calendar.YEAR); 
		System.out.println(year);
		int month=cal.get(Calendar.MONTH);
		System.out.println(month);
		int monthday=cal.get(Calendar.MONDAY);
		System.out.print(monthday);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int hour=cal.get(Calendar.HOUR);
		System.out.println(hour);
		int tw_hour=cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(tw_hour);
		int minute=cal.get(Calendar.MINUTE);
		System.out.println(minute);
		int second=cal.get(Calendar.SECOND); 
		System.out.println(second);
	}

}
