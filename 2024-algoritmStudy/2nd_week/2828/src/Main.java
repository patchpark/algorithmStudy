import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int j = sc.nextInt();
		
		int answer = 0;
		
		int left = 1;
		int right = M;
		
		
		for(int i=0; i<j; i++) {
			
			int space = sc.nextInt();
			if(space > right) {
				answer += space - right;
				right = space;
				left = space-(M-1);
			}else if(space < left) {
				answer += left - space;
				left = space;
				right = space+(M-1);
			}
			
		}
		System.out.println(answer);
		
	}
	
}
