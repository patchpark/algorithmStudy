import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static int N, M, answer;
	public static boolean[] visited;
	public static List<Integer>[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		list = new ArrayList[N];
		
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			// ��������� ������ִ�!
			// a �� b�� ģ����� b a�� �ص� ���� a b�̹Ƿ� ģ�� ���谡 �Ǿ��ϹǷ�
			list[from].add(to);
			list[to].add(from);
		}
		
		for (int i = 0; i < N; i++) {
			// i�� dfs�� ���۳�尡 �ȴ�.
			// �Ѱ��� ��带 �湮�����Ƿ� cnt�� 1�� �����Ѵ�.
			go(i, 1);
			
			// ������ ���ǿ� �´� A B C D E�� �����Ѵٴ� �ǹ��̹Ƿ� ���̻� Ž�� X
			if (answer > 0) {
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	public static void go(int cur, int cnt) {
		// �������� �䱸�ϴ� ���� �׷���Ž���� ���� A B C D E 5�� ��� 
		// ��, 5���� ��带 �湮�� �� �ֳĸ� �䱸�ϰ������Ƿ� 5���� ��带 ã�Ҵٸ� ����
		if (cnt == 5) {
			answer = 1;
			return;
		}
		
		// ���� ��� �湮ó��
		visited[cur] = true;
		// ���� ���� ����� ������ Ž��
		for (int next : list[cur]) {
			// �湮�� ���ߴٸ� ��� ������ +1 ���ְ� �湮
			if (!visited[next]) {
				go(next, cnt + 1);
			}
		}
		// ���� dfs Ž���� ���� false�� ����
		visited[cur] = false;
	}
}