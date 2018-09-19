import java.util.Scanner;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		boolean result;
		
		scan.close();

		// error check
		if (input.equals(null)) {
			System.out.println("No Input!!");
			return;
		}

		// check unique
		result = checkUnique(input);
		
		// print result
		if (result)
			System.out.println("Is Unique!");
		else
			System.out.println("Is not Unique!");

	}

	public static boolean checkUnique(String S) {
		boolean result = true;
		S = S.toUpperCase();
		int count = 0;

		// logic
		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			count = 0;
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == (char) i) {
					count++;
				}
				if (count > 1) {
					result = false;
					return result;
				}
			}
		}

		return result;
	}
}
