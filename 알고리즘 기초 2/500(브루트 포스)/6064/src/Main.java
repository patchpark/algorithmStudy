import java.util.Scanner;

// https://www.acmicpc.net/problem/6064

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			while(x != y) {
				
				if(x<y) {
					x = x + N;
				}else {
					y = y + M;
				}
				
				if(x >= N * M) {
					x = -1;
					break;
				}
				
			}
			
			System.out.println(x);
			
		}
		
	}
	
}
