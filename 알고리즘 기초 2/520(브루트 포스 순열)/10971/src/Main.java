import java.util.Scanner;

// https://www.acmicpc.net/problem/10971
	
public class Main {

	public static int[][] arr;
	public static boolean[] visited;
	public static int n;
	public static long min = 1000000000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			visited = new boolean[n];
			visited[i] = true;
			TSP(i,i,0);
		}
		
		System.out.println(min);
		
		
	}
	
	public static void TSP(int start, int current, long cost){
		if(visitedCheck()) {
			if(arr[current][start]!=0) {
				min = Math.min(min, cost + arr[current][0]);
			}
			
		}else {
			for(int i=1; i<n; i++){
	            if (!visited[i] && arr[current][i] != 0) {
	                visited[i] = true;
	                TSP(start, i, cost + arr[current][i]);
	                visited[i] = false;
	            }
	        }
		}
	}
	public static boolean visitedCheck() {
		for(int i=0; i<n; i++) {
			if(!visited[i]) {
				return false;
			}
		}
		return true;
	}
	
}
