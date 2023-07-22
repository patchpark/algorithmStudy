import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1212

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		int firstNum = Character.getNumericValue(str.charAt(0));
		boolean check = false;

		if (firstNum == 0) {
			System.out.println(0);
		} else {

			if (firstNum / 4 == 1) {
				sb.append(1);
				firstNum -= 4;
				check = true;
			}

			if (firstNum / 2 == 1) {
				sb.append(1);
				firstNum -= 2;
				check = true;
			} else {
				if (check == true) {
					sb.append(0);
				}
			}

			if (firstNum / 1 == 1) {
				sb.append(1);
			} else {
				if (check == true) {
					sb.append(0);
				}
			}

		}
		
		
		
		for(int i=1; i<str.length(); i++) {
			
			int num = Character.getNumericValue(str.charAt(i));
			
			
			if(num/4 == 1) {
				sb.append(1);
				num -= 4;
			}else {
				sb.append(0);
			}
			
			if(num/2 == 1) {
				sb.append(1);
				num -= 2;
			}else {
				sb.append(0);
			}
			
			if(num/1 == 1) {
				sb.append(1);
			}else {
				sb.append(0);
			}
			
			
		}
		
		System.out.println(sb);
		
	}
	
}
