import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		boolean check = true;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				check = false;
		}
		
		if(check == true)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
}
