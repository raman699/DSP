package com.ds.patterns;

import java.util.Scanner;

public class Pattern6
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int row = 1;
		int nsp = 1;
		int nss = n / 2 + 1;

		while (row <= n)
		{
			// System.out.println("row "+nsp+" "+nss);
			for (int j = 0; j < nss; j++)
			{
				System.out.print("*");
			}
			for (int j = 0; j < nsp; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < nss; j++)
			{
				System.out.print("*");
			}
			if (row <= n / 2)
			{
				nss--;
				nsp += 2;
			} else
			{
				nss++;
				nsp -= 2;
			}
			System.out.println();
			row++;
		}

	}

}
