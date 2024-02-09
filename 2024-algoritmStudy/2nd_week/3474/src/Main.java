import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			int num2 = 0;
			int num5 = 0;
			
			for(int j=2; j<=num; j = j*2) {
				num2 = num2 + num / j;			
			}
			
			for(int j=5; j<=num; j = j*5) {
				num5 = num5 + num / j;			
			}
			
			System.out.println(Math.min(num2, num5));
		}

	}

}
