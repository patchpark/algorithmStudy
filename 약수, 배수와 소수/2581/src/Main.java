import java.util.Scanner;

// https://www.acmicpc.net/problem/2581

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		
		int total = 0;
		int min = endNum;
		
		for(int i = startNum; i<=endNum; i++) {
			int check = 0;
			
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					check++;
				}
			}
			if(check == 2) {
				total += i;
				if(i < min) {
					min = i;
				}
				
			}
		}
		
		if(total == 0) {
			System.out.println("-1");
		}else {
			System.out.println(total);
			System.out.println(min);
		}
		
		
	}
	
}
