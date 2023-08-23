import java.util.Scanner;

//  https://www.acmicpc.net/problem/14500

// �ſ� �����
// �� ���̽��� �����ϰ�� DFS ����...


public class Main {
	static int a,b,max  = 0;
	static int dr[] = {-1,0,1,0}; // �����¿�
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
	
	// �� ����� ������ 4ȸ Ž��
	static void dfs(int r, int c, int depth, int sum) {
		if(depth == 4) { // Ž���� ������ ����
			max = Math.max(max, sum);
			return;
		}
		
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if(nr<0 || nr>=a || nc<0 || nc>=b)continue; // �Ѿ�� ����ó��
			if(visited[nr][nc])continue; // �̹� Ž���� ���̸� �Ѿ
			
			visited[nr][nc] = true;
			dfs(nr, nc, depth+1, sum + arr[nr][nc]); // Ž�� 1 �ø�, �� ���ϱ�
			visited[nr][nc] = false;
			}
	}
	
	// �� ��� Ž��
	static void others(int r, int c){
		int count = 4; // 4���� ����
		int min = 999999999;
		int sum = arr[r][c];
		for(int i=0; i<4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr<0 || nr>=a || nc<0 || nc>=b) { // ������ ��� ����x
				count--;
				continue;
			}
			if(count <=2)return; // ����
			min = Math.min(min, arr[nr][nc]);
			sum = sum + arr[nr][nc];			
		}
		
		if(count == 4) {
			sum = sum - min;
		}
		max = Math.max(max, sum);
		
	}
	
}
