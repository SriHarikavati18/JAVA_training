package package2;

import java.time.LocalDate;

public class ConvertStringToDate {

	public static void main(String[] args) {
	 String date="2022-12-22";//year-month-day
	 LocalDate localdate=LocalDate.parse(date);
	 System.out.println(localdate);
	 System.out.println("Day of the Month="+localdate.getDayOfMonth());
	 System.out.println("Day of the year="+localdate.getDayOfYear());
	
	}

}
