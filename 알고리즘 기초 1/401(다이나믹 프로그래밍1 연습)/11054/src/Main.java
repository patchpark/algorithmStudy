import java.util.Scanner;

// https://www.acmicpc.net/problem/11054

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int dpLeft[] = new int[n+1];
		int dpRight[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			dpLeft[i] = 1;
			
			for(int j=1; j<i; j++) {
				if(arr[i] > arr[j]) {
					dpLeft[i] = Math.max(dpLeft[j] + 1, dpLeft[i]);
				}
			}
			
			
		}
		
		for(int i=n; i> 0; i--) {
			dpRight[i] = 1;
			for(int j=n; j > i; j--) {
				if(arr[i] > arr[j]) {
					dpRight[i] = Math.max(dpRight[j] + 1, dpRight[i]);
				}
			}
		}
		
		int max = 0;
		
		for(int i=1; i<= n; i++) {
			max = Math.max(max, dpRight[i] + dpLeft[i]);
		}
		
		System.out.println(max-1);
		
	}
	
}
