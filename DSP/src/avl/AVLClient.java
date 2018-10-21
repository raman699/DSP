package avl;

public class AVLClient {

	public static void main(String[] args) {
		int sa[] = { 12, 25, 30, 40, 37, 50, 62, 75, 87 };
		int sa1[]={12,25,30,50,62,75,87};
		int sa2[]= {12,25,37,50,64,75,87};
		AVL avl = new AVL(sa2);
		//avl.display();
//		avl.addNode(10);
//		avl.addNode(5);
//		avl.addNode(7);
//		avl.addNode(6);
//		avl.display();
//		System.out.println("-------------");
//		avl.remove(5);
//		avl.remove(6);
//		avl.remove(7);
		
		avl.display();
//		System.out.println(avl.lca(12,87));
//		System.out.println(avl.lca(5,30));
		avl.printTargetSum(87);
//		

	}

}
