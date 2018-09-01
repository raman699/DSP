package recursions.quesans;

public class MazeObs {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = new int[5][5];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = 0;
			}
		}
		maze[0][1] = 'X';
		maze[0][2] = 'X';
		maze[0][3] = 'X';
		maze[2][1] = 'X';
		maze[2][3] = 'X';
		maze[3][3] = 'X';
		maze[4][1] = 'X';
		maze[4][2] = 'X';
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[0].length; j++) {
				visited[i][j] = false;
			}
		}
		floodfill(maze, 0, 0, "", visited);
		System.out.println(count);
	}

	public static void floodfill(int[][] maze, int sr, int sc, String psf, boolean[][] visited) {

		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(psf);
			count++;
			return;
		}
		visited[sr][sc] = true;
		if (sr - 1 >= 0) {

			if (!visited[sr - 1][sc] && maze[sr - 1][sc] != 'X') {

				floodfill(maze, sr - 1, sc, psf + "T", visited);
			}

		}
		if (sc + 1 < maze[0].length) {

			if (!visited[sr][sc + 1] && maze[sr][sc + 1] != 'X') {

				floodfill(maze, sr, sc + 1, psf + "R", visited);
			}

		}
		if (sr + 1 < maze.length) {

			if (!visited[sr + 1][sc] && maze[sr + 1][sc] != 'X') {

				floodfill(maze, sr + 1, sc, psf + "D", visited);
			}

		}
		if (sc - 1 >= 0) {

			if (!visited[sr][sc - 1] && maze[sr][sc - 1] != 'X') {

				floodfill(maze, sr, sc - 1, psf + "L", visited);
			}

		}
		visited[sr][sc] = false;
	}
}
