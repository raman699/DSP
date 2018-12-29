package recursions.quesans;

public class Subsequence {

	public static void main(String[] args) {
		getSS("abc","");

	}

	public static void getSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		getSS(roq, ans);
		getSS(roq, ans + ch);

	}
	public static void getAsciiSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		getAsciiSS(roq, ans);
		getAsciiSS(roq, ans + ch);
		int i=ch;
		getAsciiSS(roq, ans + i);
		

	}
}
