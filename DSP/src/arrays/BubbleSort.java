package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = { 2333, 3, 1, 56, 4 };
		int n = ar.length - 1;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n - j; i++) {
				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
			}

		}

		for (int show : ar) {
			System.out.println(show);
		}

	}

}
