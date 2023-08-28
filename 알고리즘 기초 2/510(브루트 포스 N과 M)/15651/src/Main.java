import java.util.Scanner;

// https://www.acmicpc.net/problem/15651

public class Main {
	
	public static int N;
	public static int M;
	public static int arr[];
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		dfs(0);
		
		System.out.println(sb);
		
	}
	
	public static void dfs(int depth) {
		if(depth == M) {
			for(int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++) {
			arr[depth] = i+1;
			dfs(depth+1);
		}
		
	}
	
	
}
