package hackerrankQuestion;

import java.util.Scanner;

public class StringIntegerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// divideString("234",4,"");
		Scanner sc = new Scanner(System.in);
		String dividend = sc.next();
		int divisior = sc.nextInt();

		divideString(dividend, divisior, "", false,0);

	}

	public static void divideString(String dividend, int divisior, String ans, boolean vidx,int last) {
		// base condition
		if (dividend.length() == 0) {
			System.out.println(ans);
			return;
		}
		if ((dividend.length() <= (divisior + "").length() && Integer.parseInt(dividend) / divisior == 0)) {
			System.out.println(ans);
			return;
		}

		int i = 1;
		String ques = "";
		int quesi = Integer.parseInt(dividend.substring(0, i));
		String tempdi = "";
		while (quesi / divisior == 0) {

			if(vidx && i>last && last!=0)
			{
				ans=ans+"0";
			}
			i++;
			if (i > dividend.length()) {
				break;
			}
			ques = dividend.substring(0, i);
			quesi = Integer.parseInt(ques);
			tempdi = dividend.substring(i);

		}

		if (quesi / divisior != 0) {
			int rem = quesi % divisior;
			tempdi = rem + tempdi;

			ans = ans + (quesi / divisior);

		}
		if (((quesi % divisior) + "").length() < (divisior + "").length() || quesi==divisior) {
			vidx = true;
			last=((quesi % divisior) + "").length() ;
		}
		else
		{
			vidx=false;
			last=0;
		}
		if (tempdi.substring(0, 1).equals("0")) {
			tempdi = tempdi.substring(1);
		}
		divideString(tempdi, divisior, ans, vidx,last);
	}
}
