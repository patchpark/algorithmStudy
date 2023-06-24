import java.util.Scanner;

// https://www.acmicpc.net/problem/1085

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt(), w=sc.nextInt(), h = sc.nextInt();
		
		int[] arr = {x, y, w-x, h-y};
		
		int min = x;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min);
		
		
	}
	
	
}
