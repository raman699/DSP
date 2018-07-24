package arrays;

public class Reverse {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int n = ar.length;
		int n2=n;
		for (int j = 0; j < n; j++) {

			for (int i = 0; i < n2 - 1; i++) {
				int k = ar[i];
				ar[i] = ar[i + 1];
				ar[i + 1] = k;
			}
			n2=n2-1;

		}
		for (int i : ar) {
			System.out.println(i);
		}
	}

}
