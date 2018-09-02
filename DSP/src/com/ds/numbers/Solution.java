package com.ds.numbers;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ar[]= new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            
        }
        boolean res= check(ar,0);
        System.out.println(res);
    }
    public static boolean check(int ar[],int vidx)
    {
        if(vidx==ar.length)
        {
            return true;
        }
        boolean res=check(ar,vidx+1);
        if(res)
        {
            if(vidx+1<ar.length){
            if(ar[vidx]>ar[vidx+1])
            {
                return false;
            }
            else
                return true;
            }
            else
            	 return true;
        }
        
        else
            return false;
    }
    
}