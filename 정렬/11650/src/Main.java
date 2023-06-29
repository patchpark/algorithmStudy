import java.util.Scanner;

// https://www.acmicpc.net/problem/11650

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] arr = new int[num][2];

		for (int i = 0; i < num; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				if (arr[i][0] > arr[j][0]) {
					int temp = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp;
				} else if (arr[i][0] == arr[j][0]) {
					if (arr[i][1] > arr[j][1]) {
						int temp = arr[i][1];
						arr[i][1] = arr[j][1];
						arr[j][1] = temp;
					}

				}
			}
		}

		for (int i = 0; i < num; i++) {
			System.out.print(arr[i][0] + " ");
			System.out.println(arr[i][1]);
		}

	}
}