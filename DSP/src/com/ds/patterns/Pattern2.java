package com.ds.patterns;

import java.util.Scanner;

public class Pattern2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int r = 1;
		while (r <= n)
		{
			int c = 1;
			while (c <= r)
			{
				System.out.print(count + " ");
				count++;
				c++;

			}
			System.out.println();
			r++;
		}

	}

}
