import java.util.Scanner;

// https://www.acmicpc.net/problem/15650
public class Main {

	static int arr[];
	static boolean check[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		arr = new int[M];

		check = new boolean[N];

		dfs(N, M, 0);

		System.out.println(sb);

	}

	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			boolean c = true;

			for (int i = 0; i < M - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					c = false;
				}
			}

			if (c == true) {

				for (int i = 0; i < M; i++) {
					sb.append(arr[i] + " ");
				}
				sb.append("\n");
			}
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				check[i] = false;
			}
		}

	}

}
