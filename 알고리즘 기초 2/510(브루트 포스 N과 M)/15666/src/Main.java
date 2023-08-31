import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/15666

public class Main {
	public static int N;
	public static int M;
	public static int arr[];
	public static boolean check[];
	public static int arr2[];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N];
		arr2 = new int[M];
		check = new boolean[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		dfs(0, 0);

		System.out.println(sb);
	}

	public static void dfs(int start, int depth) {
		
		if (depth == M) {
			for (int i : arr2) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		int before = 0;
		for (int i = start; i < N; i++) {
			if(before != arr[i]) {
				arr2[depth] = arr[i];
				before = arr[i];
				dfs(i, depth+1);
			}
		}
	}
}
