import java.util.Scanner;

public class DeleteMiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null;
		int middle, tempValue;
		boolean first = true;

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

		middle = inode.getLength() / 2;

		inode.remove(middle);

		// Print Linkedlist
		inode.print();

	}
}
