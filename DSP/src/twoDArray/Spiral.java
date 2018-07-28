package twoDArray;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		int ar[][] = takeInput();
		spiral(ar);

	}

	public static int[][] takeInput() {
		int ar[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();

		ar = new int[rows][cols];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.println("Enter the value for thec cell [" + i + "," + j + "]");
				ar[i][j] = sc.nextInt();
			}
		}
		return ar;
	}

	public static void spiral(int ar[][]) {

		int rmin = 0;
		int rmax = ar.length - 1;
		int cmin = 0;
		int cmax = ar[0].length - 1;

		int te = ar.length * ar[0].length;

		int counter = 0;

		while (counter < te) {

			for (int row = rmin; counter<te && row <= rmax; row++) {
				System.out.print(ar[row][cmin] + " ");
				counter++;
			}
			cmin++;
			for (int col = cmin; counter<te &&  col <= cmax; col++) {
				System.out.print(ar[rmax][col] + " ");
				counter++;
			}
			rmax--;
			for (int row = rmax; counter<te &&  row >= rmin; row--) {
				System.out.print(ar[row][cmax] + " ");
				counter++;
			}
			cmax--;
			for (int col = cmax; counter<te &&  col >= cmin; col--) {
				System.out.print(ar[rmin][col] + " ");
				counter++;
			}
			rmin++;
			System.out.println();

		}

	}
}
