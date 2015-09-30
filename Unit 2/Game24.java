package logic;

import java.util.Scanner;

public class Game24 
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if (n <= 3)
			System.out.println("NO");
		else if (n % 2 != 0)
		{
			System.out.println("YES");
			
			for (int i = n; i > 5; i = i - 2)
			{
				System.out.println(i + " - " + (i - 1) + " = " + 1);
			}
			
			System.out.println("5 * 4 = 20");
			System.out.println("3 - 1 = 2");
			System.out.println("2 + 2 = 4");
			System.out.println("20 + 4 = 24");
			
			for (int i = n; i > 5; i = i - 2)
			{
				System.out.println(1 + " * " + 24 + " = " + 24);
			}

		}
		
		else
		{
			System.out.println("YES");
			
			for (int i = n; i > 4; i = i - 2)
			{
				System.out.println(i + " - " + (i - 1) + " = " + 1);

			}
				
			System.out.println("4 * 3 = 12");
			System.out.println("2 * 1 = 2");
			System.out.println("12 * 2 = 24");
			
			for (int i = n; i > 4; i = i - 2)
			{
				System.out.println(1 + " * " + 24 + " = " + 24);
			}
		
		
		}

	}
}
