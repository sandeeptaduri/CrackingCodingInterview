import java.util.HashSet;
import java.util.Scanner;

public class LoopDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null, result = null;
		int tempValue;
		boolean first = true;

		LinkedListNode loop = new LinkedListNode(9); // New Node to create a loop.

		while (scan.hasNextInt()) {
			tempValue = scan.nextInt();
			if (first) {
				inode = new LinkedListNode(tempValue);
				first = false;
				inode.add(loop);
			} else {
				inode.add(tempValue);
			}

		}
		inode.add(loop); // create a loop

		scan.close();

		result = checkLoop(inode);
		System.out.println("");

		if (result != null) {
			System.out.println("Yes, Loop exists in the given LinkedList : " + result.getData());
		} else {
			System.out.println("No, Loop does not exists in the given LinkedList");
		}

	}

	private static LinkedListNode checkLoop(LinkedListNode inode) {
		// TODO Auto-generated method stub
		HashSet<LinkedListNode> llSet = new HashSet<LinkedListNode>();

		System.out.print("Given linkedList: ");
		while (inode != null) {
			System.out.print(inode.getData());
			if (llSet.contains(inode)) {
				return inode;
			}

			if (inode.getNext() != null) {
				System.out.print(",");
			}

			llSet.add(inode);
			inode = inode.getNext();

		}

		return null;
	}

}
