package logic;

import java.util.Scanner;

public class PrimeCounter 
{

	/**
	 * @param args
	 */
	
	public static int countPrimes(int n)
	{
		int count = 0;
		for (int i = 2; i <= n; i++)
		{
			for (int z = 2; z <= i; z++)
			{
				if (i == z)
					count = count +1;
				if (i % z == 0)
					break;
				
			}
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(countPrimes(num));

	}

}
