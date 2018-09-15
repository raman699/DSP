package hackerrankQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
        int x= sc.nextInt();
        int y=sc.nextInt();
        ArrayList<Integer> al=getAllIndex(ar, 0, x);
        System.out.println(al.get(y));
	}

	public static ArrayList<Integer> getAllIndex(int ar[],int vidx,int x)
	{
	
		if(vidx==ar.length)
		{
			return new ArrayList<Integer>();
		}
		
		ArrayList<Integer> al1=getAllIndex(ar, vidx+1, x);
		if(ar[vidx]==x)
		{
			al1.add(0,vidx);
		}
		return al1;
	}
}
