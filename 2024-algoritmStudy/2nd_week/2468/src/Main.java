import java.util.Scanner;

public class Main {

	static int[][] arr;
	static int[][] visited;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};
	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		
		for(int i=0; i< 100; i++) {
			int count = 0;
			
			visited = new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(arr[j][k] > i && visited[j][k] == 0) {
						function(j, k, i);
						count++;
					}
				}
			}
			
			if(count > max) {
				max = count;
			}
			
		}
		System.out.println(max);
		
		
		
	}
	
	
	public static void function(int x, int y , int h) {
		visited[x][y] = 1;
		
		for(int i=0; i<4; i++) {
			int cx = x + moveX[i];
			int cy = y + moveY[i];
			
			if(cx >= 0 && cy>= 0 && cx < n && cy < n) {
				if(arr[cx][cy] > h && visited[cx][cy] == 0) {
					function(cx, cy, h);
				}
			}
			
		}
		
	}
}
