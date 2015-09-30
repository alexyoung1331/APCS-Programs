import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList246 
{

	/**
	 * @param args
	 */
	
	
	private static void organizeArray(ArrayList <Integer> a)
	{
		int x = a.size();
		for (int i = 0; i < x; i++)
		{
			int value = a.get(i);
			a.add(value * 2);	
		}
		
		for (int i = 0; i < x; i++)
		{
			int y = a.get(i);
			a.set(i, a.get(x + i));
			a.set(x + i, y);
		}

			System.out.print(a);
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList <Integer> a = new ArrayList<Integer> ();
		
		for (int i = 0; i < n; i++)
		{
			a.add(scan.nextInt());
		}
		
		organizeArray(a);


	}

}
