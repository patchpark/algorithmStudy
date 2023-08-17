import java.util.Scanner;

// https://www.acmicpc.net/problem/17404

public class Main {

	static final int MAX = 1000 * 1000 + 1000;
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[][] = new int[n+1][3];
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int dp[][] = new int[n+1][3];
		
		int min = MAX;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i == j) {
					dp[1][j] = arr[1][j];
				}else {
					dp[1][j] = MAX;
				}
			}     // 시작점에 대해서만 값을 구함
			
			for(int j=2; j<=n; j++) {
				dp[j][0] = Math.min(dp[j-1][1], dp[j-1][2]) + arr[j][0];
				dp[j][1] = Math.min(dp[j-1][0], dp[j-1][2]) + arr[j][1];
				dp[j][2] = Math.min(dp[j-1][0], dp[j-1][1]) + arr[j][2];				
			}
			
			for(int j=0; j<3; j++) {
				if(i != j) {
					min = Math.min(min, dp[n][j]);
				}
			}
			
		}
		System.out.println(min);
		
		
	}
	
}
