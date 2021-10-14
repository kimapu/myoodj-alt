package solution.tut6.demo;

import java.time.LocalDate;

public class MyDate {

	private LocalDate now;
	
	private int day, month, year;
	
	public MyDate() {
		now = LocalDate.now();
		day = now.getDayOfMonth();
		month = now.getMonthValue();
		year = now.getYear();
	}

	public LocalDate getNow() {
		return now;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
}
