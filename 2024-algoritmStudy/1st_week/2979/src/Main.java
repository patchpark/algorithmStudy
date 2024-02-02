import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = 0;
		
		int[] timeCheck = new int[100];
		
		for(int i=0; i<3; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			
			for(int j=start-1;j<end-1;j++) {
				timeCheck[j]++;
			}
		}
		
		
		
		
		for(int i=0; i<100; i++) {
			if(timeCheck[i] == 1)
				sum += A;
			if(timeCheck[i] == 2)
				sum += 2*B;
			if(timeCheck[i]==3)
				sum += 3*C;
		}
			
		System.out.println(sum);
	}
	
}
