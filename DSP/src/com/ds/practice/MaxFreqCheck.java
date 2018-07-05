package com.ds.practice;

import java.util.Scanner;

public class MaxFreqCheck {

	public static void main(String[] args) {
		int ar[]= new int[26];
		String str=(new Scanner(System.in)).next();
		
		for(int i=0;i<str.length();i++)
		{
			
			ar[str.charAt(i)-'a']++;
		}
		
        int max=0;
        int index=0;
        //char ch=(char) ar[0];
        
        for(int i=0;i<ar.length-1;i++)
        {
        	if(ar[i]>max)
        	{
        		//ch=(char) ('a'+i+1);
        		max=ar[i];
        		index=i;
        	}
        }
  char ch =(char) (index+97);
		System.out.println(ch);
		
	}

}
