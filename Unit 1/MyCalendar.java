package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar 
{

	public MyCalendar() 
	{
		
	}
	
	public MyCalendar(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDate()
	{
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, day);
	}
	
	public String getDayOfWeek()
	{
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.SUNDAY)
			return "Sunday";
		else if (dayOfWeek == Calendar.MONDAY)
			return "Monday";
		else if (dayOfWeek == Calendar.TUESDAY)
			return "Tuesday";
		else if (dayOfWeek == Calendar.WEDNESDAY)
			return "Wednesday";
		else if (dayOfWeek == Calendar.THURSDAY)
			return "Thursday";
		else if (dayOfWeek == Calendar.FRIDAY)
			return "Friday";
		else
			return "Saturday";
		
	}

	

private int day;
private int month;
private int year;
private Calendar calendar = new GregorianCalendar();
}
