package bst;

public class BST {

	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;
	int size;

	public BST(int sa[]) {
		root = construct(sa, 0, sa.length - 1);
	}

	public Node construct(int sa[], int lo, int hi) {

		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;

		Node node = new Node();
		node.data = sa[mid];
		size++;

		Node leftNode = construct(sa, lo, mid - 1);
		Node rightNode = construct(sa, mid + 1, hi);

		node.left = leftNode;
		node.right = rightNode;

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

	public int min() {
		return min(root);
	}

	private int min(Node node) {

		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int rv = node.data;

		int left = min(node.left);

		return Math.min(rv, left);
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int rv = node.data;

		int right = max(node.right);

		return Math.max(rv, right);
	}

	public boolean find(int val) {
		return find(root, val);
	}

	private boolean find(Node node, int val) {
		if (node == null) {
			return false;
		}
		if (node.data < val) {
			return find(node.right, val);
		} else if (node.data > val) {
			return find(node.left, val);
		} else {
			return true;
		}

	}

	public void addNode(int data) {

		root=addNode(root, data);
	}

	private Node addNode(Node node, int data) {
		if (node == null) {
			Node ch = new Node();
			ch.data = data;
			ch.left = null;
			ch.right = null;
			return ch;
		}
		if (node.data < data) {
			Node ch = addNode(node.right, data);
			node.right = ch;

		} else if (node.data > data) {
			Node ch = addNode(node.left, data);
			node.left = ch;

		}
		return node;
	}

	public void add(int data) {
		add(root, data);
	}

	private void add(Node node, int data) {

		if(data>node.data)
		{
			if(node.right!=null)
			{
				add(node.right,data);
			}
			else
			{
				Node n= new Node();
				n.data=data;
				node.right=n;
			}
		}
		else if(data<node.data)
		{
			if(node.left!=null)
			{
				add(node.left,data);
			}
			else
			{
				Node n= new Node();
				n.data=data;
				node.left=n;
			}
		}
	}
	
	public void  remove(int data)
	{
		root= remove(root,data);
	}
	private Node remove(Node node,int data)
	{
		if(node==null)
		{
			return null;
		}
		if(data>node.data)
		{
			node.right=remove(node.right,data);
		}
		else if(data<node.data)
		{
			node.left=remove(node.left,data);
		}
		else
		{
			if(node.left==null && node.right==null)
			{
				return null;
			}
			else if(node.left==null)
			{
				return node.right;
			}
			else if(node.right==null)
			{
				return node.left;
			}
			else
			{
				int lmax= max(node.left);
				node.left=remove(node.left,lmax);
				node.data=lmax;
				return node;
			}
		}
		 return node;
	}
	
	public void printInRange(int lo,int hi)
	{
		printInRange(root,lo,hi);
	}
	private void printInRange(Node node,int lo,int hi)
	{
		if(node==null)
		{
			return ;
		}
		if(node.data>lo && node.data<hi)
		{
			System.out.println(node.data);
		}
		if(node.data>lo || node.data >hi)
		{
			printInRange(node.left,lo,hi);
		}
		if(node.data <hi || node.data<lo)
		{
			printInRange(node.right,lo,hi);
		}
//		if(node.data>lo)
//		{
//			printInRange(node.left,lo,hi);
//		}
//		if(node.data <hi)
//		{
//			printInRange(node.right,lo,hi);
//		}
		 
	}
}
