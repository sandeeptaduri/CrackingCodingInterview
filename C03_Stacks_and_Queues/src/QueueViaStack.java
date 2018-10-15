import java.util.Scanner;

public class QueueViaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		QueueStacks istack = new QueueStacks();

		// push
		while (scan.hasNextInt()) {
			istack.add(scan.nextInt());
		}

		scan.close();
		System.out.println("push completed!");
		

		// peek, pop and
		try {
			while (!istack.isEmpty()) {
				System.out.println(
						"element: " + istack.element() + " |  remove: " + istack.remove());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
