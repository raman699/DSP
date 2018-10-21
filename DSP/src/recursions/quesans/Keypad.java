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
		StringBuilder sb= new StringBuilder(n+"").reverse();
		getKeypad1(sb.toString(), "");
		
		System.out.println(c);
		System.out.println(al);
		
		al= new ArrayList<String>();
		c=0;
		getKeypad(n+"", "");
		for(String s:al)
		{
			System.out.println(s);
		}
//		System.out.println(al);
//		System.out.println(c);
	}

	public static void getKeypad(String ques, String asf) {

		if (ques.length() == 0) {
			c++;
			//System.out.println(asf);
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
	
	public static void getKeypad1(String ques, String asf) {

		if (ques.length() == 0) {
			c++;
			//System.out.println(asf);
			al.add(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String ans = codes[ch - '0'];

		for (int l = 0; l < ans.length(); l++) {

			getKeypad1(roq,  ans.charAt(l)+asf);
		}

	}

}
