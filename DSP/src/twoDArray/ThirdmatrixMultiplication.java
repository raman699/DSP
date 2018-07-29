package twoDArray;

public class ThirdmatrixMultiplication {

	public static void main(String[] args) {

		int first[][] = {
				{ 10, 0, 0 }, { 1, 2, 3 }, };
		int second[][] = { { 5, 0, 1, 0 }, { 10, 0, 0, 10 }, { 1, 1, 2, 2 } };
		multiply(first, second);
	}

	public static void display(int ar[][]) {
		for (int row = 0; row < ar.length; row++) {
			for (int col = 0; col < ar[0].length; col++) {
				System.out.print(ar[row][col] + "  ");
			}
			System.out.println(".");
		}
	}

	public static int[][] multiply(int first[][], int second[][]) {

		int r1 = first.length;
		int c1 = first[0].length;
		int r2 = second.length;
		int c2 = second[0].length;
		int answer[][] = new int[r1][c2];

		if (c1 != r2) {
			System.out.println("they cannot be multiplied");
		} else {
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {

					for (int k = 0; k < r2; k++) {
						answer[i][j] = answer[i][j] + first[i][k] * second[k][j];
					}
				}
			}
			display(answer);
		}

		return answer;
	}
}
