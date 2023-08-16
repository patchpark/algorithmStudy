// https://www.acmicpc.net/problem/2133

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N + 1];

		arr[0] = 1;

		for (int i = 2; i <= N; i += 2) {
			arr[i] = arr[i - 2] * 3;
			for (int j = i - 4; j >= 0; j -= 2) {
				arr[i] += arr[j] * 2;
			}
		}

		System.out.println(arr[N]);
	}
}