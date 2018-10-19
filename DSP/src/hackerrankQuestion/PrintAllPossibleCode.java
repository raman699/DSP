package hackerrankQuestion;

import java.util.Scanner;

public class PrintAllPossibleCode {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		printAllPossibleCode(s,"",0);

	}

	public static void printAllPossibleCode(String ques,String ans,int vidx)
	{
		if(vidx==ques.length())
		{
			System.out.println(ans);
			return;
		}
		
		String ch1=ques.substring(vidx,vidx+1);
		int i1=Integer.parseInt(ch1);
		char ch1new=(char) (96+i1);
		String ans1=ans+ch1new;
		if(i1<=26)
		{
		printAllPossibleCode(ques,ans1,vidx+1);
		}
		if(vidx+2<=ques.length())
		{
			String ch2=ques.substring(vidx,vidx+2);
			int i2=Integer.parseInt(ch2);
			char ch2new=(char)(96+i2);
			String ans2=ans+ch2new;
			if(i2<=26)
			{
			printAllPossibleCode(ques,ans2,vidx+2);
			}
		}
		
		
;
		
	}
}
