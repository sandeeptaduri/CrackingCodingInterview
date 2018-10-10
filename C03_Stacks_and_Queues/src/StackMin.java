import java.util.Scanner;

public class StackMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		StackWithMin istack = new StackWithMin();

		// push
		while (scan.hasNextInt()) {
			istack.push(scan.nextInt());
		}

		scan.close();
		System.out.println("push completed!");

		// peek, pop and min
		try {
			while (!istack.isEmpty()) {
				System.out.println("peek: " + istack.peek() + " | min: " + istack.min() + " | pop: " + istack.pop());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
