/*
--We will use the below two facts for solving our problem
----1-The First element in the Pre-Order array will always be the root of the tree.
----2-The left part in In-Order always consist of the elements in the left sub tree of the root element and similarly for right sub tree.

Basic Algo:
--Store the root of the tree/sub-tree from the first element of the pre-order array.
--Find that root in the in-order array to segregate the left sub tree and the right tree.
--Now have a faith that if you call your method again i.e recursively for left sub tree and right sub tree
  then you will get your result for left sub tree and right sub tree.
--After getting the answer Print the root element.

NOTE:For calculating the post order of left sub tree and right sub tree,
     Be careful that you would need to pass correct array indexes for both sub trees.

CALCULATION of Array Indexes for Sub trees
-- For Calculation, first of all find the position of the root element in In-Order array (as per the above algo) 
---LEFT SUB TREE INDEX CALCULATION
-- Starting Index of Left Sub Tree in original In-Order Array: It is same as In-Order starting index (and for the full-tree/first-call it is 0).
-- Ending Index of Left Sub Tree in original In-Order Array: Position of root in In-Order minus 1 (pos-1)

-- Starting Index of Left Sub Tree in original Pre-Order Array:It is one more than Pre-Order starting index.
-- Ending Index of Left Sub Tree in original Pre-Order Array:It is the additon of starting index of Pre-Order Array and the size of the left sub tree.

 --For calculating the size of the Left subtree you know that it should be the number of elements from the starting index of In-Order array and
   the position of the root.

---RIGHT SUB TREE INDEX CALCULATION
-- Starting Index of RIGHT Sub Tree in original In-Order Array:Position of root in In-Order add 1 (pos+1) 
-- Ending Index of RIGHT Sub Tree in original In-Order Array: End index of the In_Order Array.

-- Starting Index of RIGHT Sub Tree in original Pre-Order Array:It is one more than sum of starting index of Pre-Order array, size of left sb tree
-- Ending Index of RIGHT Tree in original Pre-Order Array:It is the end index of the Pre-Order Array 

SPECIAL CONDITION:

--If the root does not have a left/right sub tree then don't call the method again
--When you get the position of the root element at the starting index of In-Order Array, it means that it does not have left subtree.
--When you get the position of the root element at the ending index of In-Order Array, it means that it does not have right subtree.
*/

package binarytree;

public class PrintPostWithPreAndIn
{

	public static void main(String[] args)
	{
		int in[] = { 4, 2, 5, 1, 3, 6 };
		int pre[] = { 1, 2, 4, 5, 3, 6 };
		printPostOrder(in, pre, 0, 5, 0, 5);

	}

	public static void printPostOrder(int in[], int pre[], int isi, int iei, int psi, int pei)
	{
		if (isi >= iei || psi >= pei)
		{
			System.out.println(in[isi]);
			return;
		}
		int root = pre[psi];// root is always the first element in preorder
		int pos = search(in, isi, iei, root);
		int startIndexOfLSTIO = isi;
		int endIndexOfLSTIO = pos - 1;
		int startIndexofLSTPRO = psi + 1;
		int lsize = pos - isi;
		int endIndexofLSTPRO = psi + lsize;
		
		// printPostOrderFromLeftSubTree
		if(pos!=isi)
		{
			printPostOrder(in, pre, startIndexOfLSTIO, endIndexOfLSTIO, startIndexofLSTPRO, endIndexofLSTPRO);
		}
		
		// printPostOrderFromRightSubTree

		int startIndexOfRSTIO = pos + 1;
		int endIndexOfRSTIO = iei;
		int startIndexOfRSTPRO = psi + lsize+1;
		int endIndexOfRSTPRO = pei;
		
		if(pos!=iei)
		{
			printPostOrder(in, pre, startIndexOfRSTIO, endIndexOfRSTIO, startIndexOfRSTPRO, endIndexOfRSTPRO);	
		}
		System.out.println(root);
	}

	public static int search(int[] ar, int si, int ei, int val)
	{
		for (int i = si; i <= ei; i++)
		{
			if (ar[i] == val)
			{
				return i;
			}
		}
		return -1;
	}
}
