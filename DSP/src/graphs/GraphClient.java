package graphs;

public class GraphClient {

	public static void main(String... s) {

		Graph g= new Graph();
		g.addVertex("A");
		g.addVertex("G");
		g.addVertex("F");
		g.addVertex("E");
		g.addVertex("D");
		g.addVertex("C");
		g.addVertex("B");
		
		
		g.addEdge("A", "B", 10);
		g.addEdge("B", "C", 10);
		g.addEdge("C", "D", 10);
		g.addEdge("A", "D", 40);
		g.addEdge("D", "E", 2);
		g.addEdge("E", "F", 3);
	//	g.addEdge("F", "G", 3);
		g.addEdge("E", "G", 8);
//
//		g.addEdge("C","F", 8);
		
		//disconnected
		
		//g.addEdge("A", "D", 40);
//		g.addEdge("E", "G", 8);
//		g.addEdge("A", "B", 10);
//		g.addEdge("B", "C", 10);
//		g.addEdge("C", "D", 10);
//		g.addEdge("D", "E", 2);
//		g.addEdge("E", "F", 3);
		//g.addEdge("F", "G", 3);

	//	g.addEdge("C","F", 8);
	//	g.display();
		
		//g.removeVetex("D");
		//g.display();
		//System.out.println(g.hasPath("A", "D"));
		
		//g.multiSolver("A","G",6,55);
		
		//System.out.println(g.bfs("A", "G"));
		//g.bft();
		//System.out.println(g.isCyclic());
		//System.out.println(g.gccComponent());
		//g.dfs("A", "G");
		//g.djikstra("A");
//		Graph mst=g.prims();
//		System.out.println("-----------------------");
//		mst.display();
		System.out.println(g.isBipartite());
		
		
	}
}
