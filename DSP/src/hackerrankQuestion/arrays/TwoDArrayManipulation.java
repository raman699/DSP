package hackerrankQuestion.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayManipulation
{

	static int[] getColumnElements(int[][] ar, int rows, int columnNumber)
	{
		int ra[] = new int[rows];
		for (int i = 0; i < rows; i++)
		{
			ra[i] = ar[i][columnNumber];
		}
		return ra;
	}

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries)
	{

		int[] firstIndexArray = getColumnElements(queries, queries.length, 0);
		int[] secondIndexArray = getColumnElements(queries, queries.length, 1);
		int[] valueArray = getColumnElements(queries, queries.length, 2);

		int[] nArray = new int[n+1];

		int length = firstIndexArray.length;
		// int secondLength= secondIndexArray.length;
		// int
		int max = -1;
		for (int i = 0; i < length; i++)
		{
			int firstIndex = firstIndexArray[i];
			int secondIndex = secondIndexArray[i];
			int value = valueArray[i];
			for (int j = firstIndex; j <= secondIndex; j++)
			{
				nArray[j] = nArray[j] + value;
				if (nArray[j] > max)
				{
					max = nArray[j];
				}
			}
		}
		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException
	{

		String[] nm = scanner.nextLine().split(" ");

		int n = Integer.parseInt("5");

		int m = Integer.parseInt("3");

	///	int[][] queries = new int[m][3];
		int queries[][] = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };

//		for (int i = 0; i < m; i++)
//		{
//			String[] queriesRowItems = scanner.nextLine().split(" ");
//			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//			for (int j = 0; j < 3; j++)
//			{
//				int queriesItem = Integer.parseInt(queriesRowItems[j]);
//				queries[i][j] = queriesItem;
//			}
//		}

		long result = arrayManipulation(n, queries);
		System.out.println(result);

		scanner.close();
	}

}
