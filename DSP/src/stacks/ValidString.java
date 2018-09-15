package stacks;

public class ValidString {

	static Stack stack = new Stack(5);

	public static void main(String[] args) {
		String s = "[a+{h+(c+d)+e}+f]";

		boolean valid = false;
		for (int i = 0; i < s.length(); i++) {
			valid = isValid(s.charAt(i));
			if (!valid) {
				break;
			}
		}
		if(!valid)
		{
			System.out.println("Expression is InValid");
		}
		else if (stack.isEmpty() && valid) {
			System.out.println("Expression is Valid");
		} else if (!stack.isEmpty()) {
			System.out.println("Expression is InValid");

		}

	}

	public static boolean isValid(int i) {
		//if (!stack.isFull()) {
			char ch = (char) i;
			char chTop = (char) stack.top();
			if(ch != '('&& ch!= '{' && ch!='[' &&
	      		ch != ')'&& ch!= '}' && ch!=']')
			{
				return true;
			}
			 if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(i);
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
			char ch1 = (char) i;
			if (ch1 == ']' || ch1 == '}' || ch1 == ')')
			{
				System.out.println("Wrong pattern");
				return false;
			}
		}
		
		return true;

	}
}
