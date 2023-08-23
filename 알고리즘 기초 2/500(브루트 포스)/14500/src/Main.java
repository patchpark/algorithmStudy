import java.util.Scanner;

//  https://www.acmicpc.net/problem/14500

// 매우 어려움
// ㅗ 케이스를 제외하고는 DFS 적용...


public class Main {
	static int a,b,max  = 0;
	static int dr[] = {-1,0,1,0}; // 상하좌우
	static int dc[] = {0,-1,0,1};
	static int arr[][];
	static boolean visited[][];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		arr = new int[a][b];
		visited = new boolean[a][b];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				dfs(i, j, 0, 0);
				others(i,j);
			}
		}		
		System.out.println(max);
	}
	
	// ㅗ 모양을 제외한 4회 탐색
	static void dfs(int r, int c, int depth, int sum) {
		if(depth == 4) { // 탐색이 끝나면 리턴
			max = Math.max(max, sum);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(nr<0 || nr>=a || nc<0 || nc>=b)continue; // 넘어가면 예외처리
			if(visited[nr][nc])continue; // 이미 탐색한 곳이면 넘어감
			
			visited[nr][nc] = true;
			dfs(nr, nc, depth+1, sum + arr[nr][nc]); // 탐색 1 늘림, 값 너하기
			visited[nr][nc] = false;
			}
	}
	
	// ㅗ 모양 탐색
	static void others(int r, int c){
		int count = 4; // 4개의 날개
		int min = 999999999;
		int sum = arr[r][c];
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr<0 || nr>=a || nc<0 || nc>=b) { // 예외일 경우 포함x
				count--;
				continue;
			}
			if(count <=2)return; // 제외
			min = Math.min(min, arr[nr][nc]);
			sum = sum + arr[nr][nc];			
		}
		
		if(count == 4) {
			sum = sum - min;
		}
		max = Math.max(max, sum);
		
	}
	
}
