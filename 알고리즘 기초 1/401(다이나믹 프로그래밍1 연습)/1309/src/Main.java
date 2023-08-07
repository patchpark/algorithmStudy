import java.util.Scanner;

//  https://www.acmicpc.net/problem/1309


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int arr[][] = new int[num][3];
		
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		
		for(int i=1; i<num; i++) {
			
			arr[i][0] = (arr[i-1][0] + arr[i-1][1] + arr[i-1][2]) % 9901;
			arr[i][1] = (arr[i-1][0] + arr[i-1][2]) % 9901;
			arr[i][2] = (arr[i-1][0] + arr[i-1][1]) % 9901;
			
			
		}
		
		int total = (arr[num-1][0] + arr[num-1][1] + arr[num-1][2]) % 9901;
		
		System.out.println(total);
		
		
		
		
	}
	
}
