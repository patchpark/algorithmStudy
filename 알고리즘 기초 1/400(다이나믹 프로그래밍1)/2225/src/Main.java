import java.util.Scanner;

// https://www.acmicpc.net/problem/2225


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] arr = new int[201][201];
		
		for(int i=1; i<=k; i++) {
			arr[i][0] = 1;
		}
		
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=n; j++) {
				arr[i][j] = (arr[i][j-1] + arr[i-1][j]) % 1000000000;
			}
		}
		
		System.out.println(arr[k][n]);
	}
	
}
