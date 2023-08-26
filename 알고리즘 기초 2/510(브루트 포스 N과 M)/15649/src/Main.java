import java.util.Scanner;

// https://www.acmicpc.net/problem/15649

public class Main {

	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(N, M, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) { // M개가 다 차면 출력(sb에 추가)
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(N, M, depth+1);   // 깊이 1 추가
				visit[i] = false;
			}
		}
		
	}
	
	
}
