package twoDArray;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		int ar[][] = takeInput();
		display(ar);
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

	public static void display(int ar[][]) {
		for (int row = 0; row < ar.length; row++) {
			for (int col = 0; col < ar[0].length; col++) {
				System.out.print(ar[row][col] + "  ");
			}
			System.out.println(".");
		}
	}
}
