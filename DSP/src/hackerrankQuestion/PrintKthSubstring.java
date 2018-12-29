package hackerrankQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PrintKthSubstring {

	static int totalCut;
	static int count = 0;
	static HashMap<String,Boolean> hm= new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		totalCut = sc.nextInt();
		String s = sc.next();

		printKthLevelSubstrings(new String(s), 0, 0, new ArrayList<String>(), 0);
		System.out.println(count);
	}

	public static void printKthLevelSubstrings(String ques, int k, int vidx, ArrayList<String> al, int tc) {
		if (k == totalCut) {
			al.add(ques.toString());
			for (String f : al) {
				if (hm.get(f) !=null) {
					if(hm.get(f))
					{
						tc++;
					}
				}
				else 
				{
					if(isPallindrome(f))
					{
						hm.put(f, true);
						tc++;
					}
					else
						hm.put(f, false);
				}
					
			}
			count += tc;
			for (int i = 0; i < totalCut; i++) {
				if (al.size() > 1) {
					al.remove(al.size() - 1);
				}

			}
			return;
		}
		if (ques.isEmpty()) {
			return;
		}
		for (int i = 0; i < ques.length() && i < totalCut + 1; i++)// to optimize
		{

			String temp = ques.substring(0, i + 1);
			String roq = ques.substring(i + 1);

			al.add(temp);

			if (al.size() < totalCut + 1 && !roq.isEmpty()) {
				printKthLevelSubstrings(roq, k + 1, vidx + 1, al, tc);
			}
		}

		al.clear();
		tc = 0;
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
}
