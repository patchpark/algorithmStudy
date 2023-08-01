import java.util.Scanner;

//  https://www.acmicpc.net/problem/10844


public class Main {

	public static void main(String[] args) {
		
		long arr[][] = new long[101][10];
		
		
		for(int i=1; i<10; i++) {
			arr[1][i] = 1;

		}
		
		
		for(int i=2; i<=100; i++) {
			arr[i][0] = arr[i-1][1]%1000000000;
			arr[i][1] = (arr[i-1][0] + arr[i-1][2])%1000000000;
			arr[i][2] = (arr[i-1][1] + arr[i-1][3])%1000000000;
			arr[i][3] = (arr[i-1][2] + arr[i-1][4])%1000000000;
			arr[i][4] = (arr[i-1][3] + arr[i-1][5])%1000000000;
			arr[i][5] = (arr[i-1][4] + arr[i-1][6])%1000000000;
			arr[i][6] = (arr[i-1][5] + arr[i-1][7])%1000000000;
			arr[i][7] = (arr[i-1][6] + arr[i-1][8])%1000000000;
			arr[i][8] = (arr[i-1][7] + arr[i-1][9])%1000000000;
			arr[i][9] = arr[i-1][8]%1000000000;
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		long total = 0;
		
		for(int i=0; i<10; i++) {
			total += arr[num][i];
		}
		
		System.out.println(total%1000000000);
		
	}
	
	
}
