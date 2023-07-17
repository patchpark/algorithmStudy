import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10820

public class Main {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";

			while ((str = br.readLine()) != null) {
				int[] arr = new int[4];

				for (int i = 0; i < str.length(); i++) {

					char check = str.charAt(i);

					if ((int) check >= 97 && (int) check <= 122) {
						arr[0]++;
					} else if ((int) check >= 48 && (int) check <= 57) {
						arr[2]++;
					} else if ((int) check >= 65 && (int) check <= 90) {
						arr[1]++;
					} else {
						arr[3]++;
					}
				}
				System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
