package com.ds.patterns;

import java.util.Scanner;

public class NumberDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int nstars = 1;
		int nspaces = num - nstars;

		int row = 1;
		int val;
		while (row <= num) {

			for (int i = 0; i < nspaces / 2; i++) {
				System.out.print(" ");
			}
			val = row <= num / 2 ? row : num + 1 - row;
			for (int i = 0; i < nstars; i++) {
				System.out.print(val);
				if (i < nstars / 2) {
					val++;
				} else {
					val--;
				}
			}
			for (int i = 0; i < nspaces / 2; i++) {
				System.out.print(" ");
			}
			if (row <= num / 2) {
				nstars += 2;
			} else {
				nstars -= 2;
			}
			nspaces = num - nstars;
			row++;
			System.out.println();
		}

	}

}
