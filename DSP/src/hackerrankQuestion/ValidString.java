package hackerrankQuestion;

import java.util.Scanner;

public class ValidString {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = "[a+{h+(c+d)+e}+f]";
		String s= sc.next();

		boolean valid = false;
		for (int i = 0; i < s.length(); i++) {
			valid = isValid(s.charAt(i));
			if (!valid) {
				break;
			}
		}
		if(!valid)
		{
			System.out.println("false");
		}
		else if (stack.isEmpty() && valid) {
			System.out.println("true");
		} else if (!stack.isEmpty()) {
			System.out.println("false");

		}

	}

	public static boolean check(String str,int vidx)
	{
		boolean valid = false;
		for (int i = 0; i < str.length(); i++) {
			valid = isValid(str.charAt(i)+"",vidx+1);
			
			if (!valid) {
				break;
			}
		}
	}
	public static boolean isValid(String str,int vidx) {
		
			char ch = (char) vidx;
			char chTop = (char) stack.top();
			if(ch != '('&& ch!= '{' && ch!='[' &&
	      		ch != ')'&& ch!= '}' && ch!=']')
			{
				return true;
			}
			 if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(vidx);
				return true;
			}
			if (chTop == '(' && ch != ')') {
				System.out.println("Wrong pattern");
				
				return false;
			} 
			else if (chTop == '(' && ch == ')') {
				stack.pop();
				return true;
			} 
			else if (chTop == '{' && ch != '}') {
				System.out.println("Wrong pattern");
				return false;
			}
			else if (chTop == '{' && ch == '}') {
				stack.pop();
				return true;
			}
			else if (chTop == '[' && ch != ']') {
				System.out.println("Wrong pattern");
				return false;
			} 
			else if (chTop == '[' && ch == ']') {
				stack.pop();
				return true;
			}
		//}
		 if (stack.isEmpty())
		{
			char ch1 = (char) vidx;
			if (ch1 == ']' || ch1 == '}' || ch1 == ')')
			{
				System.out.println("Wrong pattern");
				return false;
			}
		}
		
		return true;

	}
}
