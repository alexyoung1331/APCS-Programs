package variables;

public class VariablesTest 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double x = .2;
		double y = .1;
		double epsilon = Math.pow(1.0, -9);
		System.out.print(Math.abs(x + y - .3) <= epsilon);
	}

}
