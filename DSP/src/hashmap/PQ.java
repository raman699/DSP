package hashmap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 1, 23, 7, 44, 55 };
		print2(arr, 3);

	}

	// space :n time :klogn
	public static void print(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer> ();

		for (int i : arr) {
			pq.add(i);
		}
		for (int i = 0; i < k; i++) {
			System.out.println(pq.remove());
		}
	}
	
	public static void print2(int arr[],int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer> (Collections.reverseOrder());
		
		for(int i=0;i<k;i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]<pq.peek())
			{
				pq.remove();
				pq.add(arr[i]);
			}
		}
		System.out.println(pq);
		
	}
}
