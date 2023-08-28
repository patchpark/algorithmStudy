import java.util.Scanner;

// https://www.acmicpc.net/problem/15650


// 다른 방식
public class Main2 {

	public static int arr[];
	public static int N;
	public static int M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		dfs(0,0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int start, int depth) {
		
		if(depth == M) {
			for(int i=0; i<M; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=start; i<N; i++) {
			arr[depth] = i+1;
			dfs(i+1 , depth+1);
		}
		
		
		
	}
	
	

	
	
	
	
}
