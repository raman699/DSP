package recursions.quesans;

public class Nqeens {

	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueens(new boolean[4][4], "", 1, 0);
		System.out.println(count);

	}

	public static void nQueens(boolean chess[][], String asf, int qno, int bno) {

		if (qno > chess.length) {
			
			if (isChessBoardSafe(chess)) {
				System.out.println(asf);
				count++;
			}

			return;

		}

		for (int i = bno; i < chess.length * chess.length; i++) {

			int sr = (i) / chess.length;
			int sc = (i) % chess.length;

			chess[sr][sc] = true;
			nQueens(chess, asf + sr + "" + sc, qno + 1, i + 1);
			chess[sr][sc] = false;

		}
	}

	private static boolean isChessBoardSafe(boolean[][] chess) {

		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				if (chess[i][j])
				{
					if (!isQueenSafe(chess, i, j)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	private static boolean isQueenSafe(boolean[][] chess, int i, int j) {
		int dir[][] = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { +1, -1 }, { 0, -1 }, { -1, -1 } };

		for (int radius = 1; radius <= chess.length; radius++) {

			for (int d = 0; d < dir.length; d++) {
				int rowEn = i + radius * dir[d][0];
				int colEn = i + radius * dir[d][1];
				if(rowEn <0 || colEn<0 || rowEn >=chess[0].length|| colEn>=chess[0].length) {
					break;
				}
//				if(rowEn>0 && colEn>0 && rowEn <chess.length && colEn <chess.length)
//				{
					//System.out.println(i + " " + radius * dir[d][0] + " " + colEn);
					if (chess[rowEn][colEn] == true) {
						return false;
					}
				//}

				
			}
		}
		return true;
	}
}
