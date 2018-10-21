package avl;

public class AVL {

	private class Node {
		int data;
		Node left;
		Node right;
		int ht;
		int balance;
	}

	Node root;
	int size;

	public AVL(int sa[]) {
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
		node.ht = getHeight(node);
		node.balance = getBalance(node);

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
		str = str + "<-" + node.data + "[" + node.ht + "," + node.balance + "]" + "->";
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

		root = addNode(root, data);
	}

	private Node addNode(Node node, int data) {
		if (node == null) {
			Node ch = new Node();
			ch.data = data;
			ch.ht = 1;
			ch.balance = 0;
			return ch;
		}
		if (node.data < data) {
			node.right = addNode(node.right, data);

		} else if (node.data > data) {
			node.left = addNode(node.left, data);

		}
		node.ht = getHeight(node);
		node.balance = getBalance(node);

		// check cases for rotation
		if (node.balance > 1) {
			// left call
			if (getBalance(node.left) > 0) {
				// ll call
				node = rightRotate(node);
			} else {
				// lr
				node.left = leftRotate(node.left);
				node = rightRotate(node);
			}
		} else if (getBalance(node) < -1) {
			// right call
			if (node.right.balance < 0) {
				// rr call
				node = leftRotate(node);
			} else {
				// rl
				node.right = rightRotate(node.right);
				node = leftRotate(node);
			}

		}
		return node;
	}

	public void add(int data) {
		add(root, data);
	}

	private void add(Node node, int data) {

		if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				Node n = new Node();
				n.data = data;
				node.right = n;
			}
		} else if (data < node.data) {
			if (node.left != null) {
				add(node.left, data);
			} else {
				Node n = new Node();
				n.data = data;
				node.left = n;
			}
		}
	}

	public void remove(int data) {
		root = remove(root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data > node.data) {
			node.right = remove(node.right, data);

		} else if (data < node.data) {
			node.left = remove(node.left, data);

		} else {
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null) {
				node = node.right;
			} else if (node.right == null) {
				node = node.left;
			} else {
				int lmax = max(node.left);
				node.left = remove(node.left, lmax);
				node.data = lmax;

			}
		}
		node.ht = getHeight(node);
		node.balance = getBalance(node);

		// check cases for rotation
		if (node.balance > 1) {
			// left call
			if (getBalance(node.left) > 0) {
				// ll call
				node = rightRotate(node);
			} else {
				// lr
				node.left = leftRotate(node.left);
				node = rightRotate(node);
			}
		} else if (getBalance(node) < -1) {
			// right call
			if (node.right.balance < 0) {
				// rr call
				node = leftRotate(node);
			} else {
				// rl
				node.right = rightRotate(node.right);
				node = leftRotate(node);
			}

		}
		return node;
	}

	public void printInRange(int lo, int hi) {
		printInRange(root, lo, hi);
	}

	private void printInRange(Node node, int lo, int hi) {
		if (node == null) {
			return;
		}

		if (node.data > lo && node.data < hi) {

			printInRange(node.left, lo, hi);
			System.out.println(node.data);
			printInRange(node.right, lo, hi);
		} else if (node.data > lo) {
			printInRange(node.left, lo, hi);
		} else if (node.data < hi) {
			printInRange(node.right, lo, hi);
		}

	}

	public void printLargerWithValues() {
		printLargerWithValues(root);
	}

	int sum = 0;

	private void printLargerWithValues(Node node) {
		if (node == null) {
			return;
		}
		printLargerWithValues(node.right);
		int temp = node.data;
		node.data = sum;
		sum += temp;
		printLargerWithValues(node.left);
	}

	private int getHeight(Node node) {
		if (node == null) {
			return 0;
		}
		int lht = node.left != null ? node.left.ht : 0;
		int rht = node.right != null ? node.right.ht : 0;
		return Math.max(lht, rht) + 1;
	}

	private int getBalance(Node node) {
		if (node == null) {
			return 0;
		}
		int lht = node.left != null ? node.left.ht : 0;
		int rht = node.right != null ? node.right.ht : 0;
		return lht - rht;
	}

	private Node rightRotate(Node x) {

		Node y = x.left;
		Node t3 = y.right;
		x.left = t3;
		y.right = x;
		x.ht = getHeight(x);
		x.balance = getBalance(x);

		y.ht = getHeight(y);
		y.balance = getBalance(y);

		return y;
	}

	private Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		x.right = t2;
		y.left = x;
		x.ht = getHeight(x);
		x.balance = getBalance(x);

		y.ht = getHeight(y);
		y.balance = getBalance(y);

		return y;
	}

	public int lca(int lo, int hi) {
		return lca(root, lo, hi);
	}

	private int lca(Node node, int lo, int hi) {

		if (node.data < lo) {
			return lca(node.right, lo, hi);
		} else if (node.data > hi) {
			return lca(node.left, lo, hi);
		} else {
			return node.data;
		}
	}

	public void printTargetSum(int target) {
		printTargetSum(root, target);
	}

	private void printTargetSum(Node node, int target) {

		if (node == null) {
			return;
		}
		int restpart = target - node.data;
		if (restpart < target / 2) {
			boolean rest = find(restpart);
			if (rest) {
				System.out.println(node.data + "  " + restpart);
			}
		}
		printTargetSum(node.left, target);
		printTargetSum(node.right, target);

	}
}
