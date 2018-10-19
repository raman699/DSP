package hackerrankQuestion;

import java.util.Scanner;

public class StringTwinWithoutOverlap {
	static int c = 0;

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		count(s, 0);
		System.out.println(c);
	}

	public static void count(String str, int vidx) {

		if (vidx >= str.length() - 2) {
			return;
		}
		if (vidx + 2 <str.length() &&str.charAt(vidx) == str.charAt(vidx + 2)) {
			c++;
			
			count(str, vidx + 3);
		}
		else
		{
			count(str, vidx + 1);
		}
	}

}