package recursions.quesans;

public class Keypad {
	static int c = 0;
	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static void main(String[] args) {

		getKeypad("784", "");
		System.out.println(c);
	}

	public static void getKeypad(String ques, String asf) {

		if (ques.length() == 0) {
			c++;
			System.out.println(asf);
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
