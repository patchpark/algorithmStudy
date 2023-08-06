import java.util.Scanner;

// https://www.acmicpc.net/problem/1149

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] arr = new int[num][3];
		int[][] dp = new int[num][3];
		
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		
		for(int i=1; i<num; i++) {
			dp[i][0] = arr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = arr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		int min = dp[num-1][0];
		
		for(int i=1; i<3; i++) {
			if(dp[num-1][i] < min) {
				min = dp[num-1][i];
			}
		}
		
		System.out.println(min);
		
	}
	
}
