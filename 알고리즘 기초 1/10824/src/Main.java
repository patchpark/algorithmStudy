import java.util.Scanner;

// https://www.acmicpc.net/problem/10824
	
public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		
		String a = str[0] + str[1];
		String b = str[2] + str[3];
		
		Long answer = Long.parseLong(a) + Long.parseLong(b);
		
		System.out.println(answer);
		
		
	}	
}
