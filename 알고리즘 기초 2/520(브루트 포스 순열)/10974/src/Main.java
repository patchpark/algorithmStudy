import java.util.Scanner;

// https://www.acmicpc.net/problem/10974
public class Main {

	public static int[] arr;
	public static boolean[] visited;
	public static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();

		arr = new int[n];
		visited = new boolean[n];

		r(0);

	}

	public static void r(int depth) {

		if (depth == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;

			arr[depth] = i + 1;
			visited[i] = true;
			r(depth + 1);
			visited[i] = false;
		}
	}
}
