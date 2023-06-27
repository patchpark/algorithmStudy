import java.util.Scanner;

// https://www.acmicpc.net/problem/1436

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int check = 0;
		int count = 0;
		
		while(true) {
			
			if(String.valueOf(check).contains("666")){
				count++;
			}
			
			
			if(count == num) {
				System.out.println(check);
				break;
			}
			check++;
		}
		
		
		
	}
	
}
