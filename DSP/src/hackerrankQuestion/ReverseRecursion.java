package hackerrankQuestion;

import java.util.Scanner;

public class ReverseRecursion {

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
        int[] ar1= getReverse(ar, 0);
        for(int i:ar1)
        {
        	System.out.print(i+" ");
        	
        }
        System.out.println();
        System.out.println(ar1[x]);

	}

	public static int[] getReverse(int ar[],int vidx)
	{
		if(vidx==ar.length)
		{
			return new int[ar.length];
		}
		int arr[]= getReverse(ar, vidx+1);
		arr[vidx]=ar[ar.length-1-vidx];
		return arr;
	}
}
