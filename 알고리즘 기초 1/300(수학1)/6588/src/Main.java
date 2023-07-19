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

		// �迭 �ʱ�ȭ  
		for (int i = 2; i <= arr.length-1; i++) {
			arr[i] = i;
		}

		// 2���� �����ؼ� i�� ������� �迭���� �����ش�
		for (int i = 2; i <= arr.length-1; i++) {
			// �̹� ������ ���� �ǳʶڴ�
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
