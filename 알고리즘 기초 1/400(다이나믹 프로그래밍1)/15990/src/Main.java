import java.util.Scanner;

// https://www.acmicpc.net/problem/15990

public class Main {

	public static void main(String[] args) {
		
		long[][] arr = new long[100001][4];
		
		arr[1][1] = 1;
		arr[2][2] = 1;
		arr[3][1] = 1;
		arr[3][2] = 1;
		arr[3][3] = 1;
		
		for(int i=4; i<=100000; i++) {
			arr[i][1] = (arr[i-1][2]+arr[i-1][3]) % 1000000009;
			arr[i][2] = (arr[i-2][1]+arr[i-2][3]) % 1000000009;
			arr[i][3] = (arr[i-3][1]+arr[i-3][2]) % 1000000009;
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			
			long result = (arr[n][1] + arr[n][2] + arr[n][3])%1000000009;
			System.out.println(result);
		}
			
			
			
			
		
		
	}
}
