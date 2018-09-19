import java.util.Scanner;

public class RotateString {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String s1 = scan.next();
	String s2 = scan.next();
	scan.close();
	
	if(s1.length()!=s2.length()) {
		System.out.println("false");
	}
	
	else {
		s2=s2+s2;
		boolean result = isSubstring(s1,s2);
		if (result) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	
}

public static boolean isSubstring(String s1, String s2) {
	for(int i=0; i<s1.length(); i++) {
		//System.out.println(s2.substring(i, i+s1.length()));
		if(s2.substring(i, i+s1.length()).equals(s1)) {
			return true;
		}
	}
	return false;
}
}
//waterbottle erbottlewat