import java.util.Scanner;


public class StringsInParenthese 
{

	/**
	 * @param args
	 */
	
	static String getExp(String str, int i)
	{
		int count = 1;
		int z = i;
		
		for (int x = i + 1; i < str.length(); x++)
		{
			if (str.charAt(x) == '(')
			{
				count++;
			}
			
			else if (str.charAt(x) == ')')
			{
				count--;
			}
			
			if (count == 0)
			{
				z = x;
				break;
			}
		}
		
		return str.substring(i, z + 1);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		
		System.out.println(getExp(str1, 5));

	}

}
