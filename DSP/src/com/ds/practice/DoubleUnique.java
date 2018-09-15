package com.ds.practice;

public class DoubleUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 4, 3, 5, 2, 3, 5 };

		int x = 0;

		for (int i = 0; i < ar.length; i++) {
			x = x ^ ar[i];
		}


		int bitmask = (x & -x);


		int x1 = x;
		int x2 = x;
		for (int i = 0; i < ar.length; i++) {
			if ((ar[i] & bitmask) == bitmask) {// set bit condition
				x1 = x1 ^ ar[i];
			} else {
				x2 = x2 ^ ar[i];
			}
		}
		System.out.println(x1);
		System.out.println(x2);

	}

}
