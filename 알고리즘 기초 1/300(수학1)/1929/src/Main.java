import java.util.Scanner;
import java.io.*;
import java.util.*;
// https://www.acmicpc.net/problem/1929

//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//
//		int start = sc.nextInt();
//		int end = sc.nextInt();
//
//		for (int i = start; i <= end; i++) {
//
//			int num = i;
//			boolean check = true;
//
//			for (int j = 1; j < num; j++) {
//				if (num % j == 0 && j != 1) {
//					check = false;
//					break;
//				}
//			}
//
//			if (check == true) {
//				sb.append(num).append("\n");
//			}
//
//		}
//		System.out.println(sb);
//
//	}
//} // �ð� �ʰ�


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		primeNumber(m, n);
	}

	// �����佺�׳׽��� ü �̿�
	static void primeNumber(int m, int n) {
		int[] arr = new int[n + 1];
		StringBuilder sb = new StringBuilder();

		// �迭 �ʱ�ȭ  
		for (int i = 2; i <= n; i++) {
			arr[i] = i;
		}

		// 2���� �����ؼ� i�� ������� �迭���� �����ش�
		for (int i = 2; i <= n; i++) {
			// �̹� ������ ���� �ǳʶڴ�
			if (arr[i] == 0)
				continue;
			for (int j = i + i; j <= n; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = m; i <= n; i++) {
			if (arr[i] != 0)
				sb.append(i + "\n");
		}
		System.out.print(sb);

	}

}









