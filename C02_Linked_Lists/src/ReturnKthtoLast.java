import java.util.Scanner;

public class ReturnKthtoLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null;
		int k, index, tempValue;
		boolean first = true;

		k = scan.nextInt();

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

		// calculate index of Kth Element from last
		index = inode.getLength() - k;

		// print data at index
		System.out.println(inode.get(index).getData());

	}

}
