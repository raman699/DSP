package com.ds.practice;

import java.util.Scanner;

public class MaxFreqCheck2 {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i1 = 0; i1 < t; i1++) {
			String str = sc.nextLine();
			check(str);
		}
	}

	public static void check(String str) {
		 int ar[] = new int[256];
		for (int i = 0; i < str.length(); i++) {

			ar[str.charAt(i)]++;
		}

		int max = 0;
		int index = 0;
		
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > max) {
			
				max = ar[i];
				index = i;
			}
		}
		char ch =  (char) (index);
		System.out.print(ch+" ");
	}
}