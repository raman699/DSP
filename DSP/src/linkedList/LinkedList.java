package linkedList;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	Node head;
	Node tail;
	int size;

	public void addlast(int val) {
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

		Node itr = head;
		while (itr != null) {

			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println(".");
	}

	public int getFirst() {

		if (size > 0) {
			return head.data;
		} else {
			System.out.println("No element");
			return -1;
		}
	}

	public int getLast() {

		if (size > 0) {
			return tail.data;
		} else {
			System.out.println("No element");
			return -1;
		}
	}

	public int getAt(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index out of bound");
			return -1;
		}

		Node nodeItr = head;
		int itr = 0;
		while (itr < index) {
			nodeItr = nodeItr.next;
			itr++;
		}
		return nodeItr.data;

	}

	public void addFirst(int val) {
		Node node = new Node();

		node.data = val;
		node.next = head;
		head = node;
		if (size == 0) {
			tail = node;
		}
		size++;

	}

	public int removeFirst() {

		if (size > 0) {
			int res = head.data;
			head = head.next;
			if (size == 1) {
				tail = null;
			}
			size--;
			return res;

		} else {
			System.out.println("List empty");
			return -1;
		}
	}

	//is the complexity o(n)
	// i can improve by saying that if index==0 -- getFirst() and index==size-1
	private Node getNodeAt(int index) {
		if (index < 0 || index >= size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node nodeItr = head;
		int itr = 0;
		while (itr < index) {
			nodeItr = nodeItr.next;
			itr++;
		}
		return nodeItr;

	}

	public int removeLast() {

		if (size == 1) {
			int res = tail.data;
			head = null;
			tail = null;
			size--;
			return res;

		} else if (size == 0) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node sl = getNodeAt(size - 2);
			int rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;

		}
	}

	public void addAt(int index, int val) {

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

	public int removeAt(int index) {

		if (index >= size || index < 0) {
			System.out.println("Index out of Bound");
			return -1;
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

	public void reverseDataIteratively1() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i; j++) {

				Node n1 = getNodeAt(i);
				Node n2 = getNodeAt(i + 1);
				int temp = n1.data;
				n1.data = n2.data;
				n2.data = temp;
			}
		}
	}

	public void reverseDataIteratively() {

		int beg = 0;

		int last = size - 1;

		if (size == 0) {
			System.out.println("List is empty");
			return;
		}
		Node begn = getNodeAt(beg);
		Node lastn = getNodeAt(last);
		while (beg <= last) {
			begn = getNodeAt(beg);
			lastn = getNodeAt(last);

			int temp = begn.data;
			begn.data = lastn.data;
			lastn.data = temp;
			beg++;
			last--;

		}
	}

	public void reversePointerIteratively() {
		Node prev = null;
		Node curr = head;
		Node next = curr.next;

		while (curr != null) {
			curr.next = prev;
			prev = curr;
			curr = next;
			if (next != null) {
				next = next.next;
			}
		}
		Node temp = head;
		head = tail;
		tail = temp;
	}

	public void displayReverse() {
		displayReverseHelper(head);
		System.out.println();
	}

	private void displayReverseHelper(Node node) {

		if (node == null) {
			return;
		}
		displayReverseHelper(node.next);
		System.out.print(node.data + "->");

	}

	public void reversePointerRecursive() {
		reversePointerRecursiveHelper(head);
		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
		System.out.println();
	}

	private void reversePointerRecursiveHelper(Node node) {
		if (node == tail) {
			return;
		}
		reversePointerRecursiveHelper(node.next);
		node.next.next = node;

	}

	Node left;

	public void reverseDataRecursive() {
		left = head;
		reverseDataRecursiveHelper(head, 0);
		left = null;
		System.out.println();
	}

	private void reverseDataRecursiveHelper(Node right, int floor) {
		if (right == null) {
			return;
		}
		reverseDataRecursiveHelper(right.next, floor + 1);
		if (floor >= size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			left = left.next;
		}

	}

	public boolean checkPallindrome() {
		left = head;
		boolean res = isPallindrome(head, 0);
		left = null;
		System.out.println();
		return res;
	}

	private boolean isPallindrome(Node right, int floor) {
		if (right == null) {
			return true;
		}
		boolean b = isPallindrome(right.next, floor + 1);
		if (floor >= size / 2) {
			if (b) {
				if (left.data == right.data) {
					b = true;
				} else {
					b = false;
				}
			}
			left = left.next;
		}
		return b;
	}

	public void foldll() {
		left = head;
		fold(head, 0);
		left = null;

	}

	private void fold(Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(right.next, floor + 1);

		if (floor >= size / 2) {
			Node temp = left.next;
			left.next = right;
			right.next = temp;
			left = temp;
		}
		if (floor == size / 2) {
			tail = right;
			tail.next = null;
		}
	}

	Node right;

	public void unfold() {
		left = head;
		right = head.next;

		unfold(left, right);
		left = null;
		right = null;
		tail.next = null;
	}

//	Node curr,cNext;next
	private void unfold(Node curr, Node currNext) {
		if (curr == null || currNext == null) {
			head = curr;
			tail = curr;
			tail.next = null;

			return;
		} else if (currNext.next == null) {
			head = curr;
			tail = currNext;
			tail.next = null;

			return;
		}

		unfold(currNext.next, currNext.next.next);

		curr.next = head;
		head = curr;

		if (tail != null) {
			tail.next = currNext;
		}
		tail = currNext;

	}

	public void removeDuplicates() {
		Node cur = head;
		Node next = head.next;

		while (true) {
			if (next == null) {
				cur.next = null;
				tail = cur;
				break;
			}
			if (cur.data == next.data) {
				next = next.next;
				size--;//modified later should be correct
			} else {
				//size++;
				cur.next = next;// 21-APR-2019 verify is it valid ? This is necessary to remove the link between two consecutive same elements
				cur = next;
				next = next.next;

			}
		}

	}

	public int mid() {
		Node slowPtr = head;
		Node fastPtr = head;

		while (fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowPtr.data;

	}

	public Node midNode() {
		Node first = head;
		Node second = head;

		while (second.next != null && second.next.next != null) {
			first = first.next;
			second = second.next.next;
		}

		return first;

	}

	public int kthFromLast(int k) {
		Node slowPtr = head;
		Node fastPtr = head;

		for (int i = 0; i < k; i++) {
			fastPtr = fastPtr.next;
		}
		while (fastPtr != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}

		return slowPtr.data;
	}

	public static LinkedList mergrsortedLists(LinkedList one, LinkedList two) {
		LinkedList result = new LinkedList();
		Node onep = one.head;
		Node twop = two.head;
		while (onep != null && twop != null) {
			if (onep.data < twop.data) {
				result.addlast(onep.data);
				onep = onep.next;
			} else {
				result.addlast(twop.data);
				twop = twop.next;
			}
		}

		while (onep != null) {
			result.addlast(onep.data);
			onep = onep.next;
		}
		while (twop != null) {
			result.addlast(twop.data);
			twop = twop.next;
		}
		return result;
	}

	// TODO
	public static LinkedList mergesortedLists(LinkedList one, LinkedList two) {

		return two;

	}
//reverse in group of three
	public void kreverse(int k) {
		LinkedList prev = new LinkedList();
		LinkedList curr = new LinkedList();
		while (size != 0) {
			int k1 = 0;
			while (k1 < k) {
				int val = removeFirst();
				curr.addFirst(val);
				k1++;
			}
			if(prev.size==0)
			{
				prev=curr;
			}
			else
			{
				prev.tail.next=curr.head;
				prev.tail=curr.tail;
				prev.size+=k;
			}
			curr = new LinkedList();
		}
		
		head=prev.head;
		tail=prev.tail;
		size=prev.size;

	}

	public void oddEven()
	{
		LinkedList odd= new LinkedList();
		LinkedList even = new LinkedList();
		
		while(size!=0)
		{
			if(this.getFirst()%2==0)
			{
				odd.addlast(removeFirst());
			}
			else
			{
				even.addlast(removeFirst());
			}
		}
		
		if(odd.size>0)
		{
			odd.tail.next=even.head;
		}
		
		head = odd.size>0 ? odd.head : even.head;
		
		tail= even.size > 0 ? even.tail:odd.tail;
		size=even.size+odd.size;
		
		//don't knoe below logic wierd 
		head=odd.head;
		tail=odd.tail;
		size=odd.size;
		
	}
	
	public static LinkedList mergersort(LinkedList list) {
		if (list.size == 1) {
			return list;
		}
		Node mid = list.midNode();
		Node midn = list.midNode().next;

		LinkedList ll1 = new LinkedList();

		ll1.head = list.head;

		ll1.tail = mid;

		ll1.tail.next = null;

		ll1.size = (list.size + 1) / 2;

		LinkedList ll2 = new LinkedList();

		ll2.head = midn;

		ll2.tail = list.tail;
		ll2.size = list.size - ll1.size;

		LinkedList ll3 = mergersort(ll1);
		LinkedList ll4 = mergersort(ll2);

		LinkedList ll5 = mergrsortedLists(ll3, ll4);

		// to preserve the org list
		mid.next = midn;

		return ll5;

	}
}