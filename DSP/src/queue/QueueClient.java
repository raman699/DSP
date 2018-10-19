package queue;

public class QueueClient {

	public static void main(String[] args) {
		Queue q=new DynamicQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		//System.out.println(q);
		
//		int x=q.dequeue();
		//System.out.println(x);
//		x=q.dequeue();
		
		//System.out.println(x);
//		q.enqueue(60);
//		q.enqueue(70);
		q.display();
//		x=q.dequeue();
//		System.out.println(x);
//		x=q.dequeue();
//		System.out.println(x);
//		x=q.dequeue();
//		System.out.println(x);
//		x=q.dequeue();
		//System.out.println(q.data);
		System.out.println();
		for(int i:q.data)
			System.out.println(i);

	}

}
