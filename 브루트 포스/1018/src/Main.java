import java.util.Scanner;

// https://www.acmicpc.net/problem/1018

public class Main {

	public static int count(String arr[][]) {
		
		int countA = 0;
		int countB = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i%2==0 && j%2==0) || (i%2==1 && j%2==1)) { 
					if(arr[i][j].equals("W")) {
						countA++;
					}else {
						countB++;
					}
					
				}
				else {
					if(arr[i][j].equals("B")) {
						countA++;
					}else {
						countB++;
					}
				}
			}
		}
		
		int count = countA < countB ? countA : countB;
		
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String[] arr = new String[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.next();
		}

		int count = 0;
		int min = 64;

		String[][] arr2 = new String[a][b];

		for (int i = 0; i <= a - 8; i++) {
			for (int j = 0; j <= b - 8; j++) {

				for (int k = i; k < i + 8; k++) {
					arr2[k - i] = arr[k].substring(j, j+8).split(""); // 하나 선택
				}

				count = count(arr2);
				
				if(count < min) {
					min = count;
				}
			}

		}
		System.out.println(min);

	}

}
