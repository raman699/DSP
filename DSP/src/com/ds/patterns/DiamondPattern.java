package com.ds.patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int nstars = 1;
		int nspaces = num - 1;

		int row = 1;
		while (row <= num) {

			for(int i=0;i<nspaces/2;i++)
			{
				System.out.print(" ");
			}
			for(int i=0;i<nstars;i++)
			{
				System.out.print("*");
			}
			if (row <= num / 2) {
				nstars += 2;

			} else {
				nstars -= 2;

			}
			nspaces = num - nstars;
            System.out.println();
			row++;

		}

	}

}
