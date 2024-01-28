import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		
		int[] arr = new int[9];
		
		Scanner sc = new Scanner(System.in);

		int total = 0;
		
		for (int i = 0; i < 9; i++) {
			int a = sc.nextInt();
			arr[i] = a;
			total += a;
		}
		
		Arrays.sort(arr);
		
		// 0 1 2 3 4 5 6  //  0 1 2 3 4 5 7 // 0 1 2 3 4 5 8 // 1 2 3 4 5 6 7 // .... // 2 3 4 5 6 7 8
		// 0부터 8까지 중 두개를 제외한 것을 모두 더함
		
		int i =0, j = 0; int check = 0;
		
		for(i=0; i<9; i++) {
			for(j=i+1; j<9; j++) {
				int sum = total - arr[i] - arr[j];
				if(sum == 100) {
					check = 1;
					for(int k=0; k<9; k++) {
						if(k!=i && k!=j) {
							System.out.println(arr[k]);
						}
					}
					break;
				}
			}
			if(check == 1)
				break;
		}

		
	}
}
