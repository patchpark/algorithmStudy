import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1260

public class Main {

	public static int N, M;
	public static int[][] list;
	public static boolean[] visited;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		
		list = new int[N+1][N+1];
		visited = new boolean[N+1];
	
		
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			list[from][to] = 1;
			list[to][from] = 1;
		}
		
		DFS(V);
		
		System.out.println();
		
		visited = new boolean[N+1];
		
		BFS(V);
	}
	
	
	public static void DFS(int V) {
		
		visited[V] = true;
		System.out.print(V + " ");

        for(int j = 1; j < list.length; j++) {
            if(list[V][j] == 1 && visited[j] == false) {
                DFS(j);
            }
        }	
		
	}

	
	public static void BFS(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(V);
        visited[V] = true;

        System.out.print(V + " ");

        while(!queue.isEmpty()) {
            int n = queue.poll();

            for(int i = 1; i < list.length; i++) {
                if(list[n][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    System.out.print(i + " ");
                    queue.offer(i);
                }
            }
        }   
    }
	
	
}


















