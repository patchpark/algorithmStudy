import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1759

public class Main {

	public static char words[];
	public static boolean check[];
	public static char password[];
	public static int n;
	public static int m;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		words = new char[n];
		check = new boolean[n];
		password = new char[m];
		
		for(int i=0; i<n; i++) {
			words[i] = sc.next().charAt(0);
		}
	
		Arrays.sort(words);
		getAllPassword(0, 0);
	}
	
	public static void getAllPassword(int start, int depth) {
		
		char[] a = {'a','e','i','o','u'};
		
		if(depth == m) {
			int count = 0;
			for(char i : password) {
				for(char j : a) {
					if(i == j) {
						count++;
					}
				}
			}
			if(count >=1 && m-count >=2) {
				for(char i : password) {
					System.out.print(i);
				}
				System.out.println();
			}
		}else {
			for(int i=start; i<n; i++) {
				if(!check[i]) {
					check[i] = true;
					password[depth] = words[i];
					getAllPassword(i+1, depth+1);
					check[i] = false;
				}
			}
			
			
			
		}
	}	
	
}
