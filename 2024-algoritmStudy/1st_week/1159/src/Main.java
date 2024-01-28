import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean check = false;

		int num = sc.nextInt();

		char[] firstLetter = new char[num];

		for (int i = 0; i < num; i++) {
			firstLetter[i] = sc.next().charAt(0);
		}

		int alphabet[] = new int[26];

		for (int i = 0; i < num; i++) {
			alphabet[(int) (firstLetter[i] - 'a')]++;
		}

		for (int i = 0; i < 26; i++) {
			if (alphabet[i] >= 5) {
				check = true;
				break;
			}
		}

		if (check == false)
			System.out.println("PREDAJA");
		else {
			for (int i = 0; i < 26; i++) {
				if (alphabet[i] >= 5) {
					System.out.print((char)(i + 'a'));
				}
			}

		}
	}
}
