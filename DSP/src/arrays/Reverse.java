package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// bad approach
//use two pinters
public class Reverse
{

	public static void main(String[] args)
	{
		int ar[] = { 1, 2, 3, 4, 5 };
		int n = ar.length;
		int n2 = n;
		for (int j = 0; j < n; j++)
		{

			for (int i = 0; i < n2 - 1; i++)
			{
				int k = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = k;
			}
			n2 = n2 - 1;

		}
		for (int i : ar)
		{
			System.out.println(i);
		}

		reverse(ar);

		IntStream stream = Arrays.stream(ar);
		stream.forEach(x->System.out.println(x));
		

	}

	public static int[] reverse(int ar[])
	{

		int beg = 0;
		int last = ar.length - 1;

		while (beg <= last)
		{
			int temp = ar[beg];
			ar[beg] = ar[last];
			ar[last] = ar[beg];
		}
		return ar;
	}
}
