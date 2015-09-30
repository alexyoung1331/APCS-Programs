package calendar;

import java.util.Scanner;

public class MainCalendar 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numTests = scan.nextInt();
		for(int i = 0; i < numTests; i++)
		{
			int day = scan.nextInt();
			int month = scan.nextInt();
			int year = scan.nextInt();
			MyCalendar calendar = new MyCalendar(day, month, year);
			calendar.setDate();
			String dayOfWeek = calendar.getDayOfWeek();
			System.out.println(dayOfWeek);
		}
		scan.close();

	}

}
