import java.util.Scanner;

public class Main {

	static int n, delete;
    static int[] parent;
    static int count = 0;
    static int[] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		parent = new int[n];
		
		int root = 0;
		
		for(int i=0; i<n; i++) {
			parent[i] = sc.nextInt();
			if(parent[i] == -1)
				root = i;
		}
		
		delete = sc.nextInt();
		
		delete(delete);
		
		visited = new int[n];
		
		count(root);
		
		System.out.println(count);
		
	}
	
	public static void delete(int delete) {
		parent[delete] = -100;
		
		for(int i=0; i<n; i++) {
			if(parent[i] == delete)
				delete(i);
		}
	}
	public static void count(int current) {
		boolean leaf = true;
		
		visited[current] = 1;
		
		if(parent[current] != -100) {
			for(int i=0; i<n; i++) {
				if(parent[i] == current && visited[i] == 0) {
					count(i);
					leaf = false;
				}
			}
			if(leaf)
				count++;
		}
	}
}