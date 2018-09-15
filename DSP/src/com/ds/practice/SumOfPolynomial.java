package com.ds.practice;

public class SumOfPolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int x=3;
		int sum=0;
		int pow=x;
		for(int i=n;i>=1;i--)
		{
			sum=sum+i*pow;
			pow=pow*x;
			
		}
		System.out.println(sum);

	}

	
	
}
