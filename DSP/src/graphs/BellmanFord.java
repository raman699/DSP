package graphs;

import java.util.ArrayList;

public class BellmanFord {

	public static class Edge {
		int u;
		int v;
		int wt;

		Edge(int u, int v, int wt) {
			this.u = u;
			this.v = v;
			this.wt = wt;
		}
	}

	public static void main(String[] args) {
		Integer[][] graph = new Integer[4][4];
		graph[0][1] = 2;
		graph[1][3] = 5;
		graph[2][3] = 1;
		graph[0][2] = 4;
		graph[3][2] = 2;
		graph[3][1] = -6;

		bellmanFord(graph, 0);
	}

	public static void bellmanFord(Integer[][] graph, int src) {
		ArrayList<Edge> edges = new ArrayList<>();

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				if (graph[i][j] != null) {
					Edge e = new Edge(i, j, graph[i][j]);
					edges.add(e);
				}
			}
		}
		Integer res[] = new Integer[graph.length];
		res[src] = 0;
		for (int i = 1; i <= graph.length - 1; i++) {
			for (Edge e : edges) {
				if (res[e.u] != null) {
					if (res[e.v] == null || res[e.u] + e.wt < res[e.v]) {
						res[e.v] = res[e.u] + e.wt;
					}
				}
			}
		}
		for (Edge e : edges) {
			if (res[e.u] != null) {
				if (res[e.v] == null || res[e.u] + e.wt < res[e.v]) {
					res[e.v] = res[e.u] + e.wt;
					System.out.println("negative cycle");
					return;
				}
			}
		}
		for (int i : res) {
			System.out.print(i + " ");
		}
	}
}
