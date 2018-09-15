package com.ds.practice;

public class ZeroNonZero {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 0, 0, 3, 4, };

		int i = 0;
		int z = 0;

		while (i < ar.length) {
			if (ar[i] == 0) {
				i++;
			} else {
				swap(ar, i, z);
				i++;
				z++;
			}

		}
		display(ar);
	}

	public static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public static void display(int ar[])
	{
		for(int i:ar)
		{
			System.out.println(i);
		}
	}
}
