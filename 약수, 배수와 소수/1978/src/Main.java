import java.util.Scanner;

// https://www.acmicpc.net/problem/1978

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		int primeNum = 0;
		
		for(int i=0; i<count; i++) {
			
			int primeCount = 0;
			
			int prime = sc.nextInt();
			
			for(int j =1; j<=prime; j++) {
				if(prime%j == 0) {
					primeCount++;
				}
			}
			
			if(primeCount == 2) {
				primeNum++;
			}
			
		}
		
		System.out.println(primeNum);
	}
	
}
