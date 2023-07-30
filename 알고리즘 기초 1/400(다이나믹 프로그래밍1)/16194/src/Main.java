import java.util.Scanner;

// https://www.acmicpc.net/problem/16194


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num+1];
		
		for(int i=1; i<=num; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
			
			for(int j=1; j<=i; j++) {
				if(temp >= arr[i-j]+arr[j]) {
					temp = arr[i-j]+arr[j];
				}
			}
			arr[i] = temp;
			
			
		}
		System.out.println(arr[num]);
		
	}
	
}