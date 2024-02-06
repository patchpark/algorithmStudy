import java.util.Scanner;

public class Main {

	static int width, height, cabbage, count;
	static int[][] arr;
	static int[][] visited;
	static int[] goX = {1, -1, 0, 0};
	static int[] goY = {0, 0, 1, -1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			width = sc.nextInt();
			height = sc.nextInt();
			cabbage = sc.nextInt();
			count = 0;
			
			arr = new int[width][height];
			visited = new int[width][height];
			
			for(int j=0; j<cabbage; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
			}
			
			for(int j=0; j<width; j++) {
				for(int k=0; k<height; k++) {
					if(arr[j][k] == 1 && visited[j][k] == 0) {
						function(j, k);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
	}
	
	public static void function(int x, int y) {
		visited[x][y] = 1; // 방문 완료
		
		for(int i=0; i<4; i++) {
			int nextX = x + goX[i];
			int nextY = y + goY[i];
			
			if(nextX >= 0 && nextY >= 0 && nextX < width && nextY <height) {
				if(visited[nextX][nextY] == 0 && arr[nextX][nextY] == 1)
					function(nextX, nextY);
			}
			
		}
		
	}
	
}
