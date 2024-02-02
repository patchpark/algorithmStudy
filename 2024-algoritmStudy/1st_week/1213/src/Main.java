import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int[] alphabet = new int[26];

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 'A']++;
		}

		int oneCheck = 0;
		int middle = -1;

		for (int i = 0; i < 26; i++) {
			if (alphabet[i] % 2 == 1) {
				middle = i;
				oneCheck++;
			}
		}

		StringBuffer sb = new StringBuffer();
		String answer = "";

		if (oneCheck > 1) {
			System.out.println("I'm Sorry Hansoo");
		} else {
			for (int i = 0; i < alphabet.length; i++) {
				for (int j = 0; j < alphabet[i] / 2; j++) {
					sb.append((char) (i + 'A'));
				}
			}
			String t1 = sb.toString();
			String t2 = sb.reverse().toString();
			
			StringBuffer sb2 = new StringBuffer();
			
			if(middle != -1)
				sb2.append((char)(middle+'A'));

			answer = t1 + sb2.toString() + t2;
			
			System.out.println(answer);

		}
	}

}
