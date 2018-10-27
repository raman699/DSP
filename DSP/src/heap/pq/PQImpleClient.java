package heap.pq;

public class PQImpleClient {

	public static void main(String[] args) {
		PQImpl pq = new PQImpl(true);

		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
	}
}
