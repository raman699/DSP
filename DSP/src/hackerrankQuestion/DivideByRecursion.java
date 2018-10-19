package hackerrankQuestion;

import java.util.Scanner;

public class DivideByRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        long dividend=Long.parseLong(sc.next());
        long divisor=Long.parseLong(sc.next());
        divide(dividend, divisor, 0);
	}

	public static void divide(long dividend, long divisor, long quotient) {
		if (dividend - divisor < 0) {

			// quotient = quotient + dividend / divisor;
			System.out.println(quotient);
			return;
		}
		System.out.println(dividend);
		quotient = quotient + 1;
		dividend = dividend - divisor;
		divide(dividend, divisor, quotient);

	}
}
