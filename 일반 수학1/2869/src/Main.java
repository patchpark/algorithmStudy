import java.util.Scanner;

// https://www.acmicpc.net/problem/2869
	
public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int height = sc.nextInt();
		
		int a = height-up;
		
		if(a%(up-down) == 0) {
			System.out.println(a/(up-down) + 1);
		}else {
			System.out.println((int)(a/(up-down)) + 2);
		}
		
		
	}

}
