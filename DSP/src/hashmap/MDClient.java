package hashmap;

public class MDClient {

	public static void main(String[] args) {
		MedainQueue mq= new MedainQueue();
		
		mq.add(10);
		mq.add(50);
		mq.add(30);
		System.out.println(mq.peek());
		mq.add(40);
		mq.add(70);
		System.out.println(mq.peek());
		mq.add(90);
		mq.add(100);
		System.out.println(mq.remove());
		mq.add(45);
		System.out.println(mq.peek());
		System.out.println(mq.remove());
		mq.add(75);
		System.out.println(mq.remove());
		System.out.println(mq.remove());
	}

}
