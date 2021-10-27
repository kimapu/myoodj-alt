package solution.tut6.q1;

import java.time.LocalDate;

public class MyDate {

	public int year, month, day;

	public MyDate() {
		super();
		LocalDate now = LocalDate.now();
		System.out.println( now.toString() );
		this.year = now.getYear();
		this.month = now.getMonth().getValue();
		this.day = now.getDayOfMonth();
	}
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	
}
