import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17103

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean prime[] = new boolean[1000001];
		prime[0] = prime[1] = true; // ¼Ò¼ö´Â false
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {
				for (int j = i + i; j < prime.length; j += i) {
					prime[j] = true;
				}
			}

		}
		
		
		
		
		
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int j=2; j<=N/2; j++) {
				if(!prime[j] && !prime[N-j]) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		
	}
	
}
