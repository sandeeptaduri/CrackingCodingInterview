import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> input = new LinkedList<Integer>();
		LinkedListNode inode = null;
		int tempValue;
		boolean first = true;

		while (scan.hasNextInt()) {
			tempValue = scan.nextInt();

			// Add to lInkedList
			input.add(tempValue);

			// Add to Node
			if (first) {
				inode = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode.add(tempValue);
			}
		}
		scan.close();

		// using ListIterator
		input = cleanDups(input);

		// print result
		System.out.println("" + input);

		// using Node
		clearDups(inode);

		// print result
		inode.print();

	}

	private static void clearDups(LinkedListNode n) {
		// TODO Auto-generated method stub
		LinkedListNode pointer = n;

		Set<Integer> temp = new HashSet<Integer>();

		while (n != null) {
			if (temp.contains(n.getData())) {
				pointer.setNext(n.getNext());
				n = n.getNext();

			} else {
				temp.add(n.getData());
				pointer = n;
				n = n.getNext();
			}
		}

		return;
	}

	private static List<Integer> cleanDups(List<Integer> input) {
		// TODO Auto-generated method stub
		Set<Integer> temp = new HashSet<Integer>();

		ListIterator<Integer> listIter = input.listIterator();
		int tempValue;

		while (listIter.hasNext()) {
			tempValue = listIter.next();

			if (temp.contains(tempValue)) {
				listIter.remove();
			} else {
				temp.add(tempValue);
			}

		}

		return input;

	}

}
