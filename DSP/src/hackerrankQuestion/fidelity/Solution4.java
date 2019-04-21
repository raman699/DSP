package hackerrankQuestion.fidelity;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution4
{

	static HashMap<String, Integer> qb = new HashMap<>();
	static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args)
	{
		// For testing purposes
		list.add("xyzabc");
		list.add("xy");
		list.add("y");
		list.add("z");
		list.add("xyz");
		list.add("xyzab");
		list.add("xyza");
		list.add("xyzabcd");

		int max = -1;
		for (String s : list)
		{
			max = Math.max(maxLengthOfSubstring(s), max);
		}
		System.out.println(max);

	}

	public static int maxLengthOfSubstring(String ques)
	{
		if (ques.isEmpty())
		{
			return 0;
		}
		if (qb.get(ques) != null)
		{
			return qb.get(ques);
		}
		int max = -1;
		if (list.contains(ques))
		{
			for (int i = 0; i < ques.length(); i++)
			{
				String tempString = (ques.substring(0, i) + ques.substring(i + 1));
				int tempChainLength = maxLengthOfSubstring(tempString);

				if (tempChainLength > max)
				{
					max = tempChainLength;
				}
			}
			qb.put(ques, max + 1);

		}

		return max + 1;
	}
}
/*
 * Optional test First Test list.add("a"); list.add("n"); list.add("and");
 * list.add("an"); list.add("abc");
 */
