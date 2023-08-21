import java.util.Scanner;

// https://www.acmicpc.net/problem/1476

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt(); // 1~15
		int S = sc.nextInt(); // 1~28
		int M = sc.nextInt(); // 1~19
		
		while(true) {
			
			if(E==S && E==M) {
				break;
			}
			
			
			int min = Math.min(E, Math.min(S, M));
			
			if(min == E) {
				E += 15;
			}else if(min == S) {
				S += 28;
			}else {
				M+= 19;
			}
			
		}
		
		System.out.println(E);
		
	}
	
}
