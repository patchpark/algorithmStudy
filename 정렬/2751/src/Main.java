import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2751

public class Main {	
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list); // 시간 복잡도 n * logn
		
		for(int i : list) {
			sb.append(i).append('\n'); // 문자열 처리 시간 감소
		}
		System.out.println(sb);
	}
}