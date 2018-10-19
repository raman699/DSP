package hackerrankQuestion;

import java.util.Scanner;

public class ParenthesisRecur {

	public static String check(String ques, String ans, int vidx) {
		if ((vidx == ques.length() - 1)) {

			return ans;
		}

		char ch = ques.charAt(vidx);
		if (ch == '(') {
			ans = ans + ch;
		} else if (ch == ')') {
			if (ques.charAt(vidx - 1) == ')') {
				ans = ans;
			} 
			else
			{
				ans=ans+ch;
			}
		}
		else
		{
			if(ans.contains("("))
			{
				if(ans.charAt(ans.length()-1)!=')')
				{
					ans=ans+ch;
				}
			}
		}
		ans=check(ques,ans,vidx+1);
		return ans;
	}

	public static void main(String... s) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(check(str, "", 0));
	}
}
