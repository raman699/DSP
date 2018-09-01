package recursions.quesans;

public class BoardPathM {

	static int count, call;

	public static void main(String[] args) {
		printBPWithMutipleS(0, 0, 2, 2, "");
		System.out.println(count + " " + call);

	}

	public static void printBP(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			count++;
			return;
		}

		if (sr < dr) {
			printBP(sr + 1, sc, dr, dc, psf + "v");

		}
		if (sc < dc) {
			printBP(sr, sc + 1, dr, dc, psf + "h");
		}

	}

	public static void printBPWithDiagonal(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			count++;
			return;
		}

		if (sr < dr) {
			printBPWithDiagonal(sr + 1, sc, dr, dc, psf + "v");
		}
		if (sc < dc) {
			printBPWithDiagonal(sr, sc + 1, dr, dc, psf + "H");
		}
		if (sr < dr && sc < dc) {

			printBPWithDiagonal(sr + 1, sc + 1, dr, dc, psf + "d");

		}

	}

	public static void printBPWithMutiple(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			count++;
			return;
		}

		if (sr < dr) {

			for (int i = 1; i <= dr; i++) {
				if (sr + i <= dr) {
					call++;
					printBPWithMutiple(sr + i, sc, dr, dc, psf + "v" + (i));

				}
			}
		}
		if (sc < dc) {

			for (int j = 1; j <= dc; j++) {
				if (sc + j <= dc) {
					printBPWithMutiple(sr, sc + j, dr, dc, psf + "H" + (j));
					call++;
				}
			}
			if (sr < dr && sc < dc) {
				for (int k = 1; k <= dr && k <= dc; k++) {

					if (sr + k <= dr && sc + k <= dc) {
						printBPWithMutiple(sr + k, sc + k, dr, dc, psf + "d" + (k));
						call++;
					}
				}
			}

		}
	}

	public static void printBPWithMutipleS(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			count++;
			return;
		}
		// horizontal calls
		for (int i = 1; i <= dc - sc; i++) {
			printBPWithMutipleS(sr, sc + i, dr, dc, psf + "H" + i);
		}
		// vertical calls
		for (int i = 1; i <= dr - sr; i++) {
			printBPWithMutipleS(sr + i, sc, dr, dc, psf + "V" + i);
		}

		for (int i = 1; i <= Math.min(dc - sc, dr - sr); i++) {
			printBPWithMutipleS(sr + i, sc + i, dr, dc, psf + "D" + i);
		}
	}
}