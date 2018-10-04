
public class LinkedListNode {
	LinkedListNode next;
	LinkedListNode head;
	int data;
	int length;

	public LinkedListNode(int d) {
		data = d;
		head = this;
		length=1;
	}

	public void append(int d) {
		LinkedListNode temp = new LinkedListNode(d);
		LinkedListNode n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = temp;
		length++;
	}

	public void print() {
		LinkedListNode n = this;
		System.out.print("[");
		while (n != null) {
			System.out.print("" + n.data);
			if (n.next == null) {
				System.out.print("]");
			} else {
				System.out.print(", ");
			}
			n = n.next;
		}
	}
	
	

}
