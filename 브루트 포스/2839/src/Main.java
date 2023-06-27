import java.util.Scanner;

// https://www.acmicpc.net/problem/2839

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kg = sc.nextInt();
		
		int a = kg/5 + 1;
		int b = kg/3 + 1;
		
		int min = 10000;
		int check = 0;
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(5*i + 3* j == kg) {
					check =1;
					if(i+j < min) {
						min = i+j;
					}
				}
			}
		}
		
		if(check == 1) {
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
		
		
		
	}
	
}
