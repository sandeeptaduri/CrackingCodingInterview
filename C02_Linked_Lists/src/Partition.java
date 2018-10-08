import java.util.Scanner;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null;
		int p, tempValue;
		boolean first = true;

		p = scan.nextInt();

		while (scan.hasNextInt()) {
			tempValue = scan.nextInt();
			if (first) {
				inode = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode.add(tempValue);
			}
		}
		scan.close();

		inode.resetTo(llPartition(inode, p));

		// Print Linkedlist
		inode.print();

	}

	public static LinkedListNode llPartition(LinkedListNode inode, int p) {
		LinkedListNode lower = null;
		LinkedListNode higher = null;
		boolean lfirst = true, hfirst = true;

		while (inode != null) {
			if (inode.getData() < p) {
				if (lfirst) {
					lower = new LinkedListNode(inode.getData());
					lfirst = false;
				} else {
					lower.add(inode.getData());
				}
			} else {
				if (hfirst) {
					higher = new LinkedListNode(inode.getData());
					hfirst = false;
				} else {
					higher.add(inode.getData());
				}
			}
			inode = inode.getNext();
		}

		lower.getTail().add(higher.getHead());
		return lower;
	}

}
