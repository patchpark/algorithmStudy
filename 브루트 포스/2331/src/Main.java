import java.util.Scanner;

// https://www.acmicpc.net/problem/2231

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int numLength = String.valueOf(num).length();
		int total = 0;
		int temp = 0;
		int check = 0;
		
		for(int i = 1; i <= num; i++) {
			temp = i;
			total = i;
			for(int j = 0; j < numLength; j++) {
				total += (int)(temp / Math.pow(10, numLength-1-j));
				temp = (int)(temp % Math.pow(10, numLength-1-j));
			}
			
			if(total == num) {
				System.out.println(i);
				check = 1;
				break;
			}
		}
		
		if(check == 0) {
			System.out.println(0);
		}
		
		
	}
}
