package recursions.quesans;

public class Permutate {

	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printPermuatationsOnTheBasisOfAnswer(new StringBuilder("abc"),new
		// StringBuilder());
		//printPermuatationsOnTheBasisOfQuestion(new StringBuilder("abc"), new StringBuilder());
		printUniquePermuatationsOnTheBasisOfQuestion(new StringBuilder("abab"), new StringBuilder());
		System.out.println(count);

	}

	public static void printPermuatationsOnTheBasisOfAnswer(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		for (int i = 0; i < ans.length() + 1; i++) {
			printPermuatationsOnTheBasisOfAnswer(ques, ans.insert(i, ch));
			ans.deleteCharAt(i);
		}
		ques.insert(0, ch);

	}

	public static void printPermuatationsOnTheBasisOfQuestion(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		// char ch= ques.charAt(0);

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			printPermuatationsOnTheBasisOfQuestion(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
	}

	public static void printUniquePermuatationsOnTheBasisOfQuestion(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			count++;
			System.out.println(ans);
			return;
		}
		// char ch= ques.charAt(0);
		boolean[] b = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			if (!b[ch - 'a']) {
				b[ch - 'a'] = true;
				ques.deleteCharAt(i);
				ans.append(ch);
				printUniquePermuatationsOnTheBasisOfQuestion(ques, ans);
				ans.deleteCharAt(ans.length() - 1);
				ques.insert(i, ch);
			}
		}
	}
}
