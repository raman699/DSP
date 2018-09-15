package stacks;

public class Stack {

	private int data[];
	private int tos = -1;

	public Stack(int cap) {

		this.data = new int[cap];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		if (tos == -1)
		{
			System.out.println("stack is empty");
			return true;
		}
		else
			return false;
	}

	public boolean isFull() {
		if (tos == data.length - 1) {
			System.out.println("stack is full");
			return true;
		} else
			return false;
	}

	public void push(int val) {

		if (!isFull()) {
			tos++;
			data[tos] = val;
		}
	}

	public int pop() {
		int x = -1;
		if (!isEmpty()) {
			x = data[tos];
			data[tos] = 0;
			tos--;
		}
		return x;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.print(data[i]);
		}
	}

	public int top() {
		
		if(!isEmpty())
		{
			return data[tos];
		}
		else
			System.out.println("stack is empty");
		
		return -1;
	}
}