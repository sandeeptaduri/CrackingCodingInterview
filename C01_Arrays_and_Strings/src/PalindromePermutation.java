import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		boolean result;
		scan.close();

		result = checkPP(input);

		System.out.println(result);
	}

	public static boolean checkPP(String in) {
		// case insensitive
		in = in.toUpperCase();

		Map<Character, Integer> shelf = new HashMap<Character, Integer>();
		int count = 0, temp, half;

		// update shelf
		for (int i = 0; i < in.length(); i++) {
			if (shelf.get(in.charAt(i)) == null) {
				shelf.put(in.charAt(i), 1);
			} else {
				shelf.put(in.charAt(i), shelf.get(in.charAt(i)) + 1);
			}
		}

		// check Shelf for values that satisfy palindrome.
		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			if (shelf.get((char) i) != null) {
				temp = shelf.get((char) i);

				half = temp / 2;
				if (temp != half * 2) { // check if the character has odd count
					count++;
				}
				if (count > 1) { // when there are more than two characters with odd count, it cannot be a
									// palindrome.
					return false;
				}
			}
		}

		return true;
	}

}
