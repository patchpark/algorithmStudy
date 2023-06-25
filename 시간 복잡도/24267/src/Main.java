//https://www.acmicpc.net/problem/24267

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Long num = sc.nextLong();

		Long total = 0L;
		
		for(int i = 0; i <= num-3; i++) {
			total += (i+1)*(num-2-i);
		}
		
		System.out.println(total);
		System.out.println("3");

	}

}
