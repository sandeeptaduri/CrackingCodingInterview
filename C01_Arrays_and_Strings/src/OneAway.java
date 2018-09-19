import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		boolean result = false;
		scan.close();
		
//impossible cases
		if (s2.length() < s1.length() - 1 || s2.length() > s1.length() + 1) {
			System.out.println(result);
			return;
		}

//s2<s1 check if there is a delete
		if (s2.length() == s1.length() - 1) {
			result = oneDelete(s1, s2);
		}

		if (!result && s2.length() == s1.length() + 1) {
			result = oneInsert(s1, s2);
		}

		if (!result && s2.length() == s1.length()) {
			result = oneReplace(s1, s2);
		}

		System.out.println(result);

	}

	public static boolean oneDelete(String s1, String s2) {
		int count = 0;
		for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
			if (s1.charAt(i) != s2.charAt(j)) {
				count++;
				j--;
			}
			if (count > 1)
				return false;
		}
		return true;
	}

	public static boolean oneInsert(String s1, String s2) {
		int count = 0;
		for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
			if (s1.charAt(i) != s2.charAt(j)) {
				count++;
				i--;
			}
			if (count > 1)
				return false;
		}
		return true;
	}

	public static boolean oneReplace(String s1, String s2) {
		int count = 0;
		for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
			if (s1.charAt(i) != s2.charAt(j)) {
				count++;
			}
			if (count > 1)
				return false;
		}
		return true;
	}

}
