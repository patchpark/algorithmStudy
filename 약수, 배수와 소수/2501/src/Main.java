import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2501

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				a.add(i);
			}
		}
		
		if(count > a.size()) {
			System.out.println("0");
		}else {
			System.out.println(a.get(count-1));
		}
		
		
		
	}

}
