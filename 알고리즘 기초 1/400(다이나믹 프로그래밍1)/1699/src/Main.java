import java.util.Scanner;

// https://www.acmicpc.net/problem/1699

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[] = new int[num+1];
		
		for(int i=1; i<=num; i++) {
			
			arr[i] = i;
			
			for(int j=1; j * j <= i; j++) {
				  if (arr[i] > arr[i - j * j] + 1) {
	                    arr[i] = arr[i - j * j] + 1;
				  }
			}
			
			
			
		}
		System.out.println(arr[num]);
		
		
	}
	
}
