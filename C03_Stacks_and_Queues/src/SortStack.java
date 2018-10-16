import java.util.Scanner;

public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MyStack<Integer> istack = new MyStack<Integer>();

		// push
		while (scan.hasNextInt()) {
			istack.push(scan.nextInt());
		}

		scan.close();
		System.out.println("push completed!");
		
		sortStack(istack);
	
		// peek, pop
		try {
			while (!istack.empty()) {
				System.out.println(
						"peek: " + istack.peek() + " |  pop: " + istack.pop());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void sortStack(MyStack<Integer> istack) {
		MyStack<Integer> temp = new MyStack<Integer>();
		int c;
		boolean sorted=false; 
		
		while(!sorted) {
		c = istack.pop();
		if(temp.empty()) {
			temp.push(c);
		}
		else {
			while(true) {
			if(temp.empty() || c>=temp.peek()) {
				temp.push(c);
				break;
			}
			else {
				istack.push(temp.pop());
			}
		}
			
		}
		
		if(istack.empty()) {
			sorted=true;
			while(!temp.empty()) {
				istack.push(temp.pop());
			}
		}
			
		}	
	}
}

// 9 5 8 7 2 6 3 1 4 Ω
// 523198764 46789 
// 523987614 41
//