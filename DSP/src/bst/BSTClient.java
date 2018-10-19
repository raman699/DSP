package bst;

public class BSTClient {

	public static void main(String[] args) {
		int sa[]= {12,25,30,40,37,50,62,75,87};
		BST bst= new BST(sa);
		//bst.display();
//		System.out.println(bst.min());
//		System.out.println(bst.max());
//		System.out.println(bst.find(120));
//		bst.add(30);
//		bst.add(40);
	//	bst.display();
		//bst.remove(50);
		bst.display();
		bst.printInRange(35, 65);

	}

}
