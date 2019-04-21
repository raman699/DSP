package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int ar[] = { 699, 78, 67, 677, 43 };

		for (int j = 1; j <= ar.length - 1; j++) {
			for (int i = j; i > 0; i--) {
				if (ar[i] < ar[i - 1]) {
					int temp = ar[i];
					ar[i] = ar[i - 1];
					ar[i - 1] = temp;
				} else
					break;
			}
		}
		for (int show : ar) {
			System.out.println(show);
		}
	}

}
