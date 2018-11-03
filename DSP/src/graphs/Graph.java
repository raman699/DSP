package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

import graphs.Graph.PrimsPair;

public class Graph {

	private HashMap<String, HashMap<String, Integer>> vces = new HashMap();

	public int countvertices() {
		return vces.size();
	}

	public boolean containsVertex(String vname) {
		return vces.containsKey(vname);
	}

	public void addVertex(String vname) {
		if (!containsVertex(vname)) {
			vces.put(vname, new HashMap<>());
		}
	}

	public boolean containsEdge(String v1, String v2) {
		if (containsVertex(v1) && containsVertex(v2)) {
			return vces.get(v1).containsKey(v2) && vces.get(v2).containsKey(v1);
		} else {
			return false;
		}
	}

	public void addEdge(String v1, String v2, int weight) {
		if (containsVertex(v1) && containsVertex(v2)) {
			vces.get(v1).put(v2, weight);
			vces.get(v2).put(v1, weight);
		}
	}

	public void removeEdge(String v1, String v2, int weight) {
		if (containsEdge(v1, v2)) {
			vces.get(v1).remove(v2);
			vces.get(v2).remove(v1);
		}
	}

	public int countEdges() {
		int size = 0;

		for (String key : vces.keySet()) {
			size += vces.get(key).size();
		}
		return size / 2;
	}

	public void display() {

		System.out.println("----------------");
		for (String key : vces.keySet()) {
			System.out.println(key + "->" + vces.get(key));

		}
		System.out.println("----------------");
	}

	public void removeVetex(String vname) {
		if (containsVertex(vname)) {
			for (String nbr : vces.get(vname).keySet()) {
				vces.get(nbr).remove(vname);
			}

			vces.remove(vname);
		}
	}

	// HashMap<String, Boolean> color = new HashMap<>();

	public boolean hasPath(String v1, String v2) {

		boolean res = hasPath(v1, v2, new HashSet<String>());

		return res;
	}

	public boolean hasPath(String v1, String v2, HashSet<String> visited) {

		boolean hasPath = false;
		if (v1.equals(v2)) {
			return true;
		}
		visited.add(v1);
		for (String key : vces.get(v1).keySet()) {

			if (!visited.contains(key)) {

				hasPath = hasPath(key, v2, visited);
			}

			if (hasPath) {
				return true;
			}
		}

		return hasPath;

	}

	public void printAllPath(String v1, String v2) {

		printAllPath(v1, v2, new HashSet<String>(), "");
	}

	private void printAllPath(String v1, String v2, HashSet<String> visited, String psf) {

		if (v1.equals(v2)) {

			System.out.println(psf + v2);

		}
		visited.add(v1);
		for (String key : vces.get(v1).keySet()) {

			if (!visited.contains(key)) {

				printAllPath(key, v2, visited, psf + v1);
			}

		}
		visited.remove(v1);

	}

	int sc;
	String scp;
	int lc;
	String lcp;
	int jlc;
	String jlp;

	int kl;
	String klp;
	PriorityQueue<Pair> pq;

	private class Pair implements Comparable {

		int cost;
		String path;

		Pair(int cost, String path) {
			this.cost = cost;
			this.path = path;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return this.cost - ((Pair) o).cost;
		}

	}

	public void multiSolver(String src, String des, int k, int jlw) {

		sc = Integer.MAX_VALUE;
		scp = "";
		lc = Integer.MIN_VALUE;
		lcp = "";
		jlc = Integer.MAX_VALUE;
		jlp = "";
		pq = new PriorityQueue();
		multiSolver(src, des, new HashSet<String>(), "", 0, k, jlw);
		System.out.println(scp + "@" + sc);
		System.out.println(lcp + "@" + lc);
		System.out.println(jlc + "@" + jlp);
		System.out.println("kth largest" + pq.peek().path + pq.peek().cost);
	}

	private void multiSolver(String src, String des, HashSet<String> visited, String psf, int csf, int k, int jlw) {
		if (src.equals(des)) {

			System.out.println(psf + des + "@" + csf);
			// System.out.println(csf);
			if (csf < sc) {
				sc = csf;
				scp = psf + des;
			}
			if (csf > lc) {
				lc = csf;
				lcp = psf + des;

			}
			if (csf > jlw && csf < jlc) {
				jlc = csf;
				jlp = psf + des;
			}
			if (pq.size() < k) {
				pq.add(new Pair(csf, psf + des + "@" + csf));
			} else {
				if (csf > pq.peek().cost) {
					pq.remove();
					pq.add(new Pair(csf, psf + des + "@" + csf));
				}
			}
		}
		visited.add(src);
		for (String key : vces.get(src).keySet()) {

			if (!visited.contains(key)) {

				multiSolver(key, des, visited, psf + src, csf + vces.get(src).get(key), k, jlw);

			}

		}
		visited.remove(src);

	}

	private class TPair {
		String psf;
		String vname;

		public TPair(String psf, String vname) {

			this.psf = psf;
			this.vname = vname;
		}
	}

	public boolean bfs(String src, String des) {

		HashSet<String> visited = new HashSet<>();
		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		while (queue.size() > 0) {
			// 1.Remove from Queue
			TPair rp = queue.removeFirst();

			if (rp.vname.equals(des)) {
				System.out.println(rp.psf);
				return true;
			}
			System.out.println(rp.vname + "@  " + rp.psf);
			// 2. Mark
			visited.add(rp.vname);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(rp.psf + nbr, nbr));
				}
			}

		}
		return false;

	}

	public boolean dfs(String src, String des) {

		HashSet<String> visited = new HashSet<>();
		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> stack = new LinkedList<>();
		stack.addFirst(rootPair);
		while (stack.size() > 0) {
			// 1.Remove from stack
			TPair rp = stack.removeFirst();

			if (rp.vname.equals(des)) {
				System.out.println(rp.psf);
				return true;
			}
			System.out.println(rp.vname + "@  " + rp.psf);
			// 2. Mark
			visited.add(rp.vname);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					stack.addFirst(new TPair(rp.psf + nbr, nbr));
				}
			}

		}
		return false;

	}

	public void bft() {

		HashSet<String> visited = new HashSet<>();
		for (String vname : vces.keySet()) {
			if (visited.contains(vname) == false) {
				bftComponent(vname, visited);
			}
		}

	}

	public void bftComponent(String src, HashSet<String> visited) {

		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		while (queue.size() > 0) {
			// 1.Remove from Queue
			TPair rp = queue.removeFirst();

			System.out.println(rp.vname + "@" + rp.psf);
			// 2. Mark
			visited.add(rp.vname);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (!visited.contains(nbr)) {
					queue.addLast(new TPair(rp.psf + nbr, nbr));
				}
			}

		}

	}

	public void dft() {

		HashSet<String> visited = new HashSet<>();
		for (String vname : vces.keySet()) {
			if (visited.contains(vname) == false) {
				dftComponent(vname, visited);
			}
		}
	}

	public void dftComponent(String src, HashSet<String> visited) {

		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> stack = new LinkedList<>();
		stack.addFirst(rootPair);
		while (stack.size() > 0) {
			// 1.Remove from Queue
			TPair rp = stack.removeFirst();

			System.out.println(rp.vname + "@" + rp.psf);
			// 2. Mark
			visited.add(rp.vname);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					stack.addFirst(new TPair(rp.psf + nbr, nbr));
				}
			}

		}

	}

	public boolean isConnected() {
		HashSet<String> visited = new HashSet<>();
		ArrayList<String> vnames = new ArrayList<>(vces.keySet());
		bftComponent(vnames.get(0), visited);

		if (visited.size() == vces.size()) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<String> gccComponent() {

		ArrayList<String> res = new ArrayList<>();
		HashSet<String> visited = new HashSet<>();
		for (String vname : vces.keySet()) {
			if (!visited.contains(vname)) {
				String s = gccComponent(vname, visited);
				res.add(s);
			}
		}
		return res;
	}

	public String gccComponent(String src, HashSet<String> visited) {

		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		String s = "";
		while (queue.size() > 0) {
			TPair rp = queue.removeFirst();
			if (!visited.contains(rp.vname)) {
				s += rp.vname;
			}
			visited.add(rp.vname);
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(rp.psf + nbr, nbr));
				}
			}

		}
		return s;

	}

	public boolean isCyclic() {

		HashSet<String> visited = new HashSet<>();
		for (String vname : vces.keySet()) {
			if (visited.contains(vname) == false) {
				boolean cyclic = cyclicComponent(vname, visited);
				if (cyclic == true) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean cyclicComponent(String src, HashSet<String> visited) {

		TPair rootPair = new TPair(src, src);
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		while (queue.size() > 0) {
			// 1.Remove from Queue
			TPair rp = queue.removeFirst();
			if (visited.contains(rp.vname) == true) {
				return true;
			}
			// 2. Mark
			visited.add(rp.vname);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(rp.psf + nbr, nbr));
				}
			}

		}
		return false;

	}
	
	class DkikPair implements Comparable<DkikPair>
	{
		String name;
		String psf;
		int csf;
		DkikPair(String name,String psf,int csf)
		{
			this.name=name;
			this.psf=psf;
			this.csf=csf;
		}
		@Override
		public int compareTo(DkikPair o) {
			// TODO Auto-generated method stub
			return this.csf-o.csf;
		}
	}
	public void djikstra(String src)
	{
		PriorityQueue<DkikPair> queue= new PriorityQueue<DkikPair>();
		HashSet<String> visitied= new HashSet();
		
		queue.add(new DkikPair(src,src,0));
		
		while(queue.size()>0)
		{
			DkikPair rp=queue.remove();
			
			if(visitied.contains(rp.name))
			{
				continue;
			}
			visitied.add(rp.name);
			System.out.println(rp.name+"@  "+rp.psf+" "+rp.csf);
			
			for(String nbr: vces.get(rp.name).keySet())
			{
				if(!visitied.contains(nbr))
				{
					queue.add(new DkikPair(nbr,rp.psf+nbr,rp.csf+vces.get(rp.name).get(nbr)));
				}
			}
		}
	}
	
	class PrimsPair implements Comparable<PrimsPair>
	{
		String vname;
		String pname;
		int ecost;
		PrimsPair(String vname,String pname,int ecost)
		{
			this.vname=vname;
			this.pname=pname;
			this.ecost=ecost;
		}
		@Override
		public int compareTo(PrimsPair o) {
			return this.ecost-o.ecost;
		}
	}
	
	public Graph prims()
	{
		Graph mst= new Graph();
		HashSet<String> visitied= new HashSet<String>();
		
		PriorityQueue<PrimsPair> queue= new PriorityQueue<PrimsPair>();
		ArrayList<String> al=new ArrayList<>(vces.keySet());
		queue.add(new PrimsPair(al.get(0),null,0));
		
		while(queue.size()>0)
		{
			//remove
			PrimsPair rp= queue.remove();
			
			//mark *
			if(visitied.contains(rp.vname))
			{
				continue;
			}
			visitied.add(rp.vname);
			//work
			mst.addVertex(rp.vname);
			if(rp.pname!=null)
			{
				mst.addEdge(rp.vname, rp.pname, rp.ecost);
			}
			//add visitied *
			
			for(String nbr:vces.get(rp.vname).keySet())
			{
				if(!visitied.contains(nbr))
				{
					queue.add(new PrimsPair(nbr,rp.vname,vces.get(rp.vname).get(nbr)));
				}
			}
		}
		
		return mst;
	}
	
	class BPair
	{
		String name;
		boolean color;
		
		public BPair(String name, boolean color)
		{
			this.name=name;
			this.color=color;
		}
	}
	
	public boolean isBipartite()
	{
		HashMap<String,Boolean> visited = new HashMap<>();
		for (String vname : vces.keySet()) {
			if (visited.containsKey(vname) == false) {
				boolean isBipartite = bipartiteComponent(vname, visited);
				if (isBipartite == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean bipartiteComponent(String src, HashMap<String,Boolean> visited) {

		BPair rootPair = new BPair(src, false);
		LinkedList<BPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		while (queue.size() > 0) {
			// 1.Remove from Queue
			BPair rp = queue.removeFirst();
			if (visited.containsKey(rp.name)) {
				boolean old= visited.get(rp.name);
				if(old==rp.color)
				{
					continue;
				}
				return false;
			}
			// 2. Mark
			visited.put(rp.name,rp.color);
			// 3.Add the nbr
			for (String nbr : vces.get(rp.name).keySet()) {
				if (visited.containsKey(nbr) == false) {
					queue.addLast(new BPair(nbr,!rp.color));
				}
			}

		}
		return true;

	}
}
