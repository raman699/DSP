package twoDArray;

public class Rotataion90 {

	public static void main(String[] args) {
		int ar[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		rotate(ar);
	}

	public static void rotate(int ar[][]) {
		int arr[][] = new int[ar.length][ar[0].length];
		int fc = 0;
		int fr = 0;
		for (int j = ar[0].length - 1; j >= 0; j--) {
			fc = 0;
			for (int i = 0; i < ar.length; i++) {
				arr[i][j] = ar[fr][fc];
				fc++;
			}
			fr++;
		}
		display(arr);
	}

	public static void rotate1(int arr[][])
	{
//		
//		for(int c=0;c<arr[0].length;c++)
//		{
//			for(int r=0;r<ar.length;r++)
//			{}
//		}
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
