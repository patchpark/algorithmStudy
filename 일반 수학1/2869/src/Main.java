import java.util.Scanner;

// https://www.acmicpc.net/problem/2869
	
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int height = sc.nextInt();
		int check = 0;
		int day = 0;
		
		while(true) {
			check += up;
			day++;
			if(height <= check) break;
			check -= down;
		}
		
		System.out.println(day);
	}

}
