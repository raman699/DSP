package trees.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.xml.soap.Node;

public class Generictree {

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

	}

	int size;
	Node root;

	public Generictree(int arr[]) {
		Stack<Node> stack = new Stack();

		for (int i = 0; i < arr.length; i++)

		{
			if (arr[i] != -1) {
				Node node = new Node();
				node.data = arr[i];
				size++;

				if (stack.size() > 0) {
					stack.peek().children.add(node);

				} else {
					root = node;
				}
				stack.push(node);
			} else {
				stack.pop();
			}
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		String str = node.data + "->";
		for (Node node1 : node.children) {
			str = str + node1.data + "->";
		}
		System.out.println(str + ".");
		for (Node node1 : node.children) {
			display(node1);
		}

	}

	public int size2() {
		return size2(root);

	}

	private int size2(Node node) {
		int size2 = 0;

		for (Node child : node.children) {
			int csize = size2(child);

			size2 = size2 + csize;
		}
		size2 += 1;
		return size2;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int rv = node.data;

		for (Node cnode : node.children) {
			int cmax = max(cnode);
			rv = Math.max(cmax, rv);
		}
		return rv;
	}

	public boolean find(int val) {

		return find(root, val);
	}

	private boolean find(Node node, int val) {
		boolean res = false;
		if (val == node.data) {
			res = true;
			return true;
		}

		for (Node cnode : node.children) {
			res = find(cnode, val);
			if (res) {
				return true;
			}
		}
		return res;
	}

	public int height() {
		return height(root);
	}

	public int height(Node node) {
		int cmaxht = -1;

		for (Node cnode : node.children) {
			int ccmaxht = height(cnode);
			cmaxht = Math.max(ccmaxht, cmaxht);
		}

		return cmaxht + 1;
	}

	public void preo() {
		preo(root);
	}

	// rule : node-->child
	private void preo(Node node) {
		System.out.println(node.data);

		for (Node nodec : node.children) {
			preo(nodec);// faith that child and family get printed
		}
	}

	public void posto() {
		posto(root);
	}

	// rule : child->node
	private void posto(Node node) {
		for (Node nodec : node.children) {
			posto(nodec);// faith that child and family get printed
		}
		System.out.print(node.data + " ");
	}

	public void levelo() {
		LinkedList<Node> queue = new LinkedList<Node>();// addLast Removefirst

		queue.addLast(root);

		while (queue.isEmpty() == false) {
			Node node = queue.removeFirst();

			System.out.print(node.data + " ");

			for (Node n : node.children) {
				queue.addLast(n);
			}
		}
		System.out.println(".");

	}

	public ArrayList<Integer> rootToNodePath(int val) {
		return rootToNodePath(root, val);
	}

	private ArrayList<Integer> rootToNodePath(Node node, int val) {
		if (val == node.data) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(node.data);
			return al;
		}

		for (Node cnode : node.children) {
			ArrayList<Integer> al = rootToNodePath(cnode, val);
			if (al.size() > 0) {
				al.add(node.data);
				return al;
			}
		}
		return new ArrayList<Integer>();
	}

	public int lca(int val1, int val2) {
		ArrayList<Integer> al1 = rootToNodePath(val1);

		ArrayList<Integer> al2 = rootToNodePath(val2);
		int lca = -1;
		int i = 1, j = 1;
		while (true) {

			if (al1.get(al1.size() - i) != al2.get(al2.size() - j)) {
				// System.out.println(al1.get(al1.size() - i ));
				lca = al1.get(al1.size() - i + 1);
				return lca;
			}
			i++;
			j++;
		}

	}

	public int dbn(int val1, int val2) {
		ArrayList<Integer> al1 = rootToNodePath(val1);

		ArrayList<Integer> al2 = rootToNodePath(val2);
		int i = 1, j = 1;
		int count = 0;
		while (true) {

			if (al1.get(al1.size() - i) == al2.get(al2.size() - j)) {
				count++;
			}
			if (al1.get(al1.size() - i) != al2.get(al2.size() - j)) {
				break;
			}
			i++;
			j++;
		}
		int c1 = al1.size() - count;
		int c2 = al2.size() - count;
		return c1 + c2;
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node n) {
		for (Node child : n.children) {
			mirror(child);
		}
		int left = 0;
		int right = n.children.size() - 1;
		while (left < right) {
			Node lnode = n.children.get(left);
			Node rnode = n.children.get(right);
			n.children.set(left, rnode);
			n.children.set(right, lnode);
			left++;
			right--;
			// Collections.reverse(n.children);
		}
	}

	public void removeleaf() {
		removeleaf(root);
		// work from bottom to top
	}

	private void removeleaf(Node n) {
		for (int i = n.children.size() - 1; i >= 0; i--) {
			Node child = n.children.get(i);
			if (child.children.size() == 0) {
				n.children.remove(i);
			}
		}
		for (Node child : n.children) {
			removeleaf(child);
		}
	}

	public void printAtKthLevel(int k) {
		printAtKthLevel(root, k, 0);
	}

	private void printAtKthLevel(Node n, int k, int depth) {
		if (depth == k) {
			System.out.print(n.data + " ");
			return;
		}
		for (Node val : n.children) {
			printAtKthLevel(val, k, depth + 1);
		}

	}

	public void levelorderline2() {
		LinkedList<Node> cl = new LinkedList<>();
		LinkedList<Node> nl = new LinkedList<>();
		cl.addLast(root);
		while (cl.size() > 0) {
			Node temp = cl.removeFirst();
			System.out.print(temp.data + " ");
			for (Node val : temp.children) {
				nl.addLast(val);
			}
			if (cl.size() == 0) {
				System.out.println();
				cl = nl;
				nl = new LinkedList<>();
			}
		}
		System.out.println(".");
	}

	public void levelorderlinezz() {
		LinkedList<Node> clq = new LinkedList<>();
		LinkedList<Node> nls = new LinkedList<>();
		clq.addLast(root);
		boolean ltr = true;
		while (clq.size() > 0) {
			Node temp = clq.removeFirst();
			System.out.print(temp.data + " ");
			if (ltr) {
				for (int i = 0; i < temp.children.size(); i++) {
					nls.addFirst(temp.children.get(i));
				}
			} else {

				for (int i = temp.children.size() - 1; i >= 0; i--) {
					nls.addFirst(temp.children.get(i));
				}
			}

			if (clq.size() == 0) {
				System.out.println();
				clq = nls;
				nls = new LinkedList<>();
				ltr = !ltr;
			}
		}
		System.out.println(".");
	}

	private void addchild(Node node, Node add) {
		if (node.children.size() == 0) {
			node.children.add(add);
		} else {
			int size = node.children.size();

			node.children.set(size, add);
		}
	}

	private Node getTail(Node node) {
		if (node.children.size() == 0) {
			return node;
		} else {
			return getTail(node.children.get(0));
		}

	}

	public void linearize() {
		linearize(root);
	}

	private void linearize(Node node) {
		for (Node nodec : node.children) {
			linearize(nodec);// faith
		}

		while (node.children.size() > 1) {
			Node last = node.children.remove(node.children.size() - 1);
			Node skitail = getTail(node.children.get(node.children.size() - 1));
			skitail.children.add(last);
		}

	}

	public void linearize2() {
		linearize2(root);
	}

	private Node linearize2(Node node) {

		if (node.children.size() == 0) {

			return node;
		}
		Node otail = linearize2(node.children.get(node.children.size() - 1));
		for (int i = node.children.size() - 2; i >= 0; i--) {
			Node ctail = linearize2(node.children.get(i));

			Node head = node.children.remove(i + 1);

			ctail.children.add(head);
		}

		return otail;

	}

	public boolean areIsomorphic(Generictree other) {
		return areIsomorphic(this.root, other.root);
	}

	private boolean areIsomorphic(Node n1, Node n2) {
		boolean res = false;
		if (n1.children.size() == n2.children.size()) {
			res = true;
			for (int i = 0, j = 0; i < n1.children.size() && j < n2.children.size(); i++, j++) {

				res = res && areIsomorphic(n1.children.get(i), n2.children.get(j));
				if (res == false) {
					return false;
				}
			}
		}

		return res;
	}

	public boolean areMirrorImages(Generictree other) {
		return areMirrorImages(this.root, other.root);
	}

	private boolean areMirrorImages(Node n1, Node n2) {
		boolean res = false;
		if (n1.children.size() == n2.children.size()) {
			res = true;
			for (int i = 0, j = n2.children.size() - 1; i < n1.children.size() && j >= 0; i++, j--) {

				res = res && areMirrorImages(n1.children.get(i), n2.children.get(j));
				if (res == false) {
					return false;
				}
			}
		}

		return res;
	}
	

	private boolean sym() {
		return areMirrorImages(root,root);
	}
	int sizemn=0;
	int heightms=0;
	int minms=Integer.MAX_VALUE;
	int maxms= Integer.MIN_VALUE;
	boolean find= false;
	
	public void multiSolver(int data)
	{
		multiSolver(root,data,0);
		System.out.println(size+" ");
		System.out.println(heightms+" ");
		System.out.println(minms+" ");
		System.out.println(maxms+" ");
		System.out.println(find+" ");
	}
	private void multiSolver(Node n, int data,int depth)
	{
		sizemn++;
		minms=Math.min(minms, n.data);
		heightms=Math.max(heightms, depth);
		maxms=Math.max(maxms, n.data);
		find=find|| (data==n.data);
		
		for(Node n1:n.children)
		{
			multiSolver(n1,data,depth+1);	
		}
		
		
	}
}
