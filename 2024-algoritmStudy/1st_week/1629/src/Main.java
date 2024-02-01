import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println(algo(A,B,C));
		// 시간 초과 다른 방법 필요
//		int mod = 1;
//		
//		for(int i=0; i<B; i++) {
//			mod = (mod*A)%C;
//			
//		}
//		System.out.println(mod);
		
		
		
		
	}
	static long algo(int a, int b, int c) {
		if(b == 0)
			return 1;
		long half = algo(a, b/2, c);
		if(b % 2 == 0)
			return half * half % c;
		else
			return (half * half % c) * a % c;
	}
	
}











