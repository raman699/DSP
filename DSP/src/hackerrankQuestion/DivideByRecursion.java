package hackerrankQuestion;

import java.util.Scanner;

public class DivideByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int dividend=Integer.parseInt(sc.next());
        int divisor=Integer.parseInt(sc.next());
        divide(dividend, divisor, 0);
	}

	public static void divide(int dividend, int divisor, int quotient) {
		if (dividend - divisor < 0) {

			// quotient = quotient + dividend / divisor;
			System.out.println(quotient);
			return;
		}
		quotient = quotient + 1;
		dividend = dividend - divisor;
		divide(dividend, divisor, quotient);

	}
}
