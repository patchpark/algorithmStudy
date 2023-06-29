import java.util.Scanner;


// https://www.acmicpc.net/problem/1427


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		String[] arr = num.split("");
		
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i=0; i< arr2.length; i++) {
			for(int j=i; j<arr2.length; j++) {
				if(arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		
	}
	
}
