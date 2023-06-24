import java.util.Scanner;

// https://www.acmicpc.net/problem/5073

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			
			int max = a;
			
			if(b > a) {
				max = b;
			}
			if(c > b) {
				max = c;
			}
			
			if(max >= a + b + c - max) {
				System.out.println("Invalid");
			}else if(a == b && b == c) {
				System.out.println("Equilateral");
			}else if(a == b || b == c || c == a) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
			
			
		}
		
	}
	
}
