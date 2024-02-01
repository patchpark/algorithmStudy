import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int mod = 0;
			int n = sc.nextInt();

			for (int i = 1;; i++) {
				mod = (mod * 10 + 1) % n;

				if (mod == 0) {
					System.out.println(i);
					break;
				}
			}

		}
	}

}
