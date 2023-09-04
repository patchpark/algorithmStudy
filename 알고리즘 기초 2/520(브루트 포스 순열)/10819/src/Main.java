import java.util.Scanner;

// https://www.acmicpc.net/problem/10819

public class Main {
	
	public static int N;
	public static int[] arr;
	public static int[] arr2;
	public static boolean[] visited;
	public static int max = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		arr = new int[N];
		arr2 = new int[N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		dfs(0);
		
		System.out.println(max);
		
	}
	
	public static void dfs(int depth) {
		if(depth == N) {
			int check = 0;
			int choose = 0;
			for(int i=0; i<N-1; i++) {
				choose = arr2[i] > arr2[i+1] ? arr2[i]-arr2[i+1] : arr2[i+1]-arr2[i];
				check += choose;
			}
			if(check > max) {
				max = check;
			}
			
		}else {
			for(int i=0; i<N; i++) {
				if(!visited[i]) {
					visited[i] = true;
					arr2[depth] = arr[i];
					dfs(depth+1);
					visited[i] = false;
				}
			}
			
			
		}
	}
	
}
