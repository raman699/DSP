package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int ar[] = { 122, 444, 30, 456, 90 };
		System.out.println("enter the number to search");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int pos=-1;
		for ( int i = 0; i < ar.length; i++) {

			if(ar[i]==k)
			{
				pos=i+1;
				break;
			}
				
		}
		
		System.out.println(pos);
	}

}
