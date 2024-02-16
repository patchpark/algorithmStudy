import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int a, b, max;
	static char[][] map;
	static boolean[][] visited;
	static int[] moveX = {1, -1, 0, 0};
	static int[] moveY = {0, 0, 1, -1};

	static class Land{
		int x, y, count;
		
		public Land(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		map = new char[a][b];
		
		for(int i=0; i<a; i++) {
			String temp = sc.next();
			for(int j=0; j<b; j++) {
				map[i][j] = temp.charAt(j);
			}
		}
		
		max = 0;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(map[i][j] == 'L') {
					visited = new boolean[a][b];
					fun(new Land(i, j, 0));
				}
			}
		}
		
		System.out.println(max);
		
	}
	
	public static void fun(Land land) {
		Queue<Land> l = new LinkedList<>();
		l.add(land);
		visited[land.x][land.y] = true;
		
		while(!l.isEmpty()) {
			Land nextLand = l.poll();
			for(int i = 0; i < 4; i++) {
                int nextX = nextLand.x + moveX[i];
                int nextY = nextLand.y + moveY[i];

                if(nextX >= 0 && nextY >= 0 && nextX < a && nextY < b && !visited[nextX][nextY] && map[nextX][nextY] == 'L') {
                    visited[nextX][nextY] = true;
                    l.add(new Land(nextX, nextY, nextLand.count + 1));
                    max = Math.max(max, nextLand.count + 1);
                }
			}
		}
	}
	
}











