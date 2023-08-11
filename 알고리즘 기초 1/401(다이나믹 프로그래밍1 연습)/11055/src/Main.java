import java.util.Scanner;

// https://www.acmicpc.net/problem/11055


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int dp[] = new int[num];
		
		dp[0] = arr[0];
		
		int result = dp[0];
		
		for(int i=1; i<num; i++) {
			dp[i] = arr[i];
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j]) { // 현재 숫자가 j번째 보다 크면
					dp[i] = Math.max(dp[i], dp[j] + arr[i]);
				}
			}
			result = Math.max(result, dp[i]);
		}
		System.out.println(result);
	}
	
}
