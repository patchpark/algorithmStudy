import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int answer = 0;
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			
			if(str.length() % 2 == 1)
				continue;
			else {
				Stack<Character> check = new Stack<Character>();
				check.push(str.charAt(0));
				
				for(int j=1; j<str.length(); j++) {
					if(check.size()>0 && check.peek() == str.charAt(j)) {
						check.pop();
					}else {
						check.push(str.charAt(j));
					}
				}
				if(check.isEmpty())
					answer++;
			}
			
		}
		System.out.println(answer);
	}
	
}
