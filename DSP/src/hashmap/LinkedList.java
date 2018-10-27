package hashmap;

public class LinkedList<T> {
	private class Node {
		T data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addlast(T val) {
		// 1 step create node
		Node node = new Node();
		// 2 assign values
		node.data = val;
		node.next = null;

		// 3 summary / update LinkedList
		if (size > 0) {
			tail.next = node;
			tail = node;
		} else {
			tail = node;
			head = node;
		}

		size++;
	}

	public void display() {

		Node temp = head;
		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public T getFirst() {

		if (size > 0) {
			return head.data;
		} else {
			System.out.println("No element");
			return null;
		}
	}

	public T getLast() {

		if (size > 0) {
			return tail.data;
		} else {
			System.out.println("No element");
			return null;
		}
	}

	public T getAt(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp.data;

	}

	public void addFirst(T val) {
		Node node = new Node();

		node.data = val;
		node.next = head;
		head = node;
		if (size == 0) {
			tail = node;
		}
		size++;

	}

	public T removeFirst() {

		if (size > 0) {
			T res = head.data;
			head = head.next;
			if (size == 1) {
				tail = null;
			}
			size--;
			return res;

		} else {
			System.out.println("List empty");
			return null;
		}
	}

	private Node getNodeAt(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node temp = head;
		int i = 0;
		while (i < index) {
			temp = temp.next;
			i++;
		}
		return temp;

	}

	public T removeLast() {

		if (size == 1) {
			T res = tail.data;
			head = null;
			tail = null;
			size--;
			return null;

		} else if (size == 0) {
			System.out.println("List is empty");
			return null;
		} else {
			Node sl = getNodeAt(size - 2);
			T rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;

		}
	}

	public void addAt(int index, T val) {

		if (index > size || index < 0) {
			System.out.println("Index out of Bound");
			return;
		} else if (index == 0) {
			addFirst(val);
			return;
		} else if (index == size) {
			addlast(val);
			return;
		} else {
			Node node = new Node();
			node.data = val;
			node.next = null;
			Node prev = getNodeAt(index - 1);
			node.next = prev.next;
			prev.next = node;
			size++;
			return;
		}

	}

	public T removeAt(int index) {

		if (index >= size || index < 0) {
			System.out.println("Index out of Bound");
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(index - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			size--;
			return n.data;
		}

	}

	

	

	

	
	

	

	

	

	
}