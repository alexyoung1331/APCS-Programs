import java.util.Scanner;


public class Elections2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int numCandidates = scan.nextInt();
		int numCities = scan.nextInt();
		int[] numCitiesWon = new int [numCandidates];
		int bestCandidate = 0;
		
		for (int i = 0; i < numCities; i++)
		{
			double bestVal = Double.NEGATIVE_INFINITY;
			
			for (int j = 0; j < numCandidates; j++)
			{
				int candidate = scan.nextInt();
				if (candidate > bestVal)
				{
					bestVal = candidate;
					bestCandidate = j;
				}
			}
			numCitiesWon[bestCandidate] += 1;
			
		}

		
		double mostCities = Double.NEGATIVE_INFINITY;
		int winner = 0;
		for (int j = 0; j < numCandidates; j++)
		{
			if (numCitiesWon[j] > mostCities)
			{
				mostCities = numCitiesWon[j];
				winner = j + 1;
			}
		}
		
		System.out.println(winner);
	}
	

}
