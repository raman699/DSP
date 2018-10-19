package stacks;

import java.util.Scanner;
import java.util.Stack;

public class ValidString2 {

	static Stack<Integer> stack = new Stack();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();

		boolean valid = false;
		for (int i = 0; i < s.length(); i++) {
			valid = isValid(s.charAt(i));
			if (!valid) {
				break;
			}
		}
		if (!valid) {
			System.out.println("false");
		} else if (stack.isEmpty() && valid) {
			System.out.println("true");
		} else if (!stack.isEmpty()) {
			System.out.println("false");

		}

	}

	public static boolean isValid(int i) {
		// if (!stack.isFull()) {
		char ch = (char) i;

		if (ch != '(' && ch != '{' && ch != '[' && ch != ')' && ch != '}' && ch != ']') {
			return true;
		}
		if (ch == '[' || ch == '{' || ch == '(') {
			stack.push(i);
			return true;
		}
		if (!stack.isEmpty()) {
			int ich=stack.peek();
			char chTop = (char) ich;
			if (chTop == '(' && ch != ')') {
				//System.out.println("Wrong pattern");

				return false;
			} else if (chTop == '(' && ch == ')') {
				stack.pop();
				return true;
			} else if (chTop == '{' && ch != '}') {
				//System.out.println("Wrong pattern");
				return false;
			} else if (chTop == '{' && ch == '}') {
				stack.pop();
				return true;
			} else if (chTop == '[' && ch != ']') {
				//System.out.println("Wrong pattern");
				return false;
			} else if (chTop == '[' && ch == ']') {
				stack.pop();
				return true;
			}
		}

		
		// }
		if (stack.isEmpty()) {
			char ch1 = (char) i;
			if (ch1 == ']' || ch1 == '}' || ch1 == ')') {
				//System.out.println("Wrong pattern");
				return false;
			}
		}

		return true;

	}
}
