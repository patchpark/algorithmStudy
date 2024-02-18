import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int n, m, max;
	static int map[][];
	static int afterVirus[][];
	static int moveX[] = {1, -1, 0, 0};
	static int moveY[] = {0, 0, 1, -1};
	
	public static class V {
		int x, y;
		
		public V(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		max = 0;
		chooseWall(0);
		System.out.println(max);
		
	}
	
	public static void chooseWall(int count) { // 벽 3개 선택
		if(count == 3) {
			afterVirus = new int[n][m];
			countSafeZone();
			return;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					chooseWall(count+1);
					map[i][j] = 0;
				}
			}
		}
	}
	
	public static void countSafeZone() {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				afterVirus [i][j] = map[i][j];
//				if(map[i][j] == 2)
//					virus(i,j);
			}
		}
		
		for (int i = 0; i < n; i++) {
    		for (int j = 0; j < m; j++) {
    			if (map[i][j] == 2) {
    				virus(i, j);
    			}
    		}
    	}
		
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(afterVirus[i][j] == 0) {
					count++;
				}
			}
		}
		max = Math.max(max, count);
		
	}

	public static void virus(int x, int y) {
		Queue<V> queue = new LinkedList<>();
		
		queue.add(new V(x,y));
		
		while(!queue.isEmpty()) {
			V currentV = queue.poll();
			
			for(int i=0; i<4; i++) {
				int newX = currentV.x + moveX[i];
				int newY = currentV.y + moveY[i];
				
				
				if(newX >=0 && newY >= 0 && newX < n && newY <m && afterVirus[newX][newY] == 0) {
					afterVirus[newX][newY] = 100;
					queue.add(new V(newX, newY));
				}
			}
		}
		
		
	}
	
	
	
	
}








