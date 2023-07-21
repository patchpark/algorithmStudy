import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/9613

public class Main {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		Long t = Long.parseLong(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			Long[] arr = new Long[n];
			Long total = 0L;
			
			for(int j=0; j<n; j++) {
				arr[j] = Long.parseLong(st.nextToken());
			}
			
			
			for(int j=0; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					Long choose = arr[j] > arr[k] ? arr[k] : arr[j];
					for(Long c = choose; c>0; c--) {
						if(arr[j]%c == 0 & arr[k]%c == 0) {
							total += c;
							break;
						}
					}
					
				}
			}
			
			
			System.out.println(total);
		}
		
		
		
	}
	
	
}
