import java.util.Scanner;

// https://www.acmicpc.net/problem/24265

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Long num = sc.nextLong();

		Long total = 0L;
		
		for(int i = 2; i <= num; i++) {
			total += num-i+1;
		}
		
		System.out.println(total);
		System.out.println("2");

	}

}
