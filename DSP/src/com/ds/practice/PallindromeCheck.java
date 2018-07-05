package com.ds.practice;

import java.util.Scanner;

public class PallindromeCheck {

	public static void main(String[] args) {
		String str=(new Scanner(System.in)).next();
		boolean[][] pc= new boolean[str.length()][str.length()];
		for(int gap=0;gap<str.length();gap++)
		{
			int i=0;
			for(int j=gap;j<str.length();j++)
			{
				if(gap==0)
				{
					pc[i][j]=true;
					
				}
				else if(gap==1||gap==2)
				{
					pc[i][j] =str.charAt(i) ==str.charAt(j);
				}
				else
				{
					pc[i][j] =str.charAt(i) ==str.charAt(j) && pc[i+1][j-1];
				}
				i++;
			}
		}
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				//System.out.print(pc[i][j] +"  ");
				if (pc[i][j])
				{
					System.out.println(str.substring(i, j+1));
				}
			}
		//	System.out.println();
		}

	}

}
