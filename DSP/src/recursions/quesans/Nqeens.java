package recursions.quesans;

public class Nqeens {

	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueens(new boolean[4][4], "", 1, 1);
		System.out.println(count);

	}

	public static void nQueens(boolean chess[][], String asf, int qno, int bno) {

		if (qno > chess.length) {
			count++;
			if (isChessBoardSafe(chess)) {
				System.out.println(asf);
			}

			return;

		}

		for (int i = bno; i <= chess.length * chess.length; i++) {

			int sr = (i - 1) / chess.length;
			int sc = (i - 1) % chess.length;

			chess[sr][sc] = true;
			nQueens(chess, asf + sr + "" + sc, qno + 1, i + 1);
			chess[sr][sc] = false;

		}
	}

	private static boolean isChessBoardSafe(boolean[][] chess) {

		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess.length; j++) {
				if (!isQueenSafe(chess, i, j)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isQueenSafe(boolean[][] chess, int i, int j) {
		int dir[][] = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { +1, -1 },{0,-1},{-1,-1} };

		for (int radius = 0; radius < chess.length; radius++) {

			for(int d=0;d<dir.length;d++)
			{
				int rowEn=i+radius*dir[i][0];
				int colEn=i+radius*dir[0][j];
				if(chess[rowEn][colEn]==true)
				{
					return false;
				}
			}
		}
		return true;
	}
}
