package com.ds.practice;

import java.util.Scanner;

public class CombineNumbers {

	public static void main(String[] args) {
	
		int ar[]= {0,1,1,0,0,0,1,1,1,0,0};
		int i=0,j=ar.length-1,c=0;
		while(i<j)
		{
			if(ar[i]>ar[j])
			{
				c=ar[i];
				ar[i]=ar[j];
				ar[j]=c;
				i++;j--;
			}
			else if (ar[i]==ar[j])
			{
				if(ar[i]==0)
				{
					i++;
				}
				else
				{
					j--;
				}
			}
			else
			{
				i++;j--;
			}
		}
		
		for(int a:ar)
System.out.print(a);
	}

}
