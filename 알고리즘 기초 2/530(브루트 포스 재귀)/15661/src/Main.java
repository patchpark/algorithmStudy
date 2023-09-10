import java.util.Scanner;

// https://www.acmicpc.net/problem/15661

public class Main {

	public static int[][] arr;
	public static int n;
	public static boolean[] check;
	public static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		check = new boolean[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=1; i<n; i++) {
			fun(0, 0, i);
		}
		
		System.out.println(min);
	}

	public static void fun(int start, int depth, int target) {
		if (depth == target) {
			diff();
		} else {

			for (int i = start; i < n; i++) {
				if (!check[i]) {
					check[i] = true;
					fun(i + 1, depth + 1, target);
					check[i] = false;
				}
			}
		}

	}

	public static void diff() {
		int teamA = 0;
		int teamB = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(check[i] && check[j]) {
					teamA += arr[i][j];
					teamA += arr[j][i];
				}else if(!check[i] && !check[j]) {
					teamB += arr[i][j];
					teamB += arr[j][i];
				}		
				
			}
			
		}
		
		int temp = Math.abs(teamA - teamB);
		
		
		min = Math.min(min, temp);
	}
	
}
