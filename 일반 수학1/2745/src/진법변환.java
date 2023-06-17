// https://www.acmicpc.net/problem/2745

import java.util.Scanner;

public class 진법변환 {
	
	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		int jinbub; 
		String num;
		num = sc.next();
		jinbub = sc.nextInt();
		
		char[] arr = num.toCharArray();
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr2[i] = (int)arr[i] - 55;
			}
			else {
				arr2[i] = arr[i] - 48;
			}
		}
		
		double total = 0;
		
		for(int i=0; i<arr2.length; i++) {
			total += arr2[i] * Math.pow(jinbub, arr2.length-i-1);
		}
		
		System.out.println((int)total);
	}
}
