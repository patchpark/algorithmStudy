import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int arr[] = new int[26];
		
		
		for(int j=0; j<str.length(); j++) {
			int check = (int)(str.charAt(j)-'a');
			arr[check]++;
		}
		
		
		for(int i=0; i<26; i++) {
			System.out.print(arr[i] + " ");
		}

		
	}
	
	
	
}
