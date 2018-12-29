package dp;

public class CountMazePathDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = cmp(4, 4);
		 System.out.println(s);

		int arr[][] = { { 1, 2, 0, 5, 2 }, { 3, 1, 5, 8, 0 }, { 7, 3, 0, 4, 6 }, { 1, 2, 2, 7, 5 }, { 8, 8, 5, 9, 0 },
				{ 1, 5, 3, 4, 1 } };

		int arr1[][] = { { 2, 3, 6, 4, 7 }, { 9, 5, 5, 8, 6 }, { 8, 7, 0, 6, 9 }, { 9, 7, 0, 0, 8 }, { 6, 8, 4, 6, 4 },
				{ 1, 3, 4, 3, 9 }

		};
		int s1 = goldMine(arr1);
		System.out.println(s1);

	}

	public static int cmp(int dr, int dc) {

		// define storage 
		int f[][] = new int[dr + 1][dc + 1];
        // define smaller problem -> larger problem
		f[dr][dc] = 1;

		//traverse
		for (int i = dr; i >= 0; i--) {
			for (int j = dc; j >= 0; j--) {
				if (i + 1 <= dr) {
					f[i][j] += f[i + 1][j];
				}

				if (j + 1 <= dc) {
					f[i][j] += f[i][j + 1];
				}
			}
		}
        //result
		return f[0][0];
	}

	//minimum cost path in a matrix
	public static int cmpCost(int arr[][]) {

		//storage
		int f[][] = new int[arr.length][arr[0].length];

		//traverse and (define problem could have been done earlier
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				//define smaller problem
				if (i == arr.length - 1 && j == arr[0].length - 1) {
					f[i][j] = arr[i][j];
				} else if (i == arr.length - 1) {
					f[i][j] = f[i][j + 1] + arr[i][j];
				}

				else if (j == arr[0].length - 1) {
					f[i][j] = f[i + 1][j] + arr[i][j];
				} else {
					f[i][j] = Math.min(f[i + 1][j], f[i][j + 1]) + arr[i][j];
				}
			}
		}

		//result
		return f[0][0];
	}
    // /
	//*--
	// \
	//3 directions
	public static int goldMine(int arr[][]) {
		int f[][] = new int[arr.length][arr[0].length];

		for (int row = 0; row <= arr.length - 1; row++) {
			f[row][arr[0].length - 1] = arr[row][arr[0].length - 1];
		}

		for (int col = arr[0].length - 2; col >= 0; col--) {
			for (int row = 0; row <= arr.length - 1; row++) {
				if (row == 0) {
					int tempcost = Math.max(f[row][col + 1], f[row + 1][col + 1]);
					f[row][col] = arr[row][col] + tempcost;
				} else if (row == arr.length - 1) {
					int tempcost = Math.max(f[row][col + 1], f[row - 1][col + 1]);
					f[row][col] = arr[row][col] + tempcost;
				} else {
					int tempcost = Math.max(f[row][col + 1], f[row - 1][col + 1]);
					tempcost = Math.max(tempcost, f[row + 1][col + 1]);
					f[row][col] = arr[row][col] + tempcost;
				}

			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (f[i][0] > max) {
				max = f[i][0];
			}
		}
		return max;
	}
}
