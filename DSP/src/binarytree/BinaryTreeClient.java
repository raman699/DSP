package binarytree;

public class BinaryTreeClient {

	public static void main(String[] args) {
		int arr[]= {50,25,12,-1,37,30,51,-1,-1,-1,-1,75,62,70,-1,-1,87,-1,-1,-1};
		int arr3[]={50,25,12,-1,37,30,51,-1,-1,-1,-1,75,62,70,-1,-1,87,-1,-1,-1};
		//int arr2[]= {150,25,12,-1,-1,75,-1,-1};
		
		int[] arr1 = {'a', 'b', 'd', 'f', 'h', -1, -1, 'g', 'i', 'm', 'o', 'v',
				-1, -1, 'p', 't', -1, -1, -1, 'n', 'q', 'u', -1, 'w', -1, -1, -1, -1,
				'j', 'k', 'r', 'x', -1, -1, -1, 'l', 's', 'y', 
				-1, -1, -1, -1, -1, -1, -1, 'c', 'e', 'z', -1, -1, -1, -1};
		
		int one[]= {50,25,12,37,30,24,33,40,75,62,87};
		
		int two[]= {12,25,24,30,33,37,40,50,62,75,87};
		
		BinaryTree tree= new BinaryTree(arr);
		BinaryTree treecheck= new BinaryTree(one,two);
		//tree.display();
		//tree.removeleaf();
		//tree.display();
		//tree.displaySingleChild();
		//tree.display();
//		System.out.println("size ="+tree.size());
//		System.out.println("max="+tree.max());
//		System.out.println("min="+tree.min());
//		System.out.println("height="+ tree.height());
//		System.out.println("find="+tree.find(arr[8]));
//		System.out.println(tree.rootToNodePath(arr[8]));
//		System.out.println("find="+tree.findNode(arr[0]) );
//		System.out.println("find="+tree.findNode(arr[0]) );
		
	//	tree.printAtKthLevel(150, 2);
		
		//tree.printKfar(arr[8], 1);
		//tree.printTargetSum(288);
		//tree.preo();
		//tree.posto();
	//	tree.levelo();
		//tree.preoIterative();
		 
//		int pre[]= {50,25,12,10,37,40,75,62,70,87};
//		int in[]= {10,12,25,37,40,50,62,70,75,87};
//		int post[]= {10,12,40,37,25,70,62,87,75,50};
//		BinaryTree tree1= new BinaryTree(post,in);
//		 tree1.display();
		// System.out.println(tree1.diameter2());
		// System.out.println(tree.isBST());
		//tree.isLargestBST();
		treecheck.display();
		//treecheck.isLargestBST();
 
	}

}
