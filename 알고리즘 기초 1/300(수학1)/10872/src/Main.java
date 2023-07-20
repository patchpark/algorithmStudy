import java.util.Scanner;

// https://www.acmicpc.net/problem/10872

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer a = sc.nextInt();
		int total = 1;
		
		if(a == 0) {
			System.out.println(1);
		}else {
			for(int i=1; i<=a; i++) {
				total *= i;
			}
			System.out.println(total);
		}
		
		
	}
	
}
