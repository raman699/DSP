package hackerrankQuestion;

import java.util.Scanner;

public class ReplaceDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = sc.nextInt();
		str = addAsterik(str, 0);
		System.out.println(str.charAt(x));

		print(str, 0);

	}

	public static String addAsterik(String ques, int vidx) {
		if (vidx >= ques.length() - 1) {
			return "" + ques.charAt(vidx);
		}

		String res = addAsterik(ques, vidx + 1);
		char ch = ques.charAt(vidx);
		char ch1 = res.charAt(0);
		if (ch1 == ch) {
			// String left=ques.substring(0, vidx+1);

			String right = ques.substring(vidx + 1);
			res = ch + "*" + res;

		} else
			res = ch + res;

		return res;
	}

	public static void print(String str, int vidx) {
		if (vidx == str.length()) {
			return;
		}
		System.out.print(str.charAt(vidx));
		print(str, vidx + 1);
	}
}
