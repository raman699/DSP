package hackerrankQuestion;

import java.util.ArrayList;

public class Check {

	public static void main(String[] args) {
		char ch = 'c';
		String s = "d ";
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<String> al2 = new ArrayList<String>();
		al.add(s);
		for (String s1 : al) {
			for (int j = 0; j < s1.length(); j++) {
				String leftString = s1.substring(0, j);
				String rightString = s1.substring(j);
				String tempAns = leftString + ch + rightString;
				al1.add(tempAns);
			}
		}
		
		
		for(String t:al1)
		{
			System.out.println(t);
		}
		char ch1='b';
		for (String s1 : al1) {
			for (int j = 0; j < s1.length(); j++) {
				String leftString = s1.substring(0, j);
				String rightString = s1.substring(j);
				String tempAns = leftString + ch1 + rightString;
				al2.add(tempAns);
			}
		}
		for(String t:al2)
		{
			System.out.println(t);
		}
	}

}
