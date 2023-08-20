import java.util.Scanner;

// https://www.acmicpc.net/problem/3085

public class Main {

	static char arr[][];
	static int n;
	static int max = 1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new char[n][n];
		
		for(int i =0; i<n; i++) {
			String a = sc.next();
			for(int j=0; j<n; j++) {
				arr[i][j] = a.charAt(j);
			}
		}
		
		// 행 변경
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				swap(i, j, i, j+1);
				search();
				swap(i, j+1, i, j); // 원래 대로
			}
		}
		
		// 열 변경
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n; j++) {
				swap(i, j, i+1, j);
				search();
				swap(i+1, j, i, j); // 원래 대로
			}
		}
		System.out.println(max);
	}
	
	
	public static void swap(int a, int b, int c, int d) {
		char temp = arr[a][b];
		arr[a][b] = arr[c][d];
		arr[c][d] = temp;
	}
	
	public static void search() {
		// 행 탐색
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=0; j<n-1; j++) {
				if(arr[i][j] == arr[i][j+1]) {
					count++;
					max = Math.max(max, count);
				}else {
					count = 1;
				}
			}
		}
		
		// 열 탐색
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=0; j<n-1; j++) {
				if(arr[j][i] == arr[j+1][i]) {
					count++;
					max = Math.max(max, count);
				}else {
					count = 1;
				}
			}
		}
	}
	
	
}
