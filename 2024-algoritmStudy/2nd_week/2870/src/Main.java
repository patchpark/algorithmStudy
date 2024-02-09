import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<BigDecimal> answer = new ArrayList<BigDecimal>();

		String temp = "";

		for (int i = 0; i < n; i++) {
			String str = sc.next();

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
					temp = temp + str.charAt(j);
				} else {
					if(!temp.equals("")) {
						answer.add(new BigDecimal(temp));
						temp = "";
					}
				}
			
			}
			
			if(!temp.equals("")) {
				answer.add(new BigDecimal(temp));
				temp = "";
			}
		}

		Collections.sort(answer);
		
		for (BigDecimal i : answer) {
			System.out.println(i);
		}

	}
	
}
