import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/9506

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			
			if(a == -1) break;
			
			int add = 0;
			
			for(int i=1; i<a; i++) {
				if(a % i == 0) {
					add += i;
				}
			}
			
			if(add != a) {
				System.out.println(a + " is NOT perfect.");
			}else {
				System.out.print(a + " = ");
				for(int i=1; i<a; i++) {
					if(a% i == 0) {
						if(i == 1) {
							System.out.print("1");
						}else {
							System.out.print(" + " + i);
						}
					}
				}
				System.out.println();
			}
			
			
			
			
			
		}

	}

}
