package com.ds.numbers;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int cmax=0;
        char ch = 0;
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
       // ch=s.charAt(0);
       
        int b[]= new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            char ch1= (char)(s.charAt(i)-'a');
            b[ch1]++;
        }
        int max=-1;
        for(int j=0;j<b.length;j++)
        {
        	if(max<b[j])
        	{
        	max=b[j];
        	ch=(char)('a'+j);
        	}
        }
        System.out.println(ch);
    }
}