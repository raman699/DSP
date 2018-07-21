package arrays;

public class Largest {

	public static void main(String[] args) {
		int[] ar = { -11, 34, 223,-444, 55 };
		int largest = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > largest)
				largest = ar[i];
		}
		System.out.println(largest);
	}
}
