package hackerrankQuestion;

import java.util.Scanner;

public class InverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();

		}
        int x= sc.nextInt();
		int[] ar1 = getInverse(ar, null, 0);
 
		for(int i:ar1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(ar1[x]);
	}

	public static int[] getInverse(int ar[], int ar1[], int vidx) {
		if (vidx == ar.length) {
			return new int[ar.length];
		}

		ar1 = getInverse(ar, ar1, vidx + 1);
		ar1[ar[vidx]] = vidx;

		return ar1;
	}
}
