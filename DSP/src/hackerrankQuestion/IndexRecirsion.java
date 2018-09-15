package hackerrankQuestion;

import java.util.Scanner;

public class IndexRecirsion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
        int x= sc.nextInt();
		System.out.println((getIndex(ar,0,x)));
	}

	public static int getIndex(int ar[], int vidx, int x) {

		if (vidx == ar.length) {
			return -1;
		}
		if (ar[vidx] == x) {
			return vidx;
		}
		

		int res = getIndex(ar, vidx + 1, x);
		return res;
	}
}
