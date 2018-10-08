import java.util.HashSet;
import java.util.Scanner;

public class Intersection {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LinkedListNode inode1 = null, inode2 = null, result = null;
		int l1, l2, tempValue;
		boolean first = true;

		// intersecting Node
		LinkedListNode intersect = new LinkedListNode(9);
		LinkedListNode intersectNext = new LinkedListNode(10);
		intersect.add(intersectNext);

		// input LLs
		l1 = scan.nextInt();
		l2 = scan.nextInt();

		while (scan.hasNextInt() && l1-- > 0) {
			tempValue = scan.nextInt();
			if (first) {
				inode1 = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode1.add(tempValue);
				if (l1 == 3) {
					inode1.add(intersect);
				}
			}
		}

		first = true;

		while (scan.hasNextInt() && l2-- > 0) {
			tempValue = scan.nextInt();
			if (first) {
				inode2 = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode2.add(tempValue);
				if (l2 == 4) {
					inode2.add(intersect);
				}
			}
		}
		scan.close();

		result = checkIntersection(inode1, inode2);

		System.out.println("Given LinkedLists:");
		inode1.print();
		inode2.print();

		if (result != null) {
			System.out.println("Yes, given LinkedLists intersect at " + result.getData());
		} else {
			System.out.println("No, given LinkedLists does not intersect.");
		}

	}

	private static LinkedListNode checkIntersection(LinkedListNode inode1, LinkedListNode inode2) {
		// TODO Auto-generated method stub
		HashSet<LinkedListNode> llSet = new HashSet<LinkedListNode>();

		while (inode1 != null) {

			llSet.add(inode1);
			inode1 = inode1.getNext();

		}

		while (inode2 != null) {

			if (llSet.contains(inode2)) {
				return inode2;
			}

			inode2 = inode2.getNext();
		}

		return null;
	}
}
