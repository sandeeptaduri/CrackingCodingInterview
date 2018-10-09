import java.util.Scanner;

public class Three_in_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int stackSize = scan.nextInt();
		scan.close();

		try {
			MultiStack mstack = new MultiStack(stackSize);

			// isEmpty
			System.out.println("Stack0 empty: " + mstack.isEmpty(0) + " | stack1 empty: " + mstack.isEmpty(1)
					+ " | Stack2 empty: " + mstack.isEmpty(2));

			// push
			for (int i = 1; i <= 1; i++) {
				mstack.push(0, i);
			}

			for (int i = 11; i <= 15; i++) {
				mstack.push(1, i);
			}

			for (int i = 21; i <= 31; i++) {
				try {
					mstack.push(2, i);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println("Push complete");

			// isEmpty
			System.out.println("Stack0 empty: " + mstack.isEmpty(0) + " | stack1 empty: " + mstack.isEmpty(1)
					+ " | Stack2 empty: " + mstack.isEmpty(2));

			// peek
			System.out.println("Stack0 peek: " + mstack.peek(0) + " | stack1 peek: " + mstack.peek(1)
					+ " | Stack2 peek: " + mstack.peek(2));

			// pop
			for (int i = 0; i < 1 && i < stackSize; i++) {
				System.out.println("Stack0 pop: " + mstack.pop(0) + " | stack1 pop: " + mstack.pop(1)
						+ " | Stack2 pop: " + mstack.pop(2));
			}

			// isEmpty
			System.out.println("Stack0 empty: " + mstack.isEmpty(0) + " | stack1 empty: " + mstack.isEmpty(1)
					+ " | Stack2 empty: " + mstack.isEmpty(2));

			// peek
			try {
				System.out.println("Stack0 peek: " + mstack.peek(0));
			} catch (Exception e) {
				System.out.println("Stack Peek Exception" + e);
			}
			System.out.println("stack1 peek: " + mstack.peek(1) + " | Stack2 peek: " + mstack.peek(2));

			// pop
			for (int i = 0; i < 1 && i < stackSize; i++) {
				try {
					System.out.println("Stack0 pop: " + mstack.pop(0));
				} catch (Exception e) {
					System.out.println("stack Pop Exception: " + e);
				}
			}

		} catch (Exception e) {
			System.out.println("Caught Exception Outside :" + e);
		}

	}

}
