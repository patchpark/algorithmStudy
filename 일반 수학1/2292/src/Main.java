import java.util.Scanner;

// https://www.acmicpc.net/problem/2292

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i = 0;
		int j = 1;
		int k = 0;
		
		
		while(num >= j) {
			i = i +k;
			k++;
			j = 6 * i + 2;
		}
		
		if(j == 1) {
			System.out.println(1);
		}else {
			System.out.println(k);
		}
		
		
	}
	
}
