import java.util.Scanner;

// https://www.acmicpc.net/problem/15988

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long[] arr = new long[1000001];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4; i<=1000000;i++) {
			arr[i] = (arr[i-1] + arr[i-2] + arr[i-3]) % 1000000009;
		}
				
		int n = sc.nextInt();
				
		for(int i=0; i<n; i++) {
			
			int num = sc.nextInt();
			
			System.out.println(arr[num]);		
			
		}
		
	}
	
}
