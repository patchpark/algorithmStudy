import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int C = sc.nextInt();
		
		HashMap<Integer, Integer> pw = new HashMap<Integer, Integer>();
		List<Integer> origin = new ArrayList<Integer>();
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();

			origin.add(temp);
			answer.add(temp);
			
			if(pw.containsKey(temp))
				pw.put(temp, pw.get(temp) + 1);
			else
				pw.put(temp, 1);
		}
		
		
		Collections.sort(answer, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if(pw.get(a) == pw.get(b))
					return Integer.compare(origin.indexOf(a), origin.indexOf(b));
				else
					return Integer.compare(pw.get(b), pw.get(a));
			}
		});
		
		for(int i : answer) {
			System.out.print(i + " ");
		}
		
	}
	
}
