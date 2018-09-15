package hackerrankQuestion;

import java.util.ArrayList;

public class PermuatationArrayList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		ArrayList<String> al= permuate("aab","");
		System.out.println(al.size());
		System.out.println(al);
		print(al,0);
	}

	public static ArrayList<String> permuate(String ques, String ans) {
		
		if(ques.length()==0)
		{
		//	System.out.println(ans);
			ArrayList<String> bal= new ArrayList<String>();
			bal.add(ans);
			return bal;
		}
		ArrayList<String> al1 = new ArrayList<String>();
		for (int i = 0; i < ques.length(); i++) {
			String nans = ans + ques.charAt(i);
			String nques = ques.substring(0,i)+ques.substring(i+1);
			ArrayList<String> al = permuate(nques, nans);
			al1.addAll(0,al);
		}
      return al1;
	}
	
	public static void print(ArrayList<String> al,int vidx)
	{
		if(vidx==al.size())
		{
			return;
		}
		
		print(al,vidx+1);
		System.out.println(al.get(vidx));
	}
}