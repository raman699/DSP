package com.ds.patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int r = 0;
		int temp = 1;

		while (r < n) {

			int c = 0;

			while (c <= r) {

				if (c == 0) {
					System.out.print(1 + "\t");
					temp = 1;
				} else {
					temp = (temp * (r - (c - 1))) / (c);
					System.out.print(temp + "\t");
				}
				c++;
			}
			System.out.println();
			r++;
		}
	}

}
