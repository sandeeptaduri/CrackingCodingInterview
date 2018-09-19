import java.util.Scanner;

public class StringCompression {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();

		// error check
		if (input.length() < 1) {
			System.out.println("Invalid input");
			return;
		}

		String cmprs = stringCompress(input);

		if (input.length() < cmprs.length())
			System.out.println(input);
		else
			System.out.println(cmprs);
	}

	public static String stringCompress(String in) {
		String result = "";
		int count = 0;
		char temp = in.charAt(0);

		for (int i = 0; i < in.length(); i++) {

			if (in.charAt(i) == temp) {
				count++;
			} else {
				result = result + temp + count;
				temp = in.charAt(i);
				count = 1;
			}

		}
		

		return result + temp + count;

	}

}
