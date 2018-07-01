package com.ds.practice;

import java.util.Scanner;

public class FibonacciPyramaid {

	public static void main(String...s) {
		
		int n= (new Scanner(System.in)).nextInt();
		int a=0,b=1,c=a+b;
		System.out.println(a);
		
		for(int i=1;i<n;i++)
		{
			if(i==1)
			{
				System.out.print(b+" ");
			}
			for(int j=0;j<i;j++)
			{
				
				System.out.print(c+" ");
				a=b;
				b=c;
				c=a+b;
			}
			System.out.println();
		}
	}
}
