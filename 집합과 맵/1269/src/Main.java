import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1269

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<A; i++) {
			int check = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(check)) {
				map.replace(check, map.get(check)+1);
			}else {
				map.put(check, 1);
			}
		}
		
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < B; i++) {
			int check = Integer.parseInt(st.nextToken());

			if (map.containsKey(check)) {
				map.replace(check, map.get(check) + 1);
			} else {
				map.put(check, 1);
			}
		}
		int count = 0;
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
}
