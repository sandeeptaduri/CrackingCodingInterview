import java.util.Scanner;

public class StackofPlates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		StackSet istack = new StackSet(3);

		// push
		while (scan.hasNextInt()) {
			istack.push(scan.nextInt());
		}

		scan.close();
		System.out.println("push completed!");

		// peek, pop and popAt
		try {
			System.out.println("popAt(1): "+ istack.popAt(1));
			System.out.println("popAt(1): "+ istack.popAt(1));
			
			while (!istack.isEmpty()) {
				System.out.println("peek: " + istack.peek() + " | index: " + istack.getIndex() + " | pop: " + istack.pop());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//1 2 3 4 5 6 7 8 9 10 11 Ω