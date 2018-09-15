package hackerrankQuestion;

import java.util.Scanner;

public class MoveCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String x = sc.next();
		int i=sc.nextInt();
		str = moveChars(str, 0,x.charAt(0));
		System.out.println(str.charAt(i));

		print(str, 0);

	}

	public static String moveChars(String ques, int vidx, char x) {
		if (vidx == ques.length() - 1) {
			return ques.charAt(vidx)+"";
		}

		String res = moveChars(ques, vidx + 1,x);
		char ch = ques.charAt(vidx);
		
		if (ch == x) {
			res =  res+x;
		} 
		else
			res=ch+res;
			

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
