import java.util.Scanner;

// https://www.acmicpc.net/problem/1676

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a = sc.nextInt();
		int count = 0;

		if (a == 0) {
			System.out.println(0);
		} else {
			for (int i = 1; i <= a; i++) {
				if (i % 125 == 0) {
					count += 3;
				} else if (i % 25 == 0) {
					count += 2;
				} else if (i % 5 == 0) {
					count += 1;
				}
			}
			System.out.println(count);
		}

	}

}
