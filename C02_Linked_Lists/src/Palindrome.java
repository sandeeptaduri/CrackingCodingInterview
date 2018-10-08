import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LinkedListNode inode = null;
		int tempValue;
		boolean result, first = true;

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

		result = checkPalindrome(inode);
		
		if(result) {
			System.out.println("Yes, given LinkedList is a Palindrome!");
		}
		else {
			System.out.println("No, given LinkedList is NOT a Palindrome!");
		}

	}
	
	public static boolean checkPalindrome(LinkedListNode inode) {
		LinkedListNode inodeRev = inode.reverse();
		
		while(inode!=null) {
			if(inode.getData()!=inodeRev.getData()) {
				return false;
			}
			inode= inode.getNext();
			inodeRev= inodeRev.getNext();
		}
		
		return true;
	}

}
