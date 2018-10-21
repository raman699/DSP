package hackerrankQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class Combination {

	static HashSet<String> hs = new HashSet<String>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		permutation(s);
	}

	private static void permutation(String string) {
		printPermutation(string, "");
	}

	private static void printPermutation(String string, String permutation) {

		if (string.length() == 0) {
			if (hs.add(permutation)) {
				System.out.println(permutation);

			}
			return;
		}

		for (int i = 0; i < string.length(); i++) {
			char toAppendToPermutation = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);

			printPermutation(remaining, permutation + toAppendToPermutation);
		}
	}

}