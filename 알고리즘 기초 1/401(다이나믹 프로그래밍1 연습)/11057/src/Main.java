import java.util.Scanner;

// https://www.acmicpc.net/problem/11057
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[][] = new int[num][10];
		
		
		for(int i=0; i<10; i++) {
			arr[0][i] = 1;
		}
		
		for(int i=1; i<num; i++) {
			int count = 0;
			for(int j=0; j<10; j++) {
				count += arr[i-1][j];
				arr[i][j] = count%10007;
			}
			
		}
		
		int answer = 0;
		
		for(int i=0; i<10; i++) {
			answer += arr[num-1][i];
		}
		System.out.println(answer%10007);
		
	}

}
