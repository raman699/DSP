package graphs;

public class FloydWarshall {

	public static void main(String[] args) {
		Integer graph[][] = new Integer[4][4];

		graph[0][1] = 5;
		graph[0][2] = 10;
		graph[0][3] = 3;
		graph[1][3] = 2;
		graph[2][3] = 3;
		graph[3][1] = 1;
		graph[3][2] = 2;

		graph[0][0] = 0;
		graph[1][1] = 0;
		graph[2][2] = 0;
		graph[3][3] = 0;
		floyd(graph);

	}

	public static void floyd(Integer[][] graph) {

		for (int ind = 0; ind < graph.length; ind++) {
			for (int src = 0; src < graph.length; src++) {
				for (int des = 0; des < graph.length; des++) {

					if (src == ind || ind == des) {
						continue;
					} else if (graph[src][ind] == null || graph[ind][des] == null) {
						continue;
					} else if (graph[src][des] == null || graph[src][ind] + graph[ind][des] < graph[src][des]) {
						graph[src][des] = graph[src][ind] + graph[ind][des];
					}
				}
			}
		}

		for (int src = 0; src < graph.length; src++) {
			for (int des = 0; des < graph.length; des++) {
				System.out.print(graph[src][des]+"\t");
			}
			System.out.println();
		}

	}
}
//first loop works for every intermediate
//we iterate over one row and column for each intermediate
//the agian
