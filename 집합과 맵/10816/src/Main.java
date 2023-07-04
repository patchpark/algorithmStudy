import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/10816


public class Main {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		
		
		
		for(int i=0; i<num; i++) {
			int card = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(card)) {
				map.replace(card, map.get(card)+1);
			}else {
				map.put(card, 1);
			}
		}
		
		int num2 = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<num2; i++) {
			int check = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(check)){
				sb.append(map.get(check)).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
	
	
}
