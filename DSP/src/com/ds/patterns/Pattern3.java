package com.ds.patterns;

import java.util.Scanner;

public class Pattern3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c1 = a + b;

		int r = 1;
		while (r <= n)
		{
			int c = 1;
			while (c <= r)
			{
				System.out.print(a + " ");

				a = b;
				b = c1;
				c1 = a + b;
				c++;
			}
			System.out.println();
			r++;
		}

	}

}
