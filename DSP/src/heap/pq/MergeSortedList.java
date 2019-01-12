package heap.pq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//mereg ksorted linked list
public class MergeSortedList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		
		list.add(new ArrayList(Arrays.asList(10,20,30,40)));
		list.add(new ArrayList(Arrays.asList(11,15,19,45,55)));
		list.add(new ArrayList(Arrays.asList(22,23,37,39)));
		list.add(new ArrayList(Arrays.asList(5,16,24)));
		
		System.out.println(list);
		PriorityQueue<Node> minpq= new PriorityQueue();
		
		for(int i=0;i<list.size();i++)
		{
			Node node = new Node(i,0,list.get(i).get(0));
		    minpq.add(node);	
		}
		while(minpq.size()>0)
		{
			Node node =minpq.remove();
			System.out.println(node.val+" ");
			node.didx++;
			if(node.didx<list.get(node.lidx).size())
			{
				node.val=list.get(node.lidx).get(node.didx);
				minpq.add(node);
			}
		}

		System.out.println("..");
	}

	private static class Node implements Comparable
	{

		int didx;
		int lidx;
		
		int val;
		Node(int lidx,int didx,int val)
		{
			this.lidx=lidx;
			this.didx=didx;
			this.val=val;
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return this.val-((Node)o).val;
					
		}
		
	}
}
