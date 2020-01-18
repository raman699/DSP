package arrays;

import java.util.ArrayList;

public class MaximumNumberFromSide
{
	static int count;
	static ArrayList<Integer> numberOfElements(int height[], int n)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int max_so_far = 0;

		for (int i = n - 1; i >= 0; i--)
		{
			if (height[i] > max_so_far)
			{
				al.add(height[i]);
				max_so_far = height[i];
				count++;
			}
		}
		return al;
	}

	// Driver code
	public static void main(String args[])
	{
		int n = 6;
		int height[] = { 4, 8, 2, 0, 0, 5 };
		System.out.println(numberOfElements(height, n));
		System.out.println(count);

	}

}
