package hackerrankQuestion.fidelity;

import java.util.Scanner;

public class Solution2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberOfElements = sc.nextInt();
		int ar[] = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++)
		{
			ar[i] = sc.nextInt();
		}

		int numberOfMoves = minMoves(ar);

		System.out.println("The minimum number of moves is " + numberOfMoves);

		for (int i : ar)
		{
			System.out.println(i);
		}

	}

	public static int minMoves(int ar[])
	{
		int beg = 0;
		int end = ar.length - 1;
		int count = 0;
		while (beg <= end)
		{
			if (ar[beg] % 2 != 0 && ar[end] % 2 == 0)
			{
				int x = ar[beg];
				ar[beg] = ar[end];
				ar[end] = x;
				beg++;
				end--;
				count++;
			}
			if (ar[beg] % 2 == 0)
			{
				beg++;
			}
			if (ar[end] % 2 != 0)
			{
				end--;
			}
		}
		return count;
	}
}
