import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n, min, max;
	static int[][] country;
	static boolean[][] visited;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static ArrayList<Nation> list;
	
	public static class Nation{
		int x;
		int y;
		
		public Nation(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		min = sc.nextInt();
		max = sc.nextInt();
		
		country = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				country[i][j] = sc.nextInt();
			}
		}
		System.out.println(move());
	}
	
	public static int move() {
		int count = 0;
		while(true) {
			boolean move = false;
			visited = new boolean[n][n];

			for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(visited[i][j] == false) {
                        int sum = fun(i, j);
                        if(list.size() > 1) {
                            int avg = sum/list.size();
                            for(Nation n : list) {
                            	country[n.x][n.y] = avg;
                            }
                            move = true;
                        }    
                    }
                }
            }
			
			if(move == false)
				return count;
			count++;
		}
	}
	
	public static int fun(int x, int y) {
		 Queue<Nation> q = new LinkedList<>();
	        list = new ArrayList<>();
	        
	        q.offer(new Nation(x, y));
	        list.add(new Nation(x, y));
	        visited[x][y] = true;
	        
	        int sum = country[x][y];
	        while(!q.isEmpty()) {
	            Nation current = q.poll();
	            
	            for(int i = 0; i < 4; i++) {
	                int nx = current.x + moveX[i];
	                int ny = current.y + moveY[i];
	                if(nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
	                    int diff = Math.abs(country[current.x][current.y] - country[nx][ny]);
	                    if(min <= diff && diff <= max) {
	                        q.offer(new Nation(nx, ny));
	                        list.add(new Nation(nx, ny));
	                        sum += country[nx][ny];
	                        visited[nx][ny] = true;
	                    }        
	                }
	            }
	        }
	        return sum;
	}
}












