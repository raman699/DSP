package strings;

public class StringBuilderTest {

	public static void main(String[] args) {

		System.out.println(toggle("aaSS"));
	}

	public static String toggle(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {

				char ch1 = (char) (ch - 'A' + 'a');
				sb.setCharAt(i, ch1);
			
			} else if (ch >= 'a' && ch <= 'z') {

				char ch1 = (char) (ch - 'a' + 'A');
				sb.setCharAt(i, ch1);
			}

		}

		return sb.toString();

	}
}
