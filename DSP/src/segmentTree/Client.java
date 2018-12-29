package segmentTree;

public class Client {

	public static void main(String[] args) {
		int ba[] = { 2, 5, -3, 0, 1, 2, 4 };
		LazySegmentTree st = new LazySegmentTree(ba);

//		for(int i:st.sa)
//			System.out.println(i);

//		System.out.println(st.query(2, 6));
//		System.out.println(st.query(3, 5));
//
//		st.update(4, 18);
//		System.out.println(st.query(2, 6));
//		System.out.println(st.query(3, 5));

//		for(int i:st.sa)
//			System.out.println(i);
		
		st.rupdate(0, 6, 2);
		st.rupdate(0, 3, 3);
		System.out.println(st.query(2, 5));
	}

}
