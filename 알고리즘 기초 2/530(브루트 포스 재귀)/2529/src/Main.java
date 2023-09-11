import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2529

public class Main {

	public static String[] sign; // 부등호
	public static int n; // 개수
	public static int[] arr; // 답
	public static boolean[] visited; // 사용여부
	public static List<String> numList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		sign = new String[n];
		for(int i=0; i<n; i++) {
			sign[i] = sc.next();
		}
		arr = new int[n+1];
		visited = new boolean[10];
		
		function("", 0);
		
		System.out.println(numList.get(numList.size()-1));
		System.out.println(numList.get(0));
		
		
	}
	
	
	public static void function(String num, int depth) {
		if(depth == n+1) {
			numList.add(num);
		}else {
			for(int i=0; i<10; i++) {
				if(!visited[i]) {
					if(depth == 0 || signCheck(Character.getNumericValue(num.charAt(depth-1)), i, sign[depth-1])) {
						visited[i] = true;
						function(num + i, depth+1);
						visited[i] = false;
					}
				}
			}
		}
	}
	
	
	public static boolean signCheck(int a, int b, String c) {
		if(c.equals(">")) {
			if(a<b)
				return false;
		}else if(c.equals("<")){
			if(a>b)
			return false;
		}
		return true;
	}
	
}
