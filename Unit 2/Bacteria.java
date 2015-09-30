import java.util.Scanner;


public class Bacteria 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int numBacteria = 0;
		while(n > 0)
		{
			if (n % 2 == 1)
				numBacteria++;
			n = n / 2;
		}
		
		System.out.println(numBacteria);
	}

}
