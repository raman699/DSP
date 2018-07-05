package com.ds.practice;

public class DownwardDiagionalMatrix {

	public static void main(String[] args) {
		int ar[][] = new int[6][6];
		int a=6,b=6;
		for(int i=a-1;i>0;i--)
		{
			for(int j=a-1-i;j>=0;i--)
			{
				System.out.println(ar[i][j]);
			}
		}
	}
	}

