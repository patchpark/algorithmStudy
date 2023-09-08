import java.util.Scanner;

// https://www.acmicpc.net/problem/14501

public class Main {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] T = new int[n];
		int[] P = new int[n];

		for (int i = 0; i < n; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}

		int[] bf = new int[n+1];
		
		for(int i=0; i<n; i++) {
			if(i + T[i] <= n) {
				bf[i + T[i]] = Math.max(bf[i + T[i]], bf[i] + P[i]);
			}
			bf[i+1] = Math.max(bf[i+1], bf[i]);
		}
		
		System.out.println(bf[n]);
	}



}

