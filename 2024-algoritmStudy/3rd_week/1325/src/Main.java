import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static boolean[] visited;
	static ArrayList<Integer>[] computers;
	static int[] arr;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
	
		computers = new ArrayList[n];
		
		for(int i=0; i<n; i++) {
			computers[i] = new ArrayList<Integer>();
		}
		
		arr = new int[n];
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			computers[a-1].add(b-1);
		}
		
		for(int i=0; i<n; i++) {
			visited = new boolean[n];
			visited[i] = true;
			fun(i);
		}
		
		int max = 0;
        for (int i = 0; i < n; i++)
            max = Math.max(arr[i], max);

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == max)
            	sb.append(i+1).append(" ");
        }
        
        System.out.println(sb);
    }
	
	public static void fun(int x) {
		for(int computer : computers[x]) {
			if(!visited[computer]) {
				arr[computer]++;
				visited[computer] = true;
				fun(computer);
			}
		}
	}
	
	
}






