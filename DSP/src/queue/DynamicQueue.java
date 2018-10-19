package queue;

public class DynamicQueue extends Queue {

	public DynamicQueue(int cap) {
		super(cap);
	}
	public void enqueue1(int val) {

		if (size == data.length ) {

			int[] na = new int[2 * data.length];
			for (int i = 0; i < size; i++) {
				int j = (front + i) % data.length;
				na[front + i] = data[j];
			}
			this.data = na;

		}

		super.enqueue(val);
	}
	///another way
	public void enqueue(int val) {

		if (size == data.length ) {

			int[] na = new int[2 * data.length];
			for (int i = 0; i < size; i++) {
				int j = (front + i) % data.length;
				na[i] = data[j];
			}
			this.data = na;
            front=0;
		}

		super.enqueue(val);
	}
}
