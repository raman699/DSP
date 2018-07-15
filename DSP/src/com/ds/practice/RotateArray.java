package com.ds.practice;

public class RotateArray {

	public static void main(String[] args) {
	
		int ar[]= {1,2,3,4,5};
		
		for(int i=0;i<2;i++)
		{
			int c=ar[ar.length-1];
			for(int j=ar.length-1;j>0;j--)
			{
				ar[j]=ar[j-1];
			}
			ar[0]=c;
		}
		for(int i:ar)
		{
			System.out.println(i);
		}

	}

}
