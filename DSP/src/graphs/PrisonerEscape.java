package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;


import java.util.Scanner;

public class PrisonerEscape
{

	public static class CVertex
	{
		int xc;
		int yc;

		public CVertex(int x, int y)
		{
			this.xc = x;
			this.yc = y;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + xc;
			result = prime * result + yc;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
			{
				return true;
			}
			if (obj == null)
			{
				return false;
			}
			if (!(obj instanceof CVertex))
			{
				return false;
			}
			CVertex other = (CVertex) obj;
			if (xc != other.xc)
			{
				return false;
			}
			if (yc != other.yc)
			{
				return false;
			}
			return true;
		}

	}

	private HashMap<CVertex, HashMap<CVertex, Integer>> vces = new HashMap();

	public boolean containsVertex(CVertex vname)
	{
		return vces.containsKey(vname);
	}

	public void addVertex(CVertex vname)
	{
		if (!containsVertex(vname))
		{
			vces.put(vname, new HashMap<>());
		}
	}

	public boolean containsEdge(CVertex v1, CVertex v2)
	{
		if (containsVertex(v1) && containsVertex(v2))
		{
			return vces.get(v1).containsKey(v2) && vces.get(v2).containsKey(v1);
		} else
		{
			return false;
		}
	}

	public void addEdge(CVertex v1, CVertex v2, int weight)
	{
		if (checkCloseEnough(v1, v2) && containsVertex(v1) && containsVertex(v2))
		{
			vces.get(v1).put(v2, weight);
			vces.get(v2).put(v1, weight);
		}
	}

	public boolean checkCloseEnough(CVertex first, CVertex second)
	{
		int distanceBetweenX = Math.abs(first.xc - second.xc) * Math.abs(first.xc - second.xc);
		int distanceBetweenY = Math.abs(first.yc - second.yc) * Math.abs(first.yc - second.yc);
		int sum = distanceBetweenX + distanceBetweenY;
		double distanceBetweenTwoVertices = Math.sqrt(sum);
		return distanceBetweenTwoVertices <= 200;

	}
	
	

	public CVertex getSPoint()
	{

		HashMap<CVertex, HashMap<CVertex, Integer>> toBeXsorted = new HashMap(vces);

		List<Entry<CVertex, HashMap<CVertex, Integer>>> list = new ArrayList(toBeXsorted.entrySet());
		Collections.sort(list, getXComparator());

		Entry<CVertex, HashMap<CVertex, Integer>> firstEntry = list.get(0);
		int closestY = firstEntry.getKey().yc;
		int closestX = firstEntry.getKey().xc;

		if (closestX > 100)
		{
			return null;
		}
		return new CVertex(0, closestY);
	}

	public CVertex getTPoint(int lastWidth)
	{

		HashMap<CVertex, HashMap<CVertex, Integer>> toBeYsorted = new HashMap(vces);

		List<Entry<CVertex, HashMap<CVertex, Integer>>> list = new ArrayList(toBeYsorted.entrySet());
		Collections.sort(list, getXComparator2());

		Entry<CVertex, HashMap<CVertex, Integer>> firstEntry = list.get(0);
		int closestX = firstEntry.getKey().xc;
		int closestY = firstEntry.getKey().yc;

		if (lastWidth - closestX > 100)
		{
			return null;
		}
		return new CVertex(lastWidth, closestY);
	}

	public Comparator getXComparator()
	{
		Comparator<Entry<CVertex, HashMap<CVertex, Integer>>> valueComparator = new Comparator<Entry<CVertex, HashMap<CVertex, Integer>>>()
		{
			@Override
			public int compare(Entry<CVertex, HashMap<CVertex, Integer>> o1,
					Entry<CVertex, HashMap<CVertex, Integer>> o2)
			{
				CVertex c1x = o1.getKey();
				CVertex c2x = o2.getKey();
				int x1 = c1x.xc;
				int x2 = c2x.xc;
				return x1 - x2;
			}
		};
		return valueComparator;

	}

	public Comparator getXComparator2()
	{
		Comparator<Entry<CVertex, HashMap<CVertex, Integer>>> valueComparator = new Comparator<Entry<CVertex, HashMap<CVertex, Integer>>>()
		{
			@Override
			public int compare(Entry<CVertex, HashMap<CVertex, Integer>> o1,
					Entry<CVertex, HashMap<CVertex, Integer>> o2)
			{
				CVertex c1x = o1.getKey();
				CVertex c2x = o2.getKey();
				int y1 = c1x.yc;
				int y2 = c2x.yc;
				return y2 - y1;
			}
		};
		return valueComparator;

	}

	private class TPair
	{
		//String psf;
		int xc;
		int yc;

		public TPair( int xc,int yc)
		{

		//	this.psf = psf;
			this.xc = xc;
			this.yc=yc;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + xc;
			result = prime * result + yc;
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
			{
				return true;
			}
			if (obj == null)
			{
				return false;
			}
			if (!(obj instanceof TPair))
			{
				return false;
			}
			TPair other = (TPair) obj;
			if (!getOuterType().equals(other.getOuterType()))
			{
				return false;
			}
			if (xc != other.xc)
			{
				return false;
			}
			if (yc != other.yc)
			{
				return false;
			}
			return true;
		}

		private PrisonerEscape getOuterType()
		{
			return PrisonerEscape.this;
		}
	}

	public boolean bfs(CVertex src, CVertex des)
	{

		HashSet<CVertex> visited = new HashSet<>();
		TPair rootPair = new TPair(src.xc,src.yc);
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(rootPair);
		while (queue.size() > 0)
		{
			// 1.Remove from Queue
			TPair rp = queue.removeFirst();

			if (rp.equals(des))
			{
				//System.out.println(rp.psf);
				return true;
			}
		//	System.out.println(rp.vname + "@  " + rp.psf);
			// 2. Mark
			//visited.add(rp);
			// 3.Add the nbr
//			for (String nbr : vces.get(rp.vname).keySet())
//			{
//				if (visited.contains(nbr) == false)
//				{
//					//queue.addLast(new TPair(rp.psf + nbr, nbr));
//				}
//			}

		}
		return false;

	}

	public static void main(String... s)
	{
		int distanceBetweenX = Math.abs(10) * Math.abs(10);
		int distanceBetweenY = Math.abs(130 ) * Math.abs(130);
		int sum = distanceBetweenX + distanceBetweenY;
		double distanceBetweenTwoVertices = Math.sqrt(sum);
		System.out.println(distanceBetweenTwoVertices);
		
//		Scanner sc = new Scanner(System.in);
//		int LPoint = sc.nextInt();
//		int WPoint = sc.nextInt();
//		int numberOfSoldiers = sc.nextInt();
//
//		List<CVertex> cvesList = new ArrayList<>();
//		PrisonerEscape pe = new PrisonerEscape();
//		for (int i = 0; i < numberOfSoldiers; i++)
//		{
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			CVertex cv = new CVertex(x, y);
//			cvesList.add(cv);
//			pe.addVertex(cv);
//
//		}
//
//		CVertex sp = pe.getSPoint();
//		CVertex tp = pe.getTPoint(WPoint);
//		if (sp != null)
//		{
//			cvesList.add(sp);
//
//		}
//		if (tp != null)
//		{
//			cvesList.add(tp);
//
//		}
//		for (int i = 0; i < cvesList.size(); i++)
//		{
//			for (int j = 0; j < cvesList.size(); j++)
//			{
//				if (i != j)
//				{
//					pe.addEdge(cvesList.get(i), cvesList.get(j), 1);
//				}
//			}
//		}

	}

}
