package com.ds.patterns;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String... s) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nsp = n / 2;
		int nss = 1;
		while (row <= n) {

			for (int j = 0; j < nsp; j++) {
				System.out.print(" ");
			}
			int count = row;
			if(row<=n/2)
			{
				count=row;
			}
			else
				count=n-row+1;
			for (int j = 0; j < nss; j++) {
				System.out.print(count);
				if (j < nss / 2) {
					count++;
				} else
					count--;
			}
			if (row <= n / 2) {
				nsp--;
				nss += 2;
			} else {
				nsp++;
				nss -= 2;
			}
			row++;
			System.out.println();
		}

	}

}
