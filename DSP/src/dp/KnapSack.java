package dp;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wts[] = { 2, 5, 1, 3, 4 };
		int prices[] = { 15, 14, 10, 45, 30 };
		// System.out.println(kps(wts,prices,7));

		System.out.println(kpsunbouned(wts, prices, 7));

	}

	public static void displayMatria(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 2-D array explanation
	// meaning
	public static int kps(int wts[], int prices[], int targetwt) {

		int rows = wts.length + 1;
		int col = targetwt + 1;
		int strg[][] = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					strg[i][j] = 0;
				} else {

					int wtFromAr = wts[i - 1];
					int priceFromArray = prices[i - 1];

					int prevr = i - 1;
					int prevc = j - wtFromAr;

					if (wtFromAr <= j && prevc >= 0 && strg[prevr][prevc] + priceFromArray > strg[i - 1][j]) {
						strg[i][j] = strg[prevr][prevc] + priceFromArray;
					} else {
						strg[i][j] = strg[i - 1][j];
					}

				}
			}
		}
		displayMatria(strg);
		return strg[rows - 1][col - 1];
	}

	public static int kpsunbouned(int wts[], int prices[], int targetwt) {
		int strg[] = new int[targetwt + 1];
		strg[0] = 0;
		for (int cp = 1; cp <= targetwt; cp++) {
			for (int j = 0; j < wts.length; j++) {
				int wt = wts[j];
				int cost = prices[j];

				if (wt <= cp) {
					strg[cp] = Math.max(strg[cp], strg[cp - wt] + cost);
				}
			}
		}
		return strg[targetwt];
	}
}
