package hackerrankQuestion;

import java.util.Scanner;

public class SelectionSortUsingRecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		selectionSort(ar, 0);
		for (int i : ar)
			System.out.println(i);
	}

	public static void selectionSort(int ar[], int i) {
		if (i == ar.length )
			return;
		secondFn(ar, i, i + 1);
		selectionSort(ar,i+1);
	}

	public static void secondFn(int ar[], int i, int j) {
		if (j == ar.length )
			return;
		if (ar[i] > ar[j])
			swap(ar, i, j);

		secondFn(ar, i, j + 1);

	}

	public static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

}
