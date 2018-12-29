package dp;

public class MaxSquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]= {
				{1,0,1,0},
				{1,1,1,0},
				{1,1,1,1},
				{1,1,1,0},
		};

		int max=maxSquareMatrix(ar);
		System.out.println(max);
		
	}

	public static int maxSquareMatrix(int ar[][]) {
		// storage
		int strg[][] = new int[ar.length][ar[0].length];
		// define smaller problem

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				if (i == ar.length -1|| j == ar[0].length-1 || ar[i][j] == 0) {
					strg[i][j] = ar[i][j];
				}
			}
		}
		int max = 0;
		//traverse
		//result
		for (int i = ar.length - 2; i >= 0; i--) {

			for (int j = ar[0].length - 2; j >= 0; j--) {
				strg[i][j] = Math.min(strg[i + 1][j + 1], Math.min(strg[i + 1][j], strg[i][j + 1]))+1;
				if (strg[i][j] > max) {
					max = strg[i][j];
				}
			}
		}
		return max;

	}
}
