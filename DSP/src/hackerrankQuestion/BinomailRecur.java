package hackerrankQuestion;

import java.util.Scanner;

public class BinomailRecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		forRows(n, 0);

	}

	public static void forRows(int n, int row) {
		if (row == n) {
			return;
		}
		printNumber(row,0,1);
		System.out.println();
		forRows(n, row+1);
	}

	public static void printNumber(int row, int col,int temp) {
		if (col > row) {
			return;
		}
		
		if(col==0)
		{
			temp=1;
			System.out.print(1 + "\t");
		}
		else
		{
			temp = (temp * (row - (col - 1))) / (col);
			System.out.print(temp + "\t");
		}
		printNumber(row, col+1,temp);
	}
}
