package arrays;

public class ReversalInOneLoop {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5,8};
		int i = 0, j = ar.length - 1;

		for (i = 0; i < (ar.length) / 2; i++) {
			int k = ar[i];
			ar[i] = ar[j];
			ar[j] = k;
			j--;
		}
        for(int show:ar)
        System.out.println(show);
	}

}
