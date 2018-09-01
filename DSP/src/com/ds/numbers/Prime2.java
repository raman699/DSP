package com.ds.numbers;

import java.util.Scanner;

public class Prime2 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        boolean notPrime[]= new boolean[n+1];
	        
	        for(int i=2;i<n;i++)
	        {
	            if(!notPrime[i])
	            {
	            for(int j=2*i;j<n;j=j+i)
	            {
	             notPrime[j]=true;   
	            }
	        }
	            
	        }
	        
	        for(int i=2;i<notPrime.length;i++)
	        {
	            if(!notPrime[i])
	                System.out.print(i+" ");
	        }
	    }

}
