package com.ds.practice;

public class CheckChefHappy {

	public static void main(String[] args) {
		int ar[]= {1,1,2,3};
		boolean res=false;
		int i=0,j=0;
		for( i=0;i<ar.length;i++)
		{
			for( j=i+1;j<ar.length;j++)
			{
				if(ar[i]!=ar[j])
				{
					int arri=ar[i];
					int arrj=ar[j];
					
					if(ar[arri-1]==ar[arrj-1])
					{
						res=true;
						break;
					}
				}
			}
			if(res)
			{
				break;
			}
			
		}
		System.out.println(i+" "+j);
		System.out.println(res);
		

	}

}
