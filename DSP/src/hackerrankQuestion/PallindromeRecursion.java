package hackerrankQuestion;

import java.util.Scanner;

public class PallindromeRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[]= new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println(isPallindrome(ar, 0));

	}

	public static boolean isPallindrome(int ar[], int vidx) {
		if (vidx >= ar.length / 2) {
			return true;
		}
		boolean res = isPallindrome(ar, vidx + 1);
		if (res) {
			if (ar[vidx] == ar[ar.length - 1 - vidx]) {
				return true;
			} else
				return false;
		} else
			return false;
	}
}
