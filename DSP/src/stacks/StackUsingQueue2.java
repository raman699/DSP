package stacks;

import queue.Queue;

//push efficient
public class StackUsingQueue2 {

	Queue dq;
	Queue hq;

	public StackUsingQueue2(int cap) {
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
		if(dq.size()==0)
		{
			return ;
		}
		int res=dq.dequeue();
		System.out.print(res);
		display();
		dq.enqueue(res);
	}

	
	public int pop() {
		int res;
		if (!isEmpty()) {
			while (dq.size() > 1) {
				hq.enqueue(dq.dequeue());
			}
			res = dq.dequeue();
			while (hq.size() >0) {
				dq.enqueue(hq.dequeue());
			}
			return res;
		} else
			return -1;
	}

	public void push(int val) {
		dq.enqueue(val);
	}

	public int top() {
		int res;
		if (!isEmpty()) {
			while (dq.size() > 1) {
				hq.enqueue(dq.dequeue());
			}
			res = dq.dequeue();
			while (hq.size() > 1) {
				dq.enqueue(hq.dequeue());
			}
			dq.enqueue(res);
			return res;
		} else
			return -1;
	}
}
