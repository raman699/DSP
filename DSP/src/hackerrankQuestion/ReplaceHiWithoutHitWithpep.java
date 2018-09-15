package hackerrankQuestion;

import java.util.Scanner;

public class ReplaceHiWithoutHitWithpep {


	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques = sc.next();
		int i=sc.nextInt();

		String res = countAndDelete(ques, 0);
		//System.out.println(count);
		System.out.println(res.charAt(i));
		print(res,0);

	}

	public static String countAndDelete(String ques, int vidx) {

		if (vidx == ques.length() - 1) {
			return "" + ques.charAt(vidx);
		}

		String res = countAndDelete(ques, vidx + 1);
		char ch = ques.charAt(vidx);
		if (!res.isEmpty()) {
			char ch1 = res.charAt(0);
			
			if(res.length()>1)
			{
				char ch2=res.charAt(1);
				if(ch=='h' && ch1=='i' && ch2=='t' )
				{
					res=ch+res;
					return res;
				}
			}

			if (ch == 'h' && ch1 == 'i') {
				count++;
				res="pep"+res.substring(1);
				//res = res.substring(1);
			} else {
				res = ch + res;
			}
		}
		else
		{
			res=ch+res;
		}
		return res;
	}
	public static void print(String str, int vidx) {
		if (vidx == str.length()) {
			return;
		}
		System.out.print(str.charAt(vidx));
		print(str, vidx + 1);
	}
}
