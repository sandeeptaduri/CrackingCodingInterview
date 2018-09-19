import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		String input2 = scan.next();
		boolean result;
		scan.close();

		// error check
		if (input1.equals(null) || input2.equals(null)) {
			System.out.print("Incorrect Input !!");
			return;
		}

		// check Permutation
		result = checkPermutation(input1, input2);

		// print result
		if (result) {
			System.out.println("YES, Permutation of other!");
		} else
			System.out.println("NO, Not permutation of other!");

	}

	public static boolean checkPermutation(String S1, String S2) {
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		// to check case insensitive
		S1=S1.toUpperCase();
		S2=S2.toUpperCase();

		// return if string length not equal
		if (S1.length() != S2.length())
			return false;

		// populate hashmap with S1
		for (int i = 0; i < S1.length(); i++) {
			if (hm.get(S1.charAt(i)) == null) {
				hm.put(S1.charAt(i), 1);
			} else {
				hm.put(S1.charAt(i), hm.get(S1.charAt(i)) + 1);
			}
		}

		// check S2 with hashmap
		for (int i = 0; i < S2.length(); i++) {
			if (hm.get(S2.charAt(i)) == null || hm.get(S2.charAt(i)) == 0) {
				return false;
			} else {
				hm.put(S2.charAt(i), hm.get(S2.charAt(i)) - 1);
			}

		}

		return true;
	}

}
