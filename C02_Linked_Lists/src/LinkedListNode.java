
public class LinkedListNode {
	private LinkedListNode next;
	private LinkedListNode head;
	private LinkedListNode tail;
	private int data;
	private int length;

	public LinkedListNode(int d) {
		data = d;
		head = this;
		tail = this;
		length = 1;
	}

	public void add(int d) {
		LinkedListNode temp = new LinkedListNode(d);
		LinkedListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = temp;
		tail = temp;
		length++;
	}
	
	public void add(LinkedListNode d) {
		LinkedListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = d;
		tail = d;
		length++;
	}

	public void print() {
		LinkedListNode n = head;
		System.out.print("[");

		if (n == null) {
			System.out.print("]");
		}

		while (n != null) {
			System.out.print("" + n.data);
			if (n.next == null) {
				System.out.print("]");
			} else {
				System.out.print(", ");
			}
			n = n.next;
		}
		System.out.println("");
	}

	public LinkedListNode get(int k) {
		LinkedListNode n = this;

		for (int i = 0; i < k; i++) {
			n = n.next;
		}

		return n;
	}

	public void remove(int k) {
		LinkedListNode n = this;

		// first node
		if (k == 0) {
			head = head.next;

		}

		else {
			for (int i = 0; i < k - 1; i++) {
				n = n.next;
			}

			if (n.next.next == null) {
				n.next = null;
				n.setTail(n);

			} else {
				n.next = n.next.next;
			}

		}

	}

	public LinkedListNode reverse() {
		LinkedListNode n = this;
		LinkedListNode rev = new LinkedListNode(this.getData());
		n = n.next;
		
		while (n != null) {
			LinkedListNode temp = new LinkedListNode(n.getData());
			temp.setNext(rev.getHead());
			rev.resetTo(temp.getHead());
			n=n.next;
		}
		rev=rev.getHead();
		
		return rev;
	}

	public void resetTo(LinkedListNode newHead) {
		this.setHead(newHead);
	}

	public LinkedListNode getNext() {
		return next;
	}

	public LinkedListNode getHead() {
		return head;
	}

	public LinkedListNode getTail() {
		return tail;
	}

	private void setHead(LinkedListNode head) {
		this.head = head;
	}

	private void setTail(LinkedListNode tail) {
		this.tail = tail;
	}

	public int getData() {
		return data;
	}

	public int getLength() {
		return length;
	}

	private void setNext(LinkedListNode next) {
		this.next = next;
	}

	private void setData(int data) {
		this.data = data;
	}

}
