package arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int ar[] = { 10, 22, 34, 56, 88 };
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
		System.out.println("the position of 10 "+" is"+binarySearch(ar,10));
		System.out.println("the position of 22 "+" is"+binarySearch(ar,22));
		System.out.println("the position of 34 "+" is"+binarySearch(ar,34));
		System.out.println("the position of 56 "+" is"+binarySearch(ar,56));
		System.out.println("the position of 88 "+" is"+binarySearch(ar,88));
		System.out.println("the position of 102 "+" is"+binarySearch(ar,102));
	}

	public static int binarySearch(int[] ar, int k) {
		int beg = 0;
		int last = ar.length - 1;
		int mid = (beg + last) / 2;

		while (beg <= last) {
			if (ar[mid] > k) {
				last = mid-1;
				mid = (beg + last) / 2;
			} else if (ar[mid] < k) {
              beg=mid+1;
              mid = (beg + last) / 2;
			}
			else if(ar[mid]==k)
			{
				return mid+1;
			}
		}
		
		return -1;
	}
}
