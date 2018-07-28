package twoDArray;

public class First {

	public static void main(String[] args) {
		int ar[][] = { { 31, 32, 33, 34 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };

		System.out.println("rows="+ar.length);
		System.out.println("columns="+ar[0].length);
		System.out.println();
		display(ar);
	}

	public static void display(int ar[][]) {
		for (int row = 0; row < ar.length; row++) {
			for (int col = 0; col < ar[0].length; col++) {
				System.out.print(ar[row][col] + "  ");
			}
			System.out.println(".");
		}
	}
}
//the length of thr array is teh number of rows.
//As the two D array is the arrays of arrays
// the length of any sub array will give you the number of columns of 2 D array
