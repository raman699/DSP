package hackerrankQuestion;

import java.util.Scanner;

public class SumofNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st=sc.next();
		System.out.println(getSum(st, 0));
	}

	public static int getSum(String str, int vidx) {
		if (str.isEmpty()) {
			return 0;
		}
		String cur = str.charAt(0) + "";
		String ros = str.substring(1);
		int sum = getSum(ros, vidx + 1);
		sum = sum + Integer.parseInt(cur);
		return sum;
	}
}
