package hackerrankQuestion.fidelity;

import java.util.Scanner;

public class Solution3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numberOfElements= sc.nextInt();
		int ar[]= new int[numberOfElements];
		for(int i=0;i<numberOfElements;i++)
		{
			ar[i]=sc.nextInt();
		}
		int maxDifference=getMaxDifference(ar);
		System.out.println("The resultant maximum difference is "+maxDifference);

	}

	public static int getMaxDifference(int ar[])
	{
		int curMin = ar[0];
		int resMin = -1;

		for (int i = 1; i < ar.length; i++)
		{
			if (ar[i] < curMin)
			{
				curMin = ar[i];
				continue;
			} else if (ar[i] > curMin)
			{
				int res = ar[i] - curMin;
				if (res > resMin)
				{
					resMin = res;
				}
			}
		}
		return resMin;
	}
}
