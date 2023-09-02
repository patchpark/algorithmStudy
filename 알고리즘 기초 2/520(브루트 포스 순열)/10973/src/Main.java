import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10973
public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		r(arr);
		
	}
	
	public static void r(int[] arr) {
		boolean check = false;
		int memorize = 0;
		
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i]<arr[i-1]) {
				check = true;
				int max= 0;
				int temp =0;
				for(int j=i; j<arr.length; j++) {
					if(arr[j] > max && arr[j] < arr[i-1]) {
						max = arr[j];
						temp = j;
					}
				}
				int temp2 = arr[i-1];
				arr[i-1] = max;
				arr[temp] = temp2;
				
				Arrays.sort(arr, i, arr.length);
				
				memorize = i;
				
				break;
			}
		}
		
		
		if(!check) {
			System.out.println(-1);
		}else {
			for(int i=0; i<memorize; i++) {
				System.out.print(arr[i] + " ");
			}
			for(int i=arr.length-1; i>=memorize; i--) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}
	
	
}
