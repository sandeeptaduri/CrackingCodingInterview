import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> input = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			input.add(scan.nextInt());
			//System.out.println(input.size());
		}
		scan.close();
		
		input = cleanDups(input);
		
		System.out.println(""+input);

	}

	private static List<Integer> cleanDups(List<Integer> input) {
		// TODO Auto-generated method stub
		
		
		return input;
	}
	
	

}
