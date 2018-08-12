package com.ds.practice;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		int n = (new Scanner(System.in)).nextInt();
		boolean[] notPrime = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			if (!notPrime[i]) {
				for (int j = 2 * i; j <= n; j = j + i) {
					notPrime[j] = true;
				}
			}
		}
		for (int i = 2; i <= n; i++) {
			if (!notPrime[i]) {
				System.out.print(i);
			}
		}

	}
}
