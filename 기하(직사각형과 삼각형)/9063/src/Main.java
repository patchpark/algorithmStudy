import java.util.Scanner;

// https://www.acmicpc.net/problem/9063

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int aMax = -10000;
		int aMin = 10000;
		
		int bMax = -10000;
		int bMin = 10000;
		
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > aMax) {
				aMax = a;
			}
			
			if(a < aMin) {
				aMin = a;
			}
			
			if(b > bMax) {
				bMax = b;
			}
			
			if(b < bMin) {
				bMin = b;
			}
			
			
		}
		
		if(num == 1 || aMax == aMin || bMax == bMin) {
			System.out.println(0);
		}else{
			System.out.println((aMax-aMin)*(bMax-bMin));
		}
		
	}
	
}
