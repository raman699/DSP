package arrays;
// bad approach
// use reverse one
public class Rotate1 {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };

		int k = 2;
		for (int i = 0; i < k; i++) {
			int temp = ar[ar.length - 1];
			for (int j = ar.length - 1; j > 0; j--) {
				ar[j] = ar[j - 1];
			}
			ar[0] = temp;
		}
		for (int show : ar)
			System.out.println(show);

	}

}
