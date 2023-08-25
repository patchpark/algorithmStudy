import java.util.Scanner;

// https://www.acmicpc.net/problem/1748

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int add = 1;
		int ten = 10;
		
		for(int i=1; i<=n; i++) {
			
			if(i%ten == 0) {
				add++;
				ten *= 10;				
			}
			
			count += add;
			
			
		}
		
		System.out.println(count);
		
		
	}
		
	
}
