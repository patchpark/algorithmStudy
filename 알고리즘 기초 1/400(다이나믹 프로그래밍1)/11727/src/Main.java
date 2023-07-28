import java.util.Scanner;

// https://www.acmicpc.net/problem/11727

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[1001];
		arr[1] = 1;
		arr[2] = 3;
		
		for(int i=3; i<=num; i++) {
			arr[i] = (arr[i-1] + arr[i-2]*2) % 10007;
		}
		
		System.out.println(arr[num]);
		
	}
	
}