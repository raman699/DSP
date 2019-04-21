package recursions;

import java.util.ArrayList;

public class SubstringArrayList {

	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static void main(String[] args) {
		ArrayList al = getSSVar("12");
		System.out.println(al.size());
		System.out.println(al);
//[ad, ae, bd, be, cd, ce]

	}

	public static ArrayList<String> getSS(String str) {

		if (str.length() == 1) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			al.add(str);
			return al;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);

		ArrayList<String> recRes = getSS(ros);
		ArrayList<String> fresult = new ArrayList<>();
		for (String val : recRes) {
			fresult.add(val);
			fresult.add(ch + val);
		}
		return fresult;
	}

	public static ArrayList<String> getSSAscii(String str) {

		if (str.length() == 1) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			al.add(str);
			int i = str.charAt(0);
			al.add(i + "");
			return al;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);

		ArrayList<String> recRes = getSSAscii(ros);
		ArrayList<String> fresult = new ArrayList<>();
		for (String val : recRes) {
			fresult.add(val);
			fresult.add(ch + val);
			int i = ch;
			fresult.add(i + val);

		}
		return fresult;
	}

	public static ArrayList<String> getSSVar(String str) {

		if (str.length() == 1) {
			ArrayList<String> al = new ArrayList<>();
			//Integer ch = Integer.parseInt(str);
			int chi=str.charAt(0)-48;
			String code = codes[chi];
			for (int i = 0; i < code.length(); i++) {
				al.add(code.charAt(i) + "");
			}
			return al;
		}
		char ch = str.charAt(0);
		//int chi = Integer.parseInt(ch + "");
		int chi =ch-48;
		String ros = str.substring(1);
		ArrayList<String> recRes = getSSVar(ros);
		ArrayList<String> fresult = new ArrayList<>();
		for (String val : recRes) {

			String code = codes[chi];

			for (int i = 0; i < code.length(); i++) {
				fresult.add(code.charAt(i) + val);
			}

		}
		return fresult;
	}
}