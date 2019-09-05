package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private class Pair {

		Node node;
		boolean isSelf;
		boolean isLeft;
		boolean isRight;

		Pair(Node node, boolean isSelf, boolean isLeft, boolean isRight) {
			this.node = node;
			this.isLeft = isLeft;
			this.isRight = isRight;
			this.isSelf = isSelf;
		}
	}
	
	private class DiaPair{
		int dia;
		int height;
		DiaPair(int dia,int height)
		{
			this.dia=dia;
			this.height=height;
		}
	}

	private class BalPair
	{
		int height;
		boolean balance;
		BalPair(int height,boolean balance)
		{
			this.height=height;
			this.balance=balance;
		}
	}
	
	private class BSTPair
	{
		boolean isBST;
		int max,min;
		Node lbroot;
		int size;
		BSTPair(boolean isBST,int max,int min,Node lbroot,int size)
		{
			this.isBST=isBST;
			this.max=max;
			this.min=min;
			this.lbroot=lbroot;
			this.size=size;
			
		}
		BSTPair(boolean isBST,int max,int min)
		{
			this.isBST=isBST;
			this.max=max;
			this.min=min;
			
		}
	}
	private Node root;
	private int size;

	public BinaryTree(int arr[]) {
		Stack<Node> stack = new Stack();

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] != -1) {
				Node node = new Node();
				node.data = arr[i];
				size++;

				if (stack.size() > 0) {
					Node top = stack.peek();
					if (top.left == null) {
						top.left = node;
					} else {
						top.right = node;
					}

				} else {
					root = node;
				}
				stack.push(node);
			} else {
				stack.pop();
			}
		}
	}

	BinaryTree(int pre[],int in[])
	{
		root=construct(pre,in,0,pre.length-1,0,in.length-1);
	}

//	BinaryTree(int post[], int in[]) {
//		root = construct1(post, in, 0, post.length - 1, 0, in.length - 1);
//	}

	private Node construct(int[] pre, int in[], int psi, int pei, int isi, int iei) {
		// base case
		if (isi > iei || psi > pei) {
			return null;
		}
		Node node = new Node();

		node.data = pre[psi];
		size++;
		int indexNode = -1;
		for (int i = isi; i <= iei; i++) {
			if (in[i] == node.data) {
				indexNode = i;
				break;
			}
		}

		int lhs = indexNode - isi;
		node.left = construct(pre, in, psi + 1, psi + lhs, isi, indexNode - 1);
		node.right = construct(pre, in, psi + lhs + 1, pei, indexNode + 1, iei);
		return node;
	}

	private Node construct1(int[] post, int in[], int psi, int pei, int isi, int iei) {
		// base case

		if (isi > iei || psi > pei) {
			return null;
		}
		Node node = new Node();

		node.data = post[pei];
		size++;
		int indexNode = -1;
		for (int i = isi; i <= iei; i++) {
			if (in[i] == node.data) {
				indexNode = i;
				break;
			}
		}

		int lhs = indexNode - isi;
		node.left = construct1(post, in, psi, psi + lhs - 1, isi, indexNode - 1);
		node.right = construct1(post, in, psi + lhs, pei - 1, indexNode + 1, iei);
		return node;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";
		str += node.left != null ? node.left.data + " " : ".";
		str = str + "<-" + node.data + "->";
		// bad code in below code (we mistakenly check (str+node.right !=null)
		// str = str + node.right != null ? node.right.data + " " : ".";
		str += node.right != null ? node.right.data + " " : ".";

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = size(node.left);
		int rsize = size(node.right);

		return lsize + rsize + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int rv = node.data;
		int lmax = Math.max(max(node.left), rv);

		int rmax = Math.max(max(node.right), rv);

		rv = Math.max(lmax, rmax);

		return rv;
	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int rv = node.data;
		int lmin = Math.min(min(node.left), rv);

		int rmin = Math.min(min(node.right), rv);

		rv = Math.min(lmin, rmin);

		return rv;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		}

		int lheight = height(node.left);
		int rheight = height(node.right);

		int mheight = Math.max(lheight, rheight);

		int res = mheight + 1;

		return res;
	}

	public boolean find(int val) {
		return find(root, val);
	}

	private boolean find(Node node, int val) {

		if (node == null) {
			return false;
		}
		if (val == node.data) {

			return true;
		}

		boolean lres = find(node.left, val);
		if (lres) {
			return true;
		}

		boolean rres = find(node.right, val);
		if (rres) {
			return true;
		}

		return false;

	}

	public ArrayList<Integer> rootToNodePath(int data) {
		return rootToNodePath(root, data);
	}

	public ArrayList<Node> rootToNodePathNode(int data) {
		return rootToNodePathNode(root, data);
	}

	private ArrayList<Integer> rootToNodePath(Node node, int val) {
		if (node == null) {
			return new ArrayList<Integer>();
		}
		if (node.data == val) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(node.data);
			return al;
		}
		ArrayList<Integer> leftAl = rootToNodePath(node.left, val);

		if (leftAl.size() > 0) {
			leftAl.add(node.data);
			return leftAl;
		}

		ArrayList<Integer> rightAl = rootToNodePath(node.right, val);

		if (rightAl.size() > 0) {
			rightAl.add(node.data);
			return rightAl;
		}

		return new ArrayList<Integer>();
	}

	private ArrayList<Node> rootToNodePathNode(Node node, int val) {
		if (node == null) {
			return new ArrayList<Node>();
		}
		if (node.data == val) {
			ArrayList<Node> al = new ArrayList<Node>();
			al.add(node);
			return al;
		}
		ArrayList<Node> leftAl = rootToNodePathNode(node.left, val);

		if (leftAl.size() > 0) {
			leftAl.add(node);
			return leftAl;
		}

		ArrayList<Node> rightAl = rootToNodePathNode(node.right, val);

		if (rightAl.size() > 0) {
			rightAl.add(node);
			return rightAl;
		}

		return new ArrayList<Node>();
	}

	public Node findNode(int val) {
		return findNode(root, val);
	}

	private Node findNode(Node node, int val) {

		if (node == null) {
			return null;
		}
		if (val == node.data) {

			return node;
		}

		Node lres = findNode(node.left, val);
		if (lres != null) {
			return lres;
		}

		Node rres = findNode(node.right, val);
		if (rres != null) {
			return rres;
		}

		return null;

	}

	public void printAtKthLevel(int data, int k) {
		printAtKthLevel(findNode(data), k, 0);
	}

	private void printAtKthLevel(Node n, int k, int depth) {

		if (n == null) {
			return;
		}
		if (depth == k) {
			System.out.print(n.data + " ");
			return;
		}

		printAtKthLevel(n.left, k, depth + 1);
		printAtKthLevel(n.right, k, depth + 1);

	}

	public void printKfar(int data, int k) {
		ArrayList<Node> nodeList = rootToNodePathNode(data);

		if (nodeList != null && nodeList.size() > 0) {
			printAtKthLevel(nodeList.get(0), k, 0);

			for (int i = 1; i <= k - 1; i++) {
				if (nodeList.get(i - 1) == nodeList.get(i).left) {
					printAtKthLevel(nodeList.get(i).right, k - i - 1, 0);
				} else {
					printAtKthLevel(nodeList.get(i).left, k - i - 1, 0);
				}
			}
			printAtKthLevel(nodeList.get(k), 0, 0);
		}

	}
	// printKFar();

	// 13-Oct-2018
	public void removeleaf() {
		removeleaf(root);
		// work from bottom to top
	}

	private void removeleaf(Node n) {

		if (n != null) {
			Node leftChild = n.left;
			Node rightChild = n.right;
			if (leftChild != null) {
				Node grandLeftChild = leftChild.left;
				Node grandRightChild = leftChild.right;
				if (grandLeftChild == null && grandRightChild == null) {
					n.left = null;
				}

			}
			if (rightChild != null) {
				Node grandLeftChild = rightChild.left;
				Node grandRightChild = rightChild.right;
				if (grandLeftChild == null && grandRightChild == null) {
					n.right = null;
				}

			}

			removeleaf(leftChild);
			removeleaf(rightChild);

		}

	}

	public void displaySingleChild() {
		displaySingleChild(root);
	}

	private void displaySingleChild(Node node) {
		if (node != null) {
			Node leftChild = node.left;
			Node rightChild = node.right;
			if (leftChild != null && rightChild == null) {
				System.out.println(leftChild.data);

			}
			if (rightChild != null && leftChild == null) {
				System.out.println(rightChild.data);

			}
			displaySingleChild(leftChild);
			displaySingleChild(rightChild);
		}

	}

	public void printTargetSum(int tar) {
		printTargetSum(root, 0, "", tar);
	}

	private void printTargetSum(Node node, int ssf, String psf, int tar) {

		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (node.data + ssf < tar) {
				System.out.println(psf + " " + node.data);
			}
			return;
		}
		printTargetSum(node.left, ssf + node.data, psf + " " + node.data, tar);
		printTargetSum(node.right, ssf + node.data, psf + " " + node.data, tar);
	}

	public void preo() {
		preo(root);
	}

	// rule : node-->child
	private void preo(Node node) {
		if (node != null) {
			System.out.println(node.data);
			preo(node.left);
			preo(node.right);
		}
	}

	public void posto() {
		posto(root);
	}

	// rule : node-->child
	private void posto(Node node) {
		if (node != null) {
			posto(node.left);
			posto(node.right);
			System.out.println(node.data);
		}
	}

	public void levelo() {
		LinkedList<Node> queue = new LinkedList<Node>();// addLast Removefirst

		queue.addLast(root);

		while (queue.isEmpty() == false) {
			Node node = queue.removeFirst();

			System.out.print(node.data + " ");

			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}

		}
		System.out.println(".");

	}

	public void preoIterative() {
		Stack<Pair> stack = new Stack<Pair>();

		Pair p = new Pair(root, false, false, false);
		stack.push(p);
		while (stack.size() > 0) {
			Pair top = stack.peek();
			if (top.isSelf == false) {
				top.isSelf = true;
				System.out.println(top.node.data);
			} else if (top.isLeft == false) {
				top.isLeft = true;
				// System.out.println(top.node.data);
				if (top.node.left != null) {
					Pair pLeft = new Pair(top.node.left, false, false, false);
					stack.push(pLeft);
				}

			} else if (top.isRight == false) {
				top.isRight = true;
				if (top.node.right != null) {
					Pair pRight = new Pair(top.node.right, false, false, false);
					stack.push(pRight);
				}

			} else {
				stack.pop();
			}
		}
	}
	public int diameter()
	{
		return diameter(root);
	}
	private int diameter(Node node)
	{
		if (node == null) {
			return 0;
		}
		int lh=height(node.left);
		int rh=height(node.right);
		int d1= lh+rh+1; // if height is calculated on the basis of edges, then we would need to add +2 as their are two edges between two sub trees
		
		int ld=diameter(node.left);
		
		int rd=diameter(node.right);
		
		int max1=Math.max(ld, rd);
		
		int max2=Math.max(max1, d1);
		return max2;
		
	}

	public int diameter2()
	{
		return diameter2(root).dia;
	}
	private DiaPair diameter2(Node node)
	{
		if (node == null) {
			return new DiaPair(0,0);
		}
		DiaPair leftDia= diameter2(node.left);
		DiaPair rightDia=diameter2(node.right);
		int f1= leftDia.height+ rightDia.height +1;
		int myDia= Math.max(f1,Math.max(leftDia.dia, rightDia.dia));
		int myHeight=Math.max(leftDia.height, rightDia.height)+1;
		
		return new DiaPair(myDia,myHeight);
		
	}
	
	public boolean isBalanced()
	{
		BalPair balpair= isBalanced(root);
		return balpair.balance;
	}

	private BalPair isBalanced(Node node)
	{
		if(node==null)
		{
			return new BalPair(0,true);
		}
		
		BalPair left= isBalanced(node.left);
		BalPair right =isBalanced(node.right);
		int myHeight=Math.max(left.height, right.height)+1;
		if(!left.balance || !right.balance)
		{
			return new BalPair(myHeight,false);
		}
		int delta=Math.abs(left.height-right.height);
		if(delta<=1)
		{
			return new BalPair(myHeight,true);
		}
		else
		{
			return new BalPair(myHeight,false);
		}
	}
	public boolean isBST()
	{
		return isBST(root).isBST;
	}
	
	private BSTPair isBST(Node node)
	{
		if(node==null)
		{
			return new BSTPair(true,Integer.MIN_VALUE,Integer.MAX_VALUE);
		}
		BSTPair left= isBST(node.left);
		BSTPair right=isBST(node.right);
		
		int myMax=Math.max(node.data,Math.max(left.max, right.max));
		int myMin=Math.min(node.data,Math.min(left.min, right.min));
		boolean myBST= left.isBST && right.isBST;
		if(myBST && node.data>left.max&& node.data <right.min)
		{
			return new BSTPair(true,myMax,myMin);
			
		}
		
		return new BSTPair(false,myMax,myMin);
	}
	
	public void isLargestBST()
	{
		
		BSTPair bstPair= isLargestBST(root);
		System.out.println(bstPair.size);
		System.out.println(bstPair.lbroot.data);
		
	}
	
	private BSTPair isLargestBST(Node node)
	{
		if(node==null)
		{
			return new BSTPair(true,Integer.MIN_VALUE,Integer.MAX_VALUE,null,0);
		}
		BSTPair left= isLargestBST(node.left);
		BSTPair right=isLargestBST(node.right);
		
		int myMax=Math.max(node.data,Math.max(left.max, right.max));
		int myMin=Math.min(node.data,Math.min(left.min, right.min));
		boolean myBST= left.isBST && right.isBST;
		int mySize=left.size+ right.size;
		if(myBST && node.data>left.max&& node.data <right.min)
		{
		
			BSTPair bstPair= new BSTPair(true,myMax,myMin,node,mySize+1);
			return bstPair;
			
		}
		mySize= Math.max(left.size, right.size);
		if(left.size >right.size)
		{
			BSTPair bstPair= new BSTPair(myBST,myMax,myMin,left.lbroot,left.size);
			return bstPair;
		}
		else
		{
			BSTPair bstPair= new BSTPair(myBST,myMax,myMin,right.lbroot,right.size);
			return bstPair;
		}
		
	}
}
