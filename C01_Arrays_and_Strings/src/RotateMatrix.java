import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] input = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				input[i][j] = scan.nextInt();
			}
		}

		scan.close();
		input = rotateMatrix(input);
		printMatrix(input);

	}

	public static int[][] rotateMatrix(int[][] input) {
		int[][] temp = new int[input.length][input.length];

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				temp[j][input.length - 1 - i] = input[i][j];			
			}
		}
		
		return temp;
	}

	public static void printMatrix(int[][] input) {
		System.out.println("");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
//4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//3 1 2 3 4 5 6 7 8 9
