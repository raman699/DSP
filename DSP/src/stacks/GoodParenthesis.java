package stacks;

public class GoodParenthesis {

	static Stack stack = new Stack(5);

	public static void main(String[] args) {
		String s = "(a+c+((((c+d))+e))+f)";
		stack = new Stack(s.length());
		boolean valid = false;
		for (int i = 0; i < s.length(); i++) {
			valid = isValid(s.charAt(i));
			if (!valid) {
				break;
			}
		}
		if (!valid) {
			System.out.println("Expression is InValid");
		} else
		{
			System.out.println("Expression is Valid");
		}

	}

	public static boolean isValid(int i) {

		char ch = (char) i;

		if ( ch != ')') {
			stack.push(ch);
			return true;
		} else  {
			int count = 0;
			while (true) {
				char chTop = (char) stack.pop();
				count++;
				if (chTop == '(') {
					break;
				}
			}
			if(count==1)
			{
				return false;
			}
			else
				return true;
		}

	}
}
