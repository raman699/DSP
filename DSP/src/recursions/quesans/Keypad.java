package recursions.quesans;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {
	static ArrayList<String> al= new ArrayList<String>();
	static int c = 0;
	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		getKeypad(n+"", "");
		System.out.println(al);
		System.out.println(c);
	}

	public static void getKeypad(String ques, String asf) {

		if (ques.length() == 0) {
			c++;
			System.out.println(asf);
			al.add(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String ans = codes[ch - '0'];

		for (int l = 0; l < ans.length(); l++) {

			getKeypad(roq, asf + ans.charAt(l));
		}

	}

}
