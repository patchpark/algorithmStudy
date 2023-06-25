import java.util.Scanner;

// https://www.acmicpc.net/problem/24313


public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt(), a0 = sc.nextInt(), c = sc.nextInt(), n0 = sc.nextInt();
		
		int fn = a1 * n0 + a0;
		int gn = c * n0;
		
		
		int left = a0;
		int right = (c-a1) * n0;
		
		if(left <= right && c-a1 >= 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
				
		
		
	}
	
}
