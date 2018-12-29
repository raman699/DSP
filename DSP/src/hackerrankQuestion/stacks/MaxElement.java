package hackerrankQuestion.stacks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MaxElement {

	static Stack<Integer> stack = new Stack();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int nq = sc.nextInt();
		while (nq >= 0) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				addElement();
				nq--;
				break;
			case 2:
				stack.pop();
				nq--;
				break;
			case 3:
				al.add(stack.peek());
				nq--;
				break;
			default:

			}
		}
		for(int i:al)
		{
			System.out.println(i);
		}
	}

	public static void addElement() {
		int e = sc.nextInt();
		stack.push(e);

	}
}
