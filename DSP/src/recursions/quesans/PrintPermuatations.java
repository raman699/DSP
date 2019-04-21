package recursions.quesans;

public class PrintPermuatations
{

	public static int counter;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		permutateWithStringsOnTheBasisOfQuestion("abc", "");
		System.out.println(counter);

	}

	public static void permutateWithStringsOnTheBasisOfQuestion(String ques, String ans)
	{
		if (ques.length() == 0)
		{
			System.out.println(ans);
			counter++;
			return;
		}
		for (int i = 0; i < ques.length(); i++)
		{
			char ch = ques.charAt(i);
			String left = ques.substring(0, i);
			String right = ques.substring(i + 1);
			permutateWithStringsOnTheBasisOfQuestion(left + right, ans + ch);
		}
	}
	public static void printPermuationsOnTheBasisOfAnswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			counter++;
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		for (int i = 0; i < ans.length() + 1; i++) {

			printPermuationsOnTheBasisOfAnswer(roq, ans.substring(0, i) + ch + ans.substring(i));
		}
	}


}
