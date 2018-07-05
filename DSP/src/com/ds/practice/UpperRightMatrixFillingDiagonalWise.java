package com.ds.practice;

import java.util.Scanner;

public class UpperRightMatrixFillingDiagonalWise {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
	for(int gap=0;gap<n;gap++)
	{
		int i=0;
		
		for(int j=gap;j<n;j++)
		{

			System.out.println(i+"  "+j);
			i++;
		}
	}

	}

}
