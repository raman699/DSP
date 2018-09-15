package hackerrankQuestion;

import java.util.Scanner;

public class Countaaa {

	static int count;
	static int count1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		//int i = sc.nextInt();

		String res = countAndAaa(ques, 0);
		String res1 = countAndAaaa(ques, 0);
		 System.out.println(count);
		//System.out.println(res.charAt(i));
		System.out.println(count1);
		//print(res, 0);

	}

	public static String countAndAaa(String ques, int vidx) {

		if (vidx == ques.length() - 1) {
			return "" + ques.charAt(vidx);
		}

		String res = countAndAaa(ques, vidx + 1);
		char ch = ques.charAt(vidx);
		if (!res.isEmpty()) {
			char ch1 = res.charAt(0);

			if (res.length() >= 2) {
				char ch2 = res.charAt(1);
				if (ch == 'a' && ch1 == 'a' && ch2 == 'a') {
					count++;
					res = ch + res;
					//return res;
				}
			}
			else
				res = ch + res;
		} else {
			res = ch + res;
		}
		return res;
	}

	public static String countAndAaaa(String ques, int vidx) {

		if (vidx == ques.length() - 1) {
			return "" + ques.charAt(vidx);
		}

		String res = countAndAaaa(ques, vidx + 1);
		char ch = ques.charAt(vidx);
		if (!res.isEmpty()) {
			char ch1 = res.charAt(0);

			if (res.length() >= 2) {
				char ch2 = res.charAt(1);
				if (ch == 'a' && ch1 == 'a' && ch2 == 'a') {
					count1++;
					if(res.length()>3)
					res=res.substring(3);
					else
						res="";
					//return res;
				}
			}
			else
				res = ch + res;
		} else {
			res = ch + res;
		}
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
