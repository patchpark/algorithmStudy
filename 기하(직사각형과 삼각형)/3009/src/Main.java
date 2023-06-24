import java.util.Scanner;

// https://www.acmicpc.net/problem/3009

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		if(a == c) {
			System.out.print(e + " ");
		}else if(c == e) {
			System.out.print(a + " ");
		}else {
			System.out.print(c + " ");
		}
		
		if(b == d) {
			System.out.println(f);
		}else if(d == f) {
			System.out.println(b);
		}else {
			System.out.println(d);
		}
	
	}
	
}
