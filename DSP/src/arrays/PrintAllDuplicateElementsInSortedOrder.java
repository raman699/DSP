package arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PrintAllDuplicateElementsInSortedOrder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the array Elements");
		for (int i = 0; i < n; i++)
		{
			ar[i] = sc.nextInt();
		}
		print(ar);
	}

	public static void print(int ar[])
	{
		HashSet<Integer> hs= new HashSet<>();
		TreeSet<Integer>  ts= new TreeSet<>();
		for(int i:ar)
		{
			boolean check=hs.add(i);
			if(!check)
			{
				ts.add(i);
			}
		}
		//printing the required elements
		for(int i:ts)
		{
			System.out.print(i+" ");
		}
		
	}
}
