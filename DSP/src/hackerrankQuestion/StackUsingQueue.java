package hackerrankQuestion;

import java.util.Scanner;



public class StackUsingQueue {

	private class Queue {

		protected int front = 0;
		protected int size = 0;
		protected int data[];

		public Queue(int cap) {
			data = new int[cap];
		}

		public int size() {
			return size;
		}

		public boolean isEmpty() {
			if (size == 0) {
				System.out.println("Queue is empty");
				return true;
			} else {
				return false;
			}
		}

		public boolean isFull() {
			if (size == data.length) {
				System.out.println("Queue is full");
				return true;
			} else {
				return false;
			}
		}

		public void enqueue(int val) {
			int rear = -1;
			if (!isFull()) {
				rear = (front + size) % data.length;
				data[rear] = val;
				size++;
			}
		}

		public int dequeue() {
			int x = -1;
			if (!isEmpty()) {
				x = data[front];
				data[front] = 0;
				front = (front + 1) % data.length;
				size--;
			}
			return x;
		}

		public int front() {
			return data[front];
		}

		public String toString() {
			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}
			return "";
		}

		public void display() {
			if(size>=1)
			{
				for (int i = 0; i < size; i++) {
					System.out.print(data[(i + front) % data.length]+" ");
				}
			}
			else if(size==0)
			{
			System.out.println(-1);	
			}
			
		}
	}

	Queue dq;
	Queue hq;

	public StackUsingQueue(int cap) {
		dq = new Queue(cap);
		hq = new Queue(cap);
	}

	public int size() {
		return dq.size();
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public boolean isFull() {
		return dq.isFull();
	}

	public void display() {
		dq.display();
	}

	public int pop() {
		if (dq.isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			return (dq.dequeue());
		}
	}

	public void push(int val) {
		if (!isFull()) {
			while (dq.size() > 0) {
				hq.enqueue(dq.dequeue());
			}

			dq.enqueue(val);
			while (hq.size() > 0) {
				dq.enqueue(hq.dequeue());
			}
		}
	}
	public static void main(String...s)
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		StackUsingQueue stack = new StackUsingQueue(n);
		for(int i=0;i<n;i++)
		{
			String op= sc.next();
			if(op.contains("push"))
			{
			    int val= sc.nextInt();
							
				stack.push(val);
			}
			if(op.contains("pop"))
			{
				System.out.print(stack.pop()+" ");
			}
		}
		stack.display();
	}
}
