package arrays;

public class InverseArray {

	public static void main(String[] args) {
		int ar[] = { 3, 4, 2, 0, 1 };
		int inar[] = new int[5];

		for (int i = 0; i < ar.length; i++) {
			inar[ar[i]] = i;
			
		}
		for (int show : inar) {
			System.out.println(show);
		}
	}
}
