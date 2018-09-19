public class URLify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sample input
		char[] input = { 'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ' };
		int truelength = 13;

		input = urlify(input, truelength);

		// output print result
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]);
		}

	}

	public static char[] urlify(char[] str, int len) {
		int i = len - 1, j = str.length - 1;

		while (i >= 0) {

			if (str[i] != ' ') {
				str[j] = str[i];
				j--;
				i--;
			} else {
				str[j] = '0';
				str[j - 1] = '2';
				str[j - 2] = '%';
				j = j - 3;
				i--;
			}

		}

		return str;
	}

}
