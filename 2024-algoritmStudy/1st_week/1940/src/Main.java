import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int[] num = new int[n];
		int[] check = new int[n];		
		
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
			check[i] = 0;
		}
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(check[j] == 0 && num[i] + num[j] == m) {
					check[j] = 1;
					count++;
				}
			}
		}
		System.out.println(count);		
		
		
	}
	
}
