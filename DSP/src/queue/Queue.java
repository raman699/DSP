package queue;

public class Queue {

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

	public int front()
	{
		return data[front];
	}
	public String toString() {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		return "";
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(data[(i+front)%data.length]);
		}
	}
}
