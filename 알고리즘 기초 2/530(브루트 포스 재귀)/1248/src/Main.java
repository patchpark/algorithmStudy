import java.util.Scanner;

// https://www.acmicpc.net/problem/1248

public class Main {

	static int n;
	static char[][] signCheck;
	static int[] answer;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		signCheck = new char[n][n];
		
		String signString = sc.next();
		
		int signChar = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				signCheck[i][j] = signString.charAt(signChar);
				signChar++;
			} // signCheck¿¡ -, +, 0 ´ãÀ½
		}
		
		answer = new int[n];
		function(0);
	}
	
	public static void function(int depth) {
		if(depth == n) {
			for(int i : answer) {
				System.out.print(i + " ");
			}
			System.exit(0);
		}else {
			for(int i= -10; i<=10; i++) {
				answer[depth] = i;
				if(check(depth)) function(depth+1);
			}
		}
	}
	
	public static boolean check(int depth) {
		for(int i=0; i<=depth; i++) {
			int sum = 0;
			for(int j=i; j<=depth; j++) {
				sum += answer[j];
				if(signCheck[i][j] !=(sum==0? '0' : (sum>0 ? '+' : '-')))
					return false;
			}
		}
		return true;
		
	}
		
	
	
	
	
	
}















