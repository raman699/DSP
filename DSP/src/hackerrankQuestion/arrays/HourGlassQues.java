package hackerrankQuestion.arrays;

import java.util.Collections;
import java.util.PriorityQueue;


public class HourGlassQues {

	static int count;
	static int sumArray[]= new int[16];
	static PriorityQueue<Integer> pq= new PriorityQueue(Collections.reverseOrder());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		show(arr);
		System.out.println(pq.peek());

	}

	public static void show(int arr[][]) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i >= 0 && i <= 3 && j >= 0 && j <= 3) {
					System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
					System.out.println(" " + " " + arr[i + 1][j + 1] + " " + " ");
					System.out.println(arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]);
					count++;
					int sum=arr[i][j]+arr[i][j + 1]+arr[i][j + 2]+arr[i + 1][j + 1]+arr[i + 2][j]+arr[i + 2][j + 1]+arr[i + 2][j + 2];
					pq.add(sum);
				}
			}
			//System.out.println();
		}
	}
}
