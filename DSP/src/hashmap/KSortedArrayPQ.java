package hashmap;

import java.util.PriorityQueue;

public class KSortedArrayPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {30,20,10,60,50,40,80,70};
		int k=2;
		PriorityQueue<Integer>  pq= new PriorityQueue<Integer> ();
		
		for(int i=0;i<=k;i++)
		{
			pq.add(arr[i]);
		}

		for(int j=k+1;j<arr.length;j++)
		{
			System.out.println(pq.remove());
			pq.add(arr[j]);
		}
		for(int i=0;i<=k;i++)
		{
			System.out.println(pq.remove());
		}
		
	}

}
