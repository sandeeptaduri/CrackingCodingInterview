import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReturnKthtoLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null;
		int k, tempValue;
		boolean first = true;
		
		k = scan.nextInt();

		while (scan.hasNextInt()) {
			tempValue = scan.nextInt();
			if (first) {
				inode = new LinkedListNode(tempValue);
				first = false;
			} else {
				inode.append(tempValue);
			}
		}
		scan.close();
		
		//Print Kth Element
		System.out.println(kthElement(inode, k));

	}
	
	public static int kthElement(LinkedListNode inode, int k) {
		int temp = inode.length-k+1;
		
		for(int i=1; i<temp; i++) {
			inode= inode.next;
		}
		
		return inode.data;
	}

}
