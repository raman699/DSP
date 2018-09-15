package hackerrankQuestion;

import java.util.Scanner;

public class BubbleSortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[]= new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		bubbleSort(ar, 0);
		for (int i : ar)
			System.out.println(i);
	}

	public static void bubbleSort(int ar[], int jc) {
		if (jc >= ar.length - 1) {
			return;
		}
		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] > ar[i + 1])
				swap(ar, i, i + 1);
		}
		bubbleSort(ar, jc + 1);
	}

	public static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
