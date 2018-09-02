package recursions.quesans;

public class QueenCom {

	static int count;

	public static void main(String[] args) {
		// test(new boolean[4], 2, 0, -1, "");
		//com(new boolean[4], 2, 0, 0, "");
		//printBoxWise(new boolean[4], 2,0,0,"");

	}

	public static void com(boolean boxes[], int tnq, int tqp, int previousPos, String asf)

	{
		if (tnq == tqp) {
			count++;
			System.out.println(count + " " + asf);
			return;

		}
		for (int i = previousPos; i < boxes.length; i++) {
			if (!boxes[i]) {
				boxes[i] = true;
				com(boxes, tnq, tqp + 1, i, asf + "b" + i + "q" + (tqp + 1) + " ");
				boxes[i] = false;
			}
		}
	}

	public static void test(boolean boxes[], int tnq, int tqp, int previousPos, String asf) {

		if (tnq == tqp) {
			count++;
			System.out.println(count + " " + asf);
			return;
		}
		for (int b = previousPos + 1; b < boxes.length; b++) {
			if (!boxes[b]) {
				boxes[b] = true;
				test(boxes, tnq, tqp + 1, b, asf + "b" + b + "q" + (tqp + 1));
				boxes[b] = false;
			}
		}
	}

	public static void printBoxWise(boolean boxes[], int tnq, int qn, int bno,String asf) {

		if(tnq==qn)
		{
			count++;
			System.out.println(asf);
			return;
		}
		if(bno==boxes.length)
		{
			return;
		}
		//when box said no
		printBoxWise(boxes,tnq,qn,bno+1,asf);
		//when box said yes
		printBoxWise(boxes,tnq,qn+1,bno+1,asf+"b"+bno +"q"+(qn) +" ");
	}
}
