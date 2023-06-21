import java.util.Scanner;

//https://www.acmicpc.net/problem/10757

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		String reverse_a = "";
		String reverse_b = "";

		for (int i = a.length() - 1; i > -1; i--) {
			reverse_a += a.charAt(i);
		}

		for (int i = b.length() - 1; i > -1; i--) {
			reverse_b += b.charAt(i);
		}

		int length = (a.length() > b.length()) ? a.length() : b.length();

		int[] arr1 = new int[length];
		int[] arr2 = new int[length];

		for (int i = 0; i < a.length(); i++) {
			arr1[i] = Character.getNumericValue(reverse_a.charAt(i));
		}

		for (int i = 0; i < b.length(); i++) {
			arr2[i] = Character.getNumericValue(reverse_b.charAt(i));
		}

		
		int[] arr3 = new int[length+1];
		int carry = 0;
		
		for(int i =0; i<length; i++) {
			int add = arr1[i] + arr2[i];
			if(carry==0) {
				if(add < 10) {
					arr3[i] = add;
				}else {
					arr3[i] = add - 10;
					carry = 1;
				}
			}else {
				if(add < 9) {
					arr3[i] = add+1;
					carry = 0;
				}else {
					arr3[i] = add - 9;
				}
			}
		}
		
		if(carry == 1) {
			System.out.print("1");
		}
		
		for(int i = length-1; i >= 0; i--) {
			System.out.print(arr3[i]);
		}
		
		
	}

	
}
