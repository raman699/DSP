package strings;

public class Modify1 {

	public static void main(String[] args) {
		String s = modify("BhsSSjj");
		System.out.println(s);

	}

	public static String modify(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if (i % 2 == 0) {

				ch = (char) (ch - 1);
				sb.setCharAt(i, ch);

			} else {
				ch = (char) (ch + 1);
				sb.setCharAt(i, ch);
			}
		}
		return sb.toString();
	}

}
