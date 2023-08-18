import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2309

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[9];
		int total = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		int a = 0, b = 0, c = 0;

		Arrays.sort(arr);

		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (arr[i] + arr[j] == total - 100) {
					a = i;
					b = j;
					break;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i != a && i != b) {
				System.out.println(arr[i]);
			}
		}

	}

}
