import java.util.Scanner;

// https://www.acmicpc.net/problem/14215

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		int max = a;
		
		if(b > a && b > c) {
			max = b;
		}
		if(c > a && c > b) {
			max = c;
		}
		
		
		if(max == a) {
			if(a >= b+c) {
				System.out.println(2*(b+c)-1);
			}else {
				System.out.println(a+b+c);
			}
		}else if(max == b) {
			if(b >= a+c) {
				System.out.println(2*(a+c)-1);
			}else {
				System.out.println(a+b+c);
			}
		}else {
			if(c >= a+b) {
				System.out.println(2*(a+b)-1);
			}else {
				System.out.println(a+b+c);
			}
		}
		
		
		
	}
	
}
