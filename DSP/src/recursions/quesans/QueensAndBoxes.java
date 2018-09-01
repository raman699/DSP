package recursions.quesans;

public class QueensAndBoxes {

	static int count;

	public static void main(String[] args) {
		getWaysQnBCom(new boolean[4], 2, 0, "",-1);
		System.out.println(count);

	}

	public static void getWaysQnB(boolean boxes[], int tq, int tqp, String asf) {

		if (tq == tqp) {
			System.out.println(asf);
			count++;
			return;
		}
		for (int b = 0; b < boxes.length; b++) {
			if (!boxes[b]) {
				boxes[b] = true;
				getWaysQnB(boxes, tq, tqp + 1, asf + "q" + (tqp + 1) + "b" + b);
				boxes[b] = false;
			}
		}
	}
	public static void getWaysQnBCom(boolean boxes[], int tq, int tqp, String asf,int lqpb) {

		if (tq == tqp) {
			System.out.println(asf);
			count++;
			return;
		}
		for (int b = lqpb+1; b < boxes.length; b++) {
			if (!boxes[b]) {
				boxes[b] = true;
				getWaysQnBCom(boxes, tq, tqp + 1, asf + "q" + (tqp + 1) + "b" + b,lqpb+b);
				boxes[b] = false;
			}
		}
	}
}
