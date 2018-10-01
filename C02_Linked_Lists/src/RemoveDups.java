import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> input = new LinkedList<Integer>();
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
		Map<Integer, Boolean> temp = new HashMap<Integer, Boolean>();
		
		ListIterator<Integer> listIter = input.listIterator();
		int tempValue;
		
		while(listIter.hasNext()) {
			tempValue=listIter.next();
			
			if(temp.containsKey(tempValue)) {
				listIter.remove();
				System.out.println(""+input);
			}
			else {
				temp.put(tempValue, true);
			}
			
			
		}
		
		
		return input;
		
		
	}
	
	

}
