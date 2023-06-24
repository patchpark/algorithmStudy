import java.util.Scanner;

// https://www.acmicpc.net/problem/10101

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if(a + b + c != 180) {
			System.out.println("Error");
		}else if(a == b && a == 60) {
			System.out.println("Equilateral");
		}else if(a == b || b == c || c == a) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
		
		
		
	}
	
}
