import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1620
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int test = Integer.parseInt(st.nextToken());

		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
	
		
		for(int i=1; i<=num; i++) {
			String poketmon = br.readLine();
			map.put(i, poketmon);
			map2.put(poketmon, i);
		}
		
//		for(Integer i : map.keySet()) {
//			System.out.println(i + " " + map.get(i));
//		}
//		for(String i : map2.keySet()) {
//			System.out.println(i + " " + map2.get(i));
//		}
//	
		
		
		for(int i=0; i<test; i++) {
			String answer = br.readLine();
			if(isString(answer)) {
				sb.append(map.get(Integer.parseInt(answer))).append("\n");
			}else {
			    sb.append(map2.get(answer)).append("\n");
			}
			
		}
		System.out.println(sb);
		
	}
	
	public static boolean isString(String answer) {
		try {
			Double.parseDouble(answer);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	
	
}



