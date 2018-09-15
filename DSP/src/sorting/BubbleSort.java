package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 22, 33, 2, 44, 12 };
		bubbleSort(ar);
		display(ar);
	}

	public static void display(int ar[]) {
		for (int i : ar) {
			System.out.println(i);
		}
	}

	public static void bubbleSort(int ar[]) {
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - i - 1; j++) {
				if (ar[j + 1] < ar[j]) {
					swap(ar, j, j + 1);
				}
			}
		}

	}

	public static void swap(int ar[], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
