import java.util.Scanner;


public class PascalsTriangle 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tri[][] = new int [n][n];
		tri[0][0] = 1;
		
		for (int i = 1; i < n; i++)
		{
			for (int k = 0; k <= i; k++)
			{
				if (k == 0)
				{
					tri[i][k] = 1;
				}
				
				else
				{
					tri[i][k] = tri[i - 1][k - 1] + tri[i - 1][k]; 	
				}
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k <= i; k++)
			{
					System.out.print(tri[i][k] + " ");
			}
			
			System.out.println();
		}
	}

}
