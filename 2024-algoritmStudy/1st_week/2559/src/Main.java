import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] num = new int[N];
		
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		int max = -100 * K;
		
		for(int i=0; i<N-K+1; i++) {
			int temp = 0;
			for(int j=i; j<i+K; j++) {
				temp += num[j];
			}
			if(temp > max)
				max = temp;
		}
		
		System.out.println(max);
		
		
	}
	
}
