package com.ds.practice;

public class SingleUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 4, 3, 5, 2, 4, 3, 5 };

		int x = ar[0];
		for (int i = 1; i < ar.length ; i++) {
			x = x ^ ar[i];
		}

		System.out.println(x);

	}

}
