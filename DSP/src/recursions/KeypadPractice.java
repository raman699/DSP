package recursions;

import java.util.ArrayList;

public class KeypadPractice
{
	static String[] codes = { ".;", "abc", "de", "fghi", "jkl", "mn", "opq", "rstu", "vw", "xyz" };

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> al= getKeypadCombinations("12");
		System.out.println(al);

	}

	public static ArrayList<String> getKeypadCombinations(String str)
	{
		if (str.length() == 0)
		{
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> ra = getKeypadCombinations(ros);
		ArrayList<String> na = new ArrayList<String>();

		int intValue = (int) ch-48;
		for (int i = 0; i < codes[intValue].length(); i++)
		{
			for (String s : ra)
			{
				na.add(codes[intValue].charAt(i)+s);
			}
		}
		return na;

	}
}
