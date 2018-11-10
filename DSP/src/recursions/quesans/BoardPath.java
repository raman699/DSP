package recursions.quesans;

public class BoardPath {

	static int count = 0;
	static int snl[] = new int[29];

	public static void main(String[] args) {
//		getBoard16Opening(0,10,"");
//		System.out.println(count);
		for (int i = 0; i <= 28; i++) {
			snl[i] = 0;
		}
		snl[3] = 19;
		snl[9] = 24;
		snl[20] = 4;
		snl[26] = 2;
		getBoardSnP(0, 9, snl, moves, 0);
		getBoardSnP(0, 28, snl, moves, 0);

	}

	public static void getBoard(int src, int des, String asf) {

		if (src == des) {
			count++;
			System.out.println(asf);
			return;
		}
		if (src > des) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			getBoard(src + i, des, asf + i);
		}
	}

	public static void getBoard16Opening(int src, int des, String asf) {

		if (src == des) {
			count++;
			System.out.println(asf);
			return;
		}
		if (src > des) {
			return;
		}
		if (src == 0) {
			getBoard16Opening(src + 1, des, asf + 1);
			getBoard16Opening(src + 1, des, asf + 6);
		} else {
			for (int i = 1; i <= 6; i++) {
				getBoard16Opening(src + i, des, asf + i);
			}
		}
	}

	//static int moves[] = { 2, 6, 6, 5, 3, 6, 5, 1, 6, 4, 3, 1, 4 };
	static int moves[] = { 2, 6, 3 ,5,2,3,4};

	public static void getBoardSnP(int src, int des, int snl[], int moves[], int midx) {
		boolean res = false;
		if (src == des) {
			System.out.println(true);
			return;

		}
		if (midx == moves.length) {
			System.out.println(false);
			return;
		}

		if (src == 0) {

			if (moves[midx] == 1 || moves[midx] == 6) {
				getBoardSnP(1, des, snl, moves, midx + 1);
			} else
				getBoardSnP(0, des, snl, moves, midx + 1);
		} else {

			if (src + moves[midx] <= des) {
				if (snl[src] == 0) {
					getBoardSnP(src + moves[midx], des, snl, moves, midx + 1);
				} else {

					getBoardSnP(snl[src] + moves[midx], des, snl, moves, midx + 1);
				}
			}
			else
			{
				getBoardSnP(src , des, snl, moves, midx + 1);
			}

		}

	}
}
