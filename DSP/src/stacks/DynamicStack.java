package stacks;

public class DynamicStack extends Stack {

	public DynamicStack(int cap) {
		super(cap);

	}

	public void push(int val) {
		if (tos == data.length - 1) {
			int[] na = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}
			this.data = na;
		}
		super.push(val);
	}

}
