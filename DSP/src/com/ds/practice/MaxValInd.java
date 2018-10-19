package com.ds.practice;

public class MaxValInd {

	public static void main(String[] args) {
		int ar[] = { 4,5,3,20,18,19 };

		// -- max
		// --min
		int max = ar[0], min = ar[0];
		int maxi = 0, mini = 0;
		int diff = Math.abs(max - min) + Math.abs(0);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				maxi = i;
			}
			if (ar[i] < min) {
				min = ar[i];
				mini = i;
			}
			//int oDiff = diff;
			int newDiff = Math.abs(max - min) + Math.abs(maxi - mini);
			if (Math.abs(max - min) + Math.abs(maxi - mini) > diff) {
				diff = newDiff;
			}

		}
		System.out.println(diff);
	}

}
