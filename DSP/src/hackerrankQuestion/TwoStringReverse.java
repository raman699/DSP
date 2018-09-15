package hackerrankQuestion;

import java.util.Scanner;

public class TwoStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String str= sc.next();
		String str2= sc.next();
		System.out.println(isReverse(str, str2, 0, str2.length()-1));

	}

	public static boolean isReverse(String str, String str2, int vidx, int vidx2) {
		boolean res = false;
		if (str.length() != str2.length()) {
			return false;
		}
		if (vidx==str.length()) {
			return true;
		}
		res = isReverse(str, str2, vidx + 1, vidx2 - 1);

		if (res) {
			if (str.charAt(vidx) == str2.charAt(vidx2)) {
				res = true;

			}
			else
				res=false;
		} else {
			res = false;

		}

		return res;
	}
}
