import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1764

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N+M; i++) {
			String check = br.readLine();
			
			if(map.containsKey(check)) {
				map.replace(check, map.get(check)+1);
			}else {
				map.put(check, 1);
			}
		}
		
		int count = 0;
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				count++;
				arr.add(entry.getKey());
			}
		}
		
		Collections.sort(arr);
		
		System.out.println(count);
		for(String i : arr) {
			System.out.println(i);
		}
		
	}
	
}
