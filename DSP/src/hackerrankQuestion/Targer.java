package hackerrankQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Targer {
	 static int count;
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        int ar[]= new int[n];
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        int tar= sc.nextInt();
	        ArrayList<String> al=targetSetArrayList(ar,0, new ArrayList<Integer>(),0,tar);
	        Collections.reverse(al);
	        System.out.println(count);
	        System.out.println(al);
	        for(String s1:al)
	        {
	            System.out.println(s1);
	        }
	    }
	    public static ArrayList<String> targetSetArrayList(int ar[], int vidx, ArrayList<Integer> set1, int ss1, int tar) {
	        if (vidx == ar.length) {
	            if (ss1 == tar) {
	              //  System.out.println(set1);
	                ArrayList<String> bal= new ArrayList<String>();
	                String bs="";
	                for(Integer i:set1)
	                {
	                    bs+=i;
	                    bs+=" ";
	                }
	                bal.add(bs);
	                // System.out.println(set2);
	                count++;
	                return bal;
	            }
	            return new ArrayList<String>();
	        }
	        ArrayList<String> res= new ArrayList<String>(); 
	        ArrayList<String> fal=targetSetArrayList(ar, vidx + 1, set1, ss1, tar);
	        if(fal.size()>0)
	        {
	            for(String s:fal)
	            {
	                res.add(s);
	            }
	        }
	        set1.add(ar[vidx]);
	        ArrayList<String> sal=targetSetArrayList(ar, vidx + 1, set1, ss1 + ar[vidx], tar);
	        if(sal.size()>0)
	        {
	            for(String s:sal)
	            {
	                res.add(s);
	            }
	        }
	        set1.remove(set1.size() - 1);
	        return res;

	    }

	
}
