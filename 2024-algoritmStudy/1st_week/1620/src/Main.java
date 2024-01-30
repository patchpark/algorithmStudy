import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static boolean isNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		HashMap<Integer, String> poketmon = new HashMap<>();
		HashMap<String, Integer> poketmon2 = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String temp = sc.next();
			poketmon.put(i+1, temp);
			poketmon2.put(temp, i+1);
		}
		

		for(int i=0; i<M; i++) {
			String temp = sc.next();
			if(isNum(temp) == true) {
				System.out.println(poketmon.get(Integer.parseInt(temp)));
			}else {
				System.out.println(poketmon2.get(temp));
			}
		}
			
			
		
		
		
		
	}
	
}
