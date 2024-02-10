import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			
			boolean check = true;
			int count = 0;
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++) {
				
				if(str.charAt(j) == '(') {
					count++;
				}else{
					count--;
				}
				
				if(count < 0)
					check = false;
				
				
			}
			if(count != 0)
				check = false;
			
			if(check == false)
				System.out.println("NO");
			else
				System.out.println(("YES"));
		
		}
		
	}
	
}
