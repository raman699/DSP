package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class HMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<t;i++)
		{
			String s=sc.nextLine();
			 hfc(s);
		}
		
//		Integer[] one = { 2, 1, 3, 1, 2, 5, 2 };
//		Integer two[] = { 4, 5, 1, 2, 1, 2, 1 };
		// gce2(one, two);
//		Integer ar[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
//		longestSubsequence(ar);

	}

	public static void hfc(String word) {
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < word.length(); i++) {
			if (!hm.containsKey(word.charAt(i))) {
				hm.put(word.charAt(i), 1);
			} else {
				int old = hm.get(word.charAt(i));
				old++;
				hm.put(word.charAt(i), old);
			}
		}
		ArrayList<Character> al = new ArrayList<>(hm.keySet());
		int max = 0;
		Character ch1 = null;
		for (Character ch : al) {
			int val = hm.get(ch);
			if (val > max) {
				max = val;
				ch1 = ch;
			}
		}
		System.out.println(ch1);
	}

	public static void gce1(Integer one[], Integer two[]) {

		HashMap<Integer, Boolean> hm = new HashMap<>();
		// Check for visit
		HashMap<Integer, Boolean> hm1 = new HashMap<>();

		for (int i : one) {
			hm.put(i, false);
		}
		for (int j : two) {
			if (hm.containsKey(j)) {
				hm1.put(j, true);
			}
		}
		ArrayList<Integer> al = new ArrayList<>(hm1.keySet());
		for (int i : al) {
			System.out.println(i);
		}

	}

	public static void gce2(Integer one[], Integer two[]) {
		HashMap<Integer, Integer> fm1 = new HashMap<>();

		for (int i : one) {
			if (!fm1.containsKey(i)) {
				fm1.put(i, 1);
			} else {
				int old = fm1.get(i);
				old++;
				fm1.put(i, old);
			}
		}
		System.out.println(fm1);
		for (int i : two) {
			if (fm1.containsKey(i) && fm1.get(i) > 0) {
				System.out.print(i + " ");
				fm1.put(i, fm1.get(i) - 1);

			}
		}

	}

	public static void longestSubsequence(Integer[] arr) {
		HashMap<Integer, Boolean> lsmap = new HashMap<Integer, Boolean>();
		for (int i : arr) {
			lsmap.put(i, true);
		}
		for (int i : arr) {
			if (lsmap.containsKey(i - 1)) {
				lsmap.put(i, false);
			}
		}
		int maxs = 0;
		ArrayList<Integer> al = new ArrayList<>(lsmap.keySet());
		int start = al.get(0);
		int count = 0;
		for (int key : al) {
			if (lsmap.get(key)) {
				count = 1;
				int temp = key + 1;
				while (lsmap.containsKey(temp)) {
					temp++;
					count++;
				}
				if (count > maxs) {
					maxs = count;
					start = key;
				}
			}
		}
		for (int i = 0; i < maxs; i++) {
			System.out.println(start + i);
		}
	}
}
