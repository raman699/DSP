package arrays;

import java.util.ArrayList;

public class LeadersInAnArray
{

	static int count;

	public static ArrayList<Integer> getLeaders(int ar[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		int max =0;
		for (int i = ar.length - 1; i >= 0; i--)
		{
			if (ar[i] > max)
			{
				al.add(ar[i]);
				max = ar[i];
				count++;
			}
		}
		return al;
	}
	
	public static void main(String args[])
	{
		int n = 6;
		int ar[] = { 4, 8, 2, 0, 6, 5 };
		System.out.println(getLeaders(ar));
		System.out.println(count);

	}
}
