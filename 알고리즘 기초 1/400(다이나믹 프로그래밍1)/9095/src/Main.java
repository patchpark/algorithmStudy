import java.util.Scanner;

// https://www.acmicpc.net/problem/9095

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[11];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		
		
		for(int i=3; i<11; i++) {
			arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
		}
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			System.out.println(arr[n-1]);
		}
		
		
	}
	
}
