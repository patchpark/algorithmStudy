import java.util.Scanner;

// https://www.acmicpc.net/problem/2903


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[16];
		
		arr[0] = 2;
		
		for(int i=1; i<arr.length; i++) {
			arr[i] = 2* arr[i-1] - 1; 
		}
		
		int num = sc.nextInt();
		
		System.out.println(arr[num]*arr[num]);
		
		
	}
	
}
