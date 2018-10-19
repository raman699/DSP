package trees.generic;

import java.util.ArrayList;

public class GenricTreeClient {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };
     int arr2[] = { 1, 2, 5, -1, 6, -1, -1, 3, 7, -1, 8, 11, -1, 12, -1, -1, 9, -1, -1, 4, 10, -1, -1,
				-1 };
		Generictree tree = new Generictree(arr);
		//tree.display();
		System.out.println(tree.size);
		System.out.println(tree.size2());
		System.out.println("max=" + tree.max());
		System.out.println(tree.find(1200));
		System.out.println("height" + tree.height());
		tree.posto();
		// tree.preo();
		// tree.posto();
		// tree.levelo();
//		ArrayList<Integer> al=tree.rootToNodePath(110);
//		for(Integer i:al)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		ArrayList<Integer> al1=tree.rootToNodePath(70);
//		for(Integer i:al1)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		System.out.println(tree.lca(110,70));
//		
//		System.out.println(tree.dbn(110, 70));
//		tree.display();
//		tree.mirror();
//		tree.display();
//		tree.display();
//		tree.removeleaf();
//		tree.display();
		//tree.printAtKthLevel(2);
	//	tree.levelorderlinezz();
		//tree.linearize2();
		//tree.display();
//		Generictree tree2 = new Generictree(arr2);
//		tree.mirror();
		//System.out.println(tree.areIsomorphic(tree2));
//		System.out.println(tree.areMirrorImages(tree2));
//		tree.multiSolver(120);
	}

}
