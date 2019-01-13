package binarytree;

public class PrintPostWithPreAndIn
{

	public static void main(String[] args)
	{
		int in[] = { 4, 2, 5, 1, 3, 6 };
		int pre[] = { 1, 2, 4, 5, 3, 6 };
		printPostOrder(in, pre, 0, 5,0,5);

	}

	public static void printPostOrder(int in[], int pre[], int isi, int iei, int psi, int pei)
	{
		if (isi >= iei || psi >= pei)
			return;
		int root = pre[psi];// root is always the first element in preorder
		int pos = search(in, isi, iei, root);

		int startIndexOfLSTIO = isi;
		int endIndexOfLSTIO = pos - 1;

		int startIndexofLSTPRO = psi + 1;
		int endIndexofLSTPRO = pos - psi;
		// printPostOrderFromLeftSubTree
		printPostOrder(in, pre, startIndexOfLSTIO, endIndexOfLSTIO, startIndexofLSTPRO, endIndexofLSTPRO);
		// printPostOrderFromRightSubTree

		int startIndexOfRSTIO = pos + 1;
		int endIndexOfRSTIO = iei;

		int startIndexOfRSTPRO = pos + 1;
		int endIndexOfRSTPRO = pei;
		printPostOrder(in, pre, startIndexOfRSTIO, endIndexOfRSTIO, startIndexOfRSTPRO, endIndexOfRSTPRO);

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
