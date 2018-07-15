package com.ds.patterns;

import java.util.Scanner;

public class HollowDiamon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		int nspaces=1;
		int nstars=(num+2-nspaces);
		
		int row=1;
		
		while(row<=num)
		{
			
			for(int i=0;i<nstars/2;i++)
			{
				System.out.print("*");
			}
			for(int i=0;i<nspaces;i++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<nstars/2;i++)
			{
				System.out.print("*");
			}
			if(row<=num/2)
			{
				nspaces+=2;	
			}
			else
			{
				nspaces-=2;
			}
			nstars=(num+2-nspaces);
			System.out.println();
			row++;
			
			
		}

	}

}
