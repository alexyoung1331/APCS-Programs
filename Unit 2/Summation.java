package logic;

public class Summation 
{

	/**
	 * @param args
	 */
	
	public static long summation(int n)
	{
		long answer = 0;
		for (int i = 1; i <= n; i++)
		{
			answer = answer + i;
		}
		
		return answer;
	}
	public static void main(String[] args) 
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.println(summation(i));
		}
	}

}
