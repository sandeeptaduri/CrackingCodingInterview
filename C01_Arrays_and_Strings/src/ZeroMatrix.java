import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] input = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				input[i][j] = scan.nextInt();
			}
		}

		scan.close();

		input = zeroMatrix(input);
		printMatrix(input);

	}

	/**
	 * @param input
	 * @return
	 */
	public static int[][] zeroMatrix(int[][] input) {
		int r = -1, c = -1, temp = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (input[i][j] == 0) {
					r = i;
					c = j;
					temp = 1;
					break;
				}
			}
			if (temp == 1) {
				break;
			}
		}

		if (temp == 0) {
			System.out.println("Zero not found!");
		} else {
			for (int i = 0; i < input.length; i++) {
				input[i][c] = 0;
			}
			for (int i = 0; i < input[0].length; i++) {
				input[r][i] = 0;
			}
		}

		return input;
	}

	public static void printMatrix(int[][] input) {
		System.out.println("");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
//4 3 1 2 3 4 5 6 7 8 9 10 11 12
//3 1 2 3 4 5 6 7 8 9
