import java.util.Scanner;

// https://www.acmicpc.net/problem/2720

public class Main {

	public static void main(String[] args) {
		
		int q=25, d=10, n=5, p=1;
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i =0; i < num; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<num; i++) {
			int left = arr[i];
			int a = (int)(left/q);
			left = left%q;
			int b = (int)(left/d);
			left = left%d;
			int c = (int)(left/n);
			left = left%n;
			int e = left;		
			
			System.out.println(a + " " + b +" " +c+ " "+e);
		}
		
		
		
	}
	
}
