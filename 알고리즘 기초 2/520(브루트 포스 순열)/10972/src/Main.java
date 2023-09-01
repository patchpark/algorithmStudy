import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/10972

public class Main {

	public static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		r(arr);

	}

	public static void r(int[] arr) {
		boolean check = false;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				check = true;
				int min = 1000000;
				int rem = 0;
				for(int j=i; j<arr.length; j++) {
					if(arr[j]>arr[i-1] && arr[j]< min) {
						min = arr[j];
						rem = j;
					}
				}
				arr[rem] = arr[i-1];
				arr[i-1] = min;
				
				
				Arrays.sort(arr, i, arr.length);
				break;
			}

		}
		
		if(!check) {
			System.out.println("-1");
		}else {
			for(int i : arr) {
				System.out.print(i + " ");
			}
		}
	}
}
