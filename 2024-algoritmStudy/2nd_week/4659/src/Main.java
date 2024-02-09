import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			String str = sc.next();
			
			if(str.equals("end"))
				break;
			
			char[] ae = { 'a', 'e', 'o', 'i', 'u'};
			
			boolean check = true;
			
			if(!(str.contains("a") || str.contains("e") || str.contains("o") || str.contains("i") || str.contains("u"))){
				check = false;
			}
			
			
			
			for(int i=0; i<str.length()-2; i++) {
				int count = 0;
				for(int k=i; k<i+3; k++) {
					boolean countCheck = false;
					for(int j=0; j<5; j++) {
						if(str.charAt(k) == ae[j]) {
							countCheck = true;
						}
					}
					if(countCheck == true)
						count++;
				}
				
				if(count == 3 || count == 0) {
				
					check = false;
				}
					
			}
			
			for(int i=0; i<str.length()-1; i++) {
				if(!(str.charAt(i) == 'e' || str.charAt(i) == 'o')) {
					if(str.charAt(i) == str.charAt(i+1)) {
						check = false;
					}
				}
			}
			if(check == false) {
				System.out.println("<" + str + "> is not acceptable.");
				continue;
			}
			
			System.out.println("<" + str + "> is acceptable.");
			
		}
		
	}
	
}
