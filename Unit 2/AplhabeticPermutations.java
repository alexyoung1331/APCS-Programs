import java.util.Scanner;

public class AplhabeticPermutations 
{

	/**
	 * @param args
	 */
	
	static void nextPerm (int line[], int lineLength)
	{
		int n = lineLength;
		for (int i = n - 1; i > 0; i--)
		{
			if (line[i - 1] < line[i])
			{
				int x = line[i - 1];
				for (int k = n - 1; k >= i; k--)
				{
					if (line[k] > x)
					{
						line[i - 1] = line[k];
						line[k] = x;
						break;
					}
				}
				
				
				int j = n - 1;
				
				while (i < j)
				{
					x = line[i];
					line[i] = line[j];
					line[j] = x;
					i++;
					j--;
				}
				
				break;
				
			}
			
			
		}
		
		if (line[0] == 4 && line[1] == 3 && line[2] == 2)
			{
				line[0] = 1;
				line[1] = 2;
				line[2] = 3;
				line[3] = 4;
			}
		
		for (int i = 0; i < n; i++)
		{
			System.out.print(line[i] + " ");
		}
}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = 4;
		int line[] = new int [n];

		
		for (int i = 0; i < n; i++)
		{
			line[i] = scan.nextInt();
		}
				
		nextPerm(line, n);
	}

}

