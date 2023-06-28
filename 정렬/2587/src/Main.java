import java.util.Scanner;

//https://www.acmicpc.net/problem/2587

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int total = 0;
		
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		System.out.println((int)(total/5));
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				if(arr[i] >= arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(arr[2]);
		
		
	}
	
}
