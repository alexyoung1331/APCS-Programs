import java.util.Scanner;


public class MatrixMultiplication 
{

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) 
	{
		//Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		
		int[][] array1 = new int[][] {{2,0},{1,1}};
		int[][] array2 = new int[][] {{0,6,3},{0,5,0}};
		int[][] finalArray = new int[array1.length][array2[0].length];
		
		/*for (int i = 0; i < array1.length; i ++)
		{
			for (int j = 0; j < array1[0].length; j++)
			{
				array1[i][j] = j + 1;
			}
		}
		
		for (int i = 0; i < array2.length; i ++)
		{
			for (int j = 0; j < array2[0].length; j++)
			{
				array2[i][j] = j + 1;
			}
		}*/
		
		
		if (array1[0].length == array2.length)
		{
				for (int i = 0; i < array1.length; i++)
				{
					for (int j = 0; j < array2[0].length; j++)
					{
						for (int k = 0; k < array1[0].length; k++)
						{
							finalArray[i][j] += (array1[i][k] * array2[k][j]);
						}
					}
				}
		}
		
		else
			System.out.println("The matricies can not be multiplied together");
		
		for (int i = 0; i < array1.length; i ++)
		{
			for (int j = 0; j < array1[0].length; j++)
			{
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < array2.length; i ++)
		{
			for (int j = 0; j < array2[0].length; j++)
			{
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < finalArray.length; i ++)
		{
			for (int j = 0; j < finalArray[0].length; j++)
			{
				System.out.print(finalArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
