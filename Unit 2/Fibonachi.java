package logic;

import java.util.Scanner;

public class Fibonachi {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		long num1 = 1;
		long  num2 = 1;
		long answer = 1;
		
		System.out.println("Enter what number in the squence you want: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 2; i < n; i++)
		{
			long x = num2;
			num2 = num1+ num2;
			num1 = x;
			answer = num2;
		}
		
		System.out.println(answer);

	}

}
