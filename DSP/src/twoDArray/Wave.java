package twoDArray;

import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		int ar[][] = takeInput();
		waveDisplay(ar);
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

	public static void waveDisplay(int ar[][]) {
		boolean flag = true;
		for (int j = 0; j < ar[0].length; j++) {
			if (flag) {
				for (int i = 0; i < ar.length; i++) {
					System.out.print(ar[i][j]);
				}
			} else {
				for (int i = ar.length - 1; i >= 0; i--) {
					System.out.print(ar[i][j]);
				}
			}
			flag = !flag;
			System.out.println();
		}
	}
}
//Another logic :col%2
