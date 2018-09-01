package strings;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        int [][]ar=new int [r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<r;i++)
        {
             if(i%2==0)
                {
            for(int j=0;j<c;j++)
            {
               System.out.print(ar[i][j]);
            }    
                 
                }
            else
            {
                for(int j=c-1;j>=0;j--)
            {
               System.out.print(ar[i][j]);
            }    
            }
            
        }
        System.out.println();
        for(int j=0;j<c;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<r;i++)
                {
                    System.out.print(ar[j][i]);
                }
            }
            else
            {
                for(int i=r-1;i>=0;i--)
                {
                    System.out.print(ar[j][i]);
                }
            }
        }
    }
}