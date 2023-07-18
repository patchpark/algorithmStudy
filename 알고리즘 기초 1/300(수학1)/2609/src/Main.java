import java.util.Scanner;

// https://www.acmicpc.net/problem/2609

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int big = a > b ? a : b;
		int temp = 0;
		
		for(int i=big; i >0; i--) {
			if(a%i==0 && b%i ==0) {
				System.out.println(i);
				temp = i;
				break;
			}
		}
		
		System.out.println(a * (b / temp));
		
	}
	
}
