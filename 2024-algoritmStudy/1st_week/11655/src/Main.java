import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 = "";
		
		for(int i=0; i<str.length(); i++) {
			
			if((str.charAt(i)>='A' && str.charAt(i) <= 'M')||(str.charAt(i)>='a' && str.charAt(i) <= 'm')) {
				str2 += (char)(str.charAt(i) + 13);
			}else if((str.charAt(i)>'M' && str.charAt(i) <= 'Z') || (str.charAt(i)>='m' && str.charAt(i) <= 'z')){
				str2 += (char)(str.charAt(i) - 13);
			}else {
				str2 += str.charAt(i);
			}
			
			
		}
		
		System.out.println(str2);
		
	}
	
	
	
	
}
