import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String pattern = sc.next();

		int[] check = new int[n];
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		String p1 = "", p2 = "";
		int star = 0;

		for (int i = 0; i < pattern.length(); i++) {
			if (pattern.charAt(i) == '*') {
				star = i;
			}
		}

		for (int i = 0; i < star; i++) {
			p1 += pattern.charAt(i);
		}

		for (int i = star + 1; i < pattern.length(); i++) {
			p2 += pattern.charAt(i);
		}

		for (int i = 0; i < n; i++) {

			if(arr[i].length() < p1.length() + p2.length()) {
				continue;
			}
			
			
			String temp = "";
			
			for(int j= 0; j<p1.length(); j++) {
				temp += arr[i].charAt(j);
			}
			
			if(temp.equals(p1))
				check[i]++;
			
			String temp2 = "";
			
			for(int j= arr[i].length()-p2.length(); j<arr[i].length(); j++) {
				temp2 += arr[i].charAt(j);
			}
			
			if(temp2.equals(p2))
				check[i]++;
			
		}
		
		for(int i=0; i<n; i++) {
			if(check[i] == 2) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}

	}

}
