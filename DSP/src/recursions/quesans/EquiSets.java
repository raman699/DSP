package recursions.quesans;

import java.util.ArrayList;

public class EquiSets {

	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 10, 20, 30, 40, 50 };
		// printEquiSet(ar, 0, new ArrayList<Integer>(), 0, new ArrayList<Integer>(),
		// 0);
		// targetSet(ar, 0, new ArrayList<Integer>(), 0, 50);
		printSSSprintPermuations(new StringBuilder("abc"), new StringBuilder(""));
		//printPermuations("abab", "");
		System.out.println(count);
		// StringBuilder s= new StringBuilder();
		// s.insert(1, 'b');
	}

	public static void printEquiSet(int ar[], int vidx, ArrayList<Integer> set1, int ss1, ArrayList<Integer> set2,
			int ss2) {
		if (vidx == ar.length) {
			if (ss1 == ss2) {
				System.out.println(set1);
				System.out.println(set2);
				count++;
			}
			return;
		}
		set1.add(ar[vidx]);
		printEquiSet(ar, vidx + 1, set1, ss1 + ar[vidx], set2, ss2);
		set1.remove(set1.size() - 1);
		set2.add(ar[vidx]);
		printEquiSet(ar, vidx + 1, set1, ss1, set2, ss2 + ar[vidx]);
		set2.remove(set2.size() - 1);
	}

	public static void targetSet(int ar[], int vidx, ArrayList<Integer> set1, int ss1, int tar) {
		if (vidx == ar.length) {
			if (ss1 == tar) {
				System.out.println(set1);
				// System.out.println(set2);
				count++;
			}
			return;
		}
		targetSet(ar, vidx + 1, set1, ss1, tar);
		set1.add(ar[vidx]);
		targetSet(ar, vidx + 1, set1, ss1 + ar[vidx], tar);
		set1.remove(set1.size() - 1);

	}

	public static void printPermuations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		for (int i = 0; i < ans.length() + 1; i++) {

			printPermuations(roq, ans.substring(0, i) + ch + ans.substring(i));
		}
	}

	public static void printSSSprintPermuations(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		// StringBuilder roq= new StringBuilder(ques.substring(1));
		ques.deleteCharAt(0);

		for (int i = 0; i < ans.length() + 1; i++) {

			StringBuilder sb = new StringBuilder(ans);// = new StringBuilder(ans.substring(0, i)+ch+ans.substring(i));
			// System.out.println(ans);
			sb = ans.insert(i, ch);

			printSSSprintPermuations(ques, sb);
			sb.deleteCharAt(i);
		}
		ques.insert(0, ch);
	}

	public static void printSSSBBprintPermuations(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		// char ch = ques.charAt(0);
		// StringBuilder roq= new StringBuilder(ques.substring(1));
		for (int i = 0; i < ques.length(); i++) {
			char ch1 = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch1);
			printSSSBBprintPermuations(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch1);
		}
	}

	public static void printSSSSprintPermuations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		boolean[] t26 = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch1 = ques.charAt(i);
			
			if (!t26[ch1 - 'a']) {
				t26[ch1 - 'a'] = true;
				String left = ques.substring(0, i);
				String right = ques.substring(i + 1);
				printSSSSprintPermuations(left + right, ans + ch1);
			}
			
		}
	}
}
