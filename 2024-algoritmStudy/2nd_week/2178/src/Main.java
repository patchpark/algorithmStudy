import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n, m;
	static int[][] arr;
	static int [][] visited;
	
	static class coordinate{
		int x;
		int y;
		
		
		public coordinate(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void bfs(int x, int y) {
		Queue<coordinate> c = new LinkedList<>();
		c.add(new coordinate(x,y));
		
		int[] X = {1,-1,0,0}; // x축이동
		int[] Y = {0,0, 1, -1}; // y축 이동
		
		while(!c.isEmpty()) {
			coordinate co = c.poll();
			for (int i = 0; i < 4; i++) {
                int nextX = co.x + X[i];
                int nextY = co.y + Y[i];
                
                // 벗어나면
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) {
                    continue;
                }
                // 길이 없으면
                if (visited[nextX][nextY] == 1 || arr[nextX][nextY] == 0) {
                    continue;
                }
                c.add(new coordinate(nextX, nextY));
                arr[nextX][nextY] = arr[co.x][co.y] + 1;
                visited[nextX][nextY] = 1;
            }
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][m];
		visited = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			
			for(int j=0; j<m; j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		visited[0][0] = 1;		
		
		bfs(0, 0);
		System.out.println(arr[n-1][m-1]);
	}
	
}
