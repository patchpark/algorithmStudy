import java.util.Scanner;

// https://www.acmicpc.net/problem/2798

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int goalNum = sc.nextInt();
		int[] arr = new int[num];
		
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = 0;
				
		for(int i=0; i<num; i++) {
			for(int j= i+1; j<num; j++) {
				for(int k = j+1; k<num; k++) {
					if(arr[i]+arr[j]+arr[k] > min && arr[i]+arr[j]+arr[k]<=goalNum) {
						min = arr[i]+arr[j]+arr[k];
					}
				}
			}
		}
		System.out.println(min);
	}
	
}
