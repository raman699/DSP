package com.ds.numbers;

import java.util.Scanner;

public class HCF
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		if (num1 > num2)
//			HCF(num1, num2);
//		else
//			HCF(num2, num1);
		HCF(num1, num2);

	}

	public static void iterativeHCF()
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int divis = num1, divid = num2, rem = num2 % num1;
		while (rem != 0)
		{
			divid = divis;
			divis = rem;
			rem = divid % divis;
		}
		System.out.println(divis);
	}

	public static void HCF(int divisor, int dividend)
	{
		if (dividend % divisor == 0)
		{
			System.out.println(divisor);
			return;
		}

		HCF(dividend % divisor, divisor);

		return;
	}
}
