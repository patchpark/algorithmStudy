import java.util.Scanner;

// https://www.acmicpc.net/problem/2089

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println(0);
		}else {
			while(num != 1) {
				sb.append(Math.abs(num%-2));
				num = (int)Math.ceil((double)num / (-2));
			}
			
			sb.append(num);
			
			sb.reverse();
			System.out.println(sb);
		}
		
	}
	
}
