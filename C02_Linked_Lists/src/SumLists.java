import java.util.Scanner;

public class SumLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode1 = null;
		LinkedListNode inode2 = null;
		int l1, l2, tempValue;
		boolean first = true;

		l1 = scan.nextInt();
		l2 = scan.nextInt();

		while (scan.hasNextInt() && l1-- > 0) {
			tempValue = scan.nextInt();
			if (first) {
				inode1 = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode1.add(tempValue);
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
			}
		}
		scan.close();

		System.out.println("Input:");
		inode1.print();
		inode2.print();
		System.out.println("Result:");
		// add linked lists and Print the value.
		addNodeValues(inode1, inode2).print();

	}

	public static LinkedListNode addNodeValues(LinkedListNode inode1, LinkedListNode inode2) {
		LinkedListNode result = null;
		boolean first = true;

		// reverse LinkedList for linear addition.
		inode1 = inode1.reverse();
		inode2 = inode2.reverse();

		int unit,temp, carry = 0;

		while (inode1 != null || inode2 != null) {

			// calculate unit value and carry value
			unit = ((inode1 == null) ? 0 : inode1.getData()) + ((inode2 == null) ? 0 : inode2.getData()) + carry;
			carry = unit / 10;
			temp = unit % 10;

			// add value as a node to result:
			if (first) {
				result = new LinkedListNode(temp);
				first = false;
			} else {
				result.add(temp);
			}

			// move to next nodes
			if (inode1 != null) {
				inode1 = inode1.getNext();
			}
			if (inode2 != null) {
				inode2 = inode2.getNext();
			}
		}
		
		//if a carry is left over. 
		if(carry!=0) {
			result.add(carry);
		}
			

		result = result.reverse();
		return result;
	}

}
