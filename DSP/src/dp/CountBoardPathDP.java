package dp;

public class CountBoardPathDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int s = cbp(0, 10, new int[11]);

		int s = cbpT(10);
		System.out.println(s);

	}
//can be related to stair case
	public static int cbp(int s, int d, int qb[]) {
		if (s == d) {
			return 1;
		}
		if (s > d) {
			return 0;
		}
		if (qb[s] != 0) {
			return qb[s];
		}
		int totalp = 0;
		for (int dice = 1; dice <= 6; dice++) {
			int intpath = cbp(s + dice, d, qb);
			totalp += intpath;
		}

		qb[s] = totalp;

		return totalp;
	}

	public static int cbpT(int n) {
		int cbpt[] = new int[n + 1];

		cbpt[n] = 1;

		for (int i = n - 1; i >= 0; i--) {
			for (int dice = 1; dice <= 6; dice++) {
				if (i + dice <= n) {
					cbpt[i] += cbpt[i + dice];
				}
			}
		}

		return cbpt[0];

	}
}
