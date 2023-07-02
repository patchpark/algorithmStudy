import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/7785

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, String> map = new HashMap<String, String>();

		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			
			map.put(st.nextToken(), st.nextToken());
		}
		
		List<String> keySet = new ArrayList<String>(map.keySet());
		
		Collections.sort(keySet, Collections.reverseOrder());
		
		for(String key: keySet) {
			if(map.get(key).equals("enter")) {
				sb.append(key).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
