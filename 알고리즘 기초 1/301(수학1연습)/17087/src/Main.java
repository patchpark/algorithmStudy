import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/17087

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		Long S = Long.parseLong(st.nextToken());
		
		Long[] arr = new Long[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			Long num = Long.parseLong(st.nextToken());
			arr[i] = num > S ? num-S : S-num;
		}		
		
		
		
		Long D = arr[0];
		
		for(int i=1; i<N; i++) {
			D = gcd(D, arr[i]);	
		}
		System.out.println(D);
		
	}
	static Long gcd(Long d, Long arr) {
		if(arr ==0) {
			return d;
		}else {
			return gcd(arr, d%arr);
		}
	}
	
}
