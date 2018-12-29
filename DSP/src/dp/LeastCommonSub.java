package dp;

public class LeastCommonSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcs("abcd", "abed"));

	}

	public static int lcs(String str, String str1) {
		int strg[][] = new int[str.length() + 1][str.length() + 1];

		for (int i = str.length() - 1; i >= 0; i--) {
			for (int j = str1.length() - 1; j >= 0; j--) {
				if (str.charAt(i) == str1.charAt(j)) {
					strg[i][j] = strg[i + 1][j + 1] + 1;
				} else
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
			}
		}
		return strg[0][0];

	}
}
