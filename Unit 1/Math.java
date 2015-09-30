package math;

public class Math 
{

	public static double addition(double number1, double number2) 
	{
		double answer = number1 + number2;
		return answer;
	}

	public static double subtraction(double number1, double number2) 
	{
		double answer = number1 - number2;
		return answer;
	}
	
	public static double multiplication(double number1, double number2) 
	{
		double answer = number1 * number2;
		return answer;
	}
	
	public static double division(double number1, double number2) 
	{
		double answer = number1 / number2;
		return answer;
	}
	
	public static double exponent(double number1, double power) 
	{
		double answer = number1;
		for (int i = 0; i < power; i++)
		{
			answer = answer*number1;
		}
		return answer;
	}
	
	public static double absoluteValue (double number1)
	{
		if (number1 < 0)
			number1 = -number1;
		return number1;
	}
	
	public static double SquareRoot(double number1) 
	{
		double answer = number1;
	    double epsilon = 1e-15;                
	    
	        while (absoluteValue(answer - number1/answer) > epsilon*answer) 
	        {
	        	answer = (number1/answer + answer) / 2.0;
	        }
	          
		return answer;
	}
		
}
