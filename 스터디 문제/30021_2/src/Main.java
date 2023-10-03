import java.util.Scanner;

// https://www.acmicpc.net/problem/30021

public class Main {

	public static int N;
	public static int[] arr;
	public static boolean[] visited;
	public static int[] gift;
	public static StringBuilder sb = new StringBuilder();
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		arr = new int[N];
		gift = new int[N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		int check = 0;
		
		for(int i=0; i<N; i++) {
			if(giveGift(arr[i], 0) == 1) {
				check = 1;
				System.out.println("YES");
				System.out.println(sb);
				
			}
			break;
			
		}
		
		if(check == 0) {
			System.out.println("NO");
		}
		
		
	}
	
	public static int giveGift(int total, int depth) {
		if(depth == N) {
			for(int i : gift) {
				sb.append(i).append(" ");
			}
			return 1;
		}else {
			for(int i=0; i<N; i++) {
				if(!visited[i]) {
					visited[i] = true;						
					total += arr[i];
					if(isDecimal(total)) {
						gift[depth] = arr[i];
						giveGift(total, depth+1);
					}
					visited[i] = false;
					total -= arr[i];
				}
			}
		}
	}
	
	public static boolean isDecimal(int num) {
		if (num == 1) {
			return true;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return true; // 소수가 아니라면 true 반환
				}
			}
			return false; // 소수라면 false 반환
		}
	}
}