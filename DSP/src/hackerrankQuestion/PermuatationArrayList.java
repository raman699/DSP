package hackerrankQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PermuatationArrayList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//ArrayList<String> al = permuate(s, "");
		ArrayList<String> bl = permuateNew(s);
		//System.out.println(al.size());
		ArrayList<String> cl= new ArrayList<String>();
		  Iterator itr=bl.iterator();
		  while(itr.hasNext())
		  {
			 cl.add(((String)itr.next()).trim());
		  }
		System.out.println(cl);
		System.out.println(bl.size());
		//print(al, 0);
	}

	public static ArrayList<String> permuate(String ques, String ans) {

		if (ques.length() == 0) {
			// System.out.println(ans);
			ArrayList<String> bal = new ArrayList<String>();
			bal.add(ans);
			return bal;
		}
		ArrayList<String> al1 = new ArrayList<String>();
		for (int i = 0; i < ques.length(); i++) {
			String nans = ans + ques.charAt(i);
			String nques = ques.substring(0, i) + ques.substring(i + 1);
			ArrayList<String> al = permuate(nques, nans);
			al1.addAll(0, al);
		}
		return al1;
	}

	public static void print(ArrayList<String> al, int vidx) {
		if (vidx == al.size()) {
			return;
		}

		print(al, vidx + 1);
		System.out.println(al.get(vidx));
	}

	public static ArrayList<String> permuateNew(String ques) {

		if (ques.length() == 1) {
			// System.out.println(ans);

			ArrayList<String> bal = new ArrayList<String>();
			bal.add(ques + " ");
			return bal;
		}
		ArrayList<String> al1 = new ArrayList<String>();
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
//		for (int i = 0; i < roq.length(); i++) {

			ArrayList<String> al = permuateNew(roq);
			for (String s : al) {
				for (int j = 0; j < s.length(); j++) {
					String leftString = s.substring(0, j);
					String rightString = s.substring(j);
					String tempAns = leftString + ch + rightString;
					al1.add(tempAns);
				}
			}

		//}
		return al1;
	}
}