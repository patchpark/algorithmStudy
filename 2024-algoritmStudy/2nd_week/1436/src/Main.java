import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int num = 1;
		
		while(true) {
			if(String.valueOf(num).contains("666")) {
				count++;
			}
			if(count == n) {
				break;
			}
		 	num++;
			
		}
		System.out.println(num);
		
		
	}
	
}
