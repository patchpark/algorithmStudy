import java.util.Scanner;

// https://www.acmicpc.net/problem/2193


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[][] arr = new long[N+1][2];
		
		
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		
		for(int i=2; i<=N; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-1][1];
			arr[i][1] = arr[i-1][0];
		}
		
		
		System.out.println(arr[N][0] + arr[N][1]);
		
		
	}
	
}
