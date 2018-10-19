package stacks;

import java.util.Scanner;

import queue.Queue;

//pop efficient
public class StackUsingQueue {

	Queue dq;
	Queue hq;
	public StackUsingQueue(int cap)
	{
		dq= new Queue(cap);
		hq= new Queue(cap);
	}
	
	public int size()
	{
		return dq.size();
	}
	
	public boolean isEmpty()
	{
		return dq.isEmpty();
	}
	public boolean isFull()
	{
		return dq.isFull();
	}
	public void display()
	{
		dq.display();
	}
	
	public int pop()
	{
		if(dq.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			return (dq.dequeue());
		}
	}
	public void push(int val)
	{
		if(!isFull())
		{
			while(dq.size()>0)
			{
				hq.enqueue(dq.dequeue());
			}
			
			dq.enqueue(val);
			while(hq.size()>0)
			{
				dq.enqueue(hq.dequeue());
			}
		}
	}
	
	
}
