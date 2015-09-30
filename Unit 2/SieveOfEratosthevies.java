import java.util.Scanner;


public class SieveOfEratosthevies 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean[] list = new boolean[n + 2];
		for (int i  = 2; i < n + 1; i++)
		{
			if (!list[i])
			{
				for(int j = (i * i); j < n + 1; j = j + i)
				{
					list[j] = true;
				}
			}
		}
		
		for (int i = 2; i < n + 1; i++)
		{
			if (list[i] == false)
			{
				System.out.print(i + " ");
			}
		}

	}

}
