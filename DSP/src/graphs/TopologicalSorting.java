package graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class TopologicalSorting {

	public static void main(String[] args) {
		boolean graph[][]= new boolean[7][7];
		graph[0][1]=true;
		graph[0][3]=true;
		graph[1][2]=true;
		graph[2][3]=true;
		graph[4][3]=true;
		graph[4][5]=true;
		graph[5][6]=true;
		graph[6][2]=true;

		LinkedList<Integer> results= new LinkedList<Integer>();
		HashSet<Integer> visitied= new HashSet<>();
		for(int vtx=0;vtx<graph.length;vtx++)
		{
			if(!visitied.contains(vtx))
			{
				topologicalSort(graph,vtx,visitied,results);
			}
		}
		System.out.println(results);
	}

	public static  void  topologicalSort(boolean graph[][], int src,HashSet<Integer> visited, LinkedList<Integer> stack)
	{
		visited.add(src);
		for(int nbr=0;nbr<graph.length;nbr++)
		{
			if(graph[src][nbr]==true && !visited.contains(nbr))
			{
				topologicalSort(graph,nbr,visited,stack);
			}
		}
		stack.addFirst(src);
	}
}
