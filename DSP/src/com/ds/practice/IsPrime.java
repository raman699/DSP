package com.ds.practice;

import java.util.Scanner;

public class IsPrime {

	public static void main(String...s)
	{
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		boolean b=true;
		for(int i=2;i<x-1;i++)
		{
			if(x%i==0)
			{
				b=false;
				break;
			}
		}
		System.out.println(b);
	}
}
