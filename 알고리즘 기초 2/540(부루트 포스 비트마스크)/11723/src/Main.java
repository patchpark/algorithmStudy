import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11723

public class Main {

	public static boolean[] check = new boolean[20];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			st = new StringTokenizer(br.readLine());
			String fun = st.nextToken();
			
			if(fun.equals("add")) {
				int num = Integer.parseInt(st.nextToken());
				add(num);
			}else if(fun.equals("remove")) {
				int num = Integer.parseInt(st.nextToken());
				remove(num);
			}else if(fun.equals("check")) {
				int num = Integer.parseInt(st.nextToken());
				check(num);
			}else if(fun.equals("toggle")) {
				int num = Integer.parseInt(st.nextToken());
				toggle(num);
			}else if(fun.equals("all")) {
				all();
			}else if(fun.equals("empty")) {
				empty();
			}
			
			
			
		}
		
		
	}
	
	public static void add(int a) {
		if(!check[a-1]) {
			check[a-1] = true;
		}
	}
	public static void remove(int a) {
		if(check[a-1]) {
			check[a-1] = false;
		}
	}
	public static void check(int a) {
		if(check[a-1]) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	public static void toggle(int a) {
		check[a-1] = !check[a-1];
	}
	public static void all() {
		for(int i=0; i<20; i++) {
			check[i] = true;
		}
	}
	public static void empty() {
		for(int i=0; i<20; i++) {
			check[i] = false;
		}
	}
}
// 위의 코드는 시간 초과... 새로운 방식 필요


