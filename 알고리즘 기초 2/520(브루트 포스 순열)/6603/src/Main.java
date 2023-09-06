import java.util.Scanner;

// https://www.acmicpc.net/problem/6603

public class Main {

	public static int n;
	public static int[] arr;
	public static boolean[] check;
	public static int[] lotto  = new int[6];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			n = sc.nextInt();

			if (n == 0) {
				break;
			} else {

				arr = new int[n];

				check = new boolean[n];

				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}

				Lotto(0, 0);
				System.out.println();
			}
		}

	}
	
	
	public static void Lotto(int start, int depth) {
		if(depth == 6) {
			for(int i : lotto) {
				System.out.print(i + " ");
			}
			System.out.println();
		}else {
			for(int i=start; i<n; i++) {
				if(!check[i]) {
					check[i] = true;
					lotto[depth] = arr[i];
					Lotto(i+1, depth+1);
					check[i] = false;
				}
			}
		}
		
	}
	
}
