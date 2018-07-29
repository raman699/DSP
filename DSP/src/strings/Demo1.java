package strings;

public class Demo1 {

	public static void main(String... s) {
		String r = "raman";
//		printAllChar(r);
//		printAllSubstring(r);
		areSubstringPallindrome("amman");

	}

	public static void printAllChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static void printAllSubstring(String str) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
				c++;
			}
		}
		// System.out.println(c);
	}

	public static boolean isPallindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < str.length() / 2) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void areSubstringPallindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.print(str.substring(i, j) + " is  pallindrome ");
				boolean pallindrome = isPallindrome(str.substring(i, j));
				System.out.println(pallindrome);

			}
		}
	}
}
