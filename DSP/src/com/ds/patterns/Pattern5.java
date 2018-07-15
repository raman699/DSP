package com.ds.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;

		int nss = 1;
		int nsp = n / 2;

		while (row <= n) {
			for (int j = 0; j < nsp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < nss; j++) {
				System.out.print("*");
			}
			if (row <= n / 2) {
				nsp--;
				nss += 2;
			} else {
				nsp++;
				nss -= 2;
			}
			System.out.println();
			row++;

		}

	}

}
