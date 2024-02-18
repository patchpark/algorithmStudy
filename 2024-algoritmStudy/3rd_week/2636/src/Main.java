import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    static int[] moveX = {0, 1, 0, -1};
    static int[] moveY = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] board;
    static int n, m;
    static int cheese;
    
    public static class Cheese{
    	int x, y;
    	
    	public Cheese(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        board = new int[n][m];
        
        cheese = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) cheese++;
            }
        }
        
        int cheeseCount = 0;
        int time = 0;
        while(cheese != 0) {
            cheeseCount = cheese;
            time++;
            visited = new boolean[n][m];
            fun();
        }
        System.out.println(time);
        System.out.println(cheeseCount);
    }
    
    public static void fun() {
        Queue<Cheese> q = new LinkedList<>();
        q.offer(new Cheese(0, 0));
        visited[0][0] = true;
        
        while(!q.isEmpty()) {
            Cheese currentCheese = q.poll();
            
            for(int i = 0; i < 4; i++) {
                int nx = currentCheese.x + moveX[i];
                int ny = currentCheese.y + moveY[i];
                
                if(nx >= 0 && ny >= 0 && nx < n && ny < m && visited[nx][ny] == false) {
                    visited[nx][ny] = true;
                    if(board[nx][ny] == 0) {
                        q.offer(new Cheese(nx, ny));
                    } else {
                        cheese--;
                        board[nx][ny] = 0;
                    }
                }
            }
        }
    }
}    
