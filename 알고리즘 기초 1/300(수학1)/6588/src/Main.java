import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/6588


public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int a = Integer.parseInt(br.readLine());
			goldbach(a);
			
		}
		
		
	}
	
	
	static void goldbach(int a) {
		int[] arr = new int[1000001];
		StringBuilder sb = new StringBuilder();

		// 배열 초기화  
		for (int i = 2; i <= arr.length-1; i++) {
			arr[i] = i;
		}

		// 2부터 시작해서 i의 배수들을 배열에서 지워준다
		for (int i = 2; i <= arr.length-1; i++) {
			// 이미 지워진 수는 건너뛴다
			if (arr[i] == 0)
				continue;
			for (int j = i + i; j <= arr.length-1; j += i) {
				arr[j] = 0;
			}
		}
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i=2; i<arr.length; i++) {
			if(arr[i]!=0) {
				arrList.add(i);
			}
		}
		
		for(int i : arrList) {
			if(arrList.contains(a-i)) {
				System.out.println( a + " = " + i + " + " + (a-i));
				break;
			}
		}
		
	}

	
}
