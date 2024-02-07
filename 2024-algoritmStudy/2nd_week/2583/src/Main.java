import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static int M, N, K, count;
	static int[][] status;
	static int[][] visited;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		K = sc.nextInt();
		
		status = new int[N][M];
		visited = new int[N][M];
		// 초기 설정
		for(int i=0; i<K; i++) {
			int leftX = sc.nextInt();
			int leftY = sc.nextInt();
			int rightX = sc.nextInt();
			int rightY = sc.nextInt();
			
			for(int x = leftX; x<rightX; x++) {
				for(int y=leftY; y<rightY; y++) {
					status[x][y] = 1;
				}
			}
		}
		
		ArrayList<Integer> areaSize = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(status[i][j] == 0 && visited[i][j] == 0) {
					count = 0;
					function(i, j);
					areaSize.add(count);
				}
			}
		}
		System.out.println(areaSize.size());
		Collections.sort(areaSize);
		
		for(int i : areaSize) {
			System.out.print(i + " ");
		}
	}
	
	public static void function(int x, int y) {
		visited[x][y] = 1;
		count++;
		for(int i=0; i<4; i++) {
			int newX = x + moveX[i];
			int newY = y + moveY[i];
			
			if(newX >=0 && newY >=0 && newX < N && newY < M) {
				if(status[newX][newY] == 0 && visited[newX][newY] == 0) {
					function(newX, newY);
				}
			}
			
		}
	}
	
}








