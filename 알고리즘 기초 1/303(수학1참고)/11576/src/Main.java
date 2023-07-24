import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// https://www.acmicpc.net/problem/11576

public class Main{

	
	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int total = 0;
		
		for(int i=0; i<m; i++) {			
		 total += (int) (Integer.parseInt(st.nextToken()) * Math.pow(A, m-1-i));	
		}
		
		
		int start=0;
		int check = 1;
		while(total > B*check) {
			check = (int) Math.pow(B, start);
			start++;
		}
		
		for(int i=start-1; i>=0; i--) {
			sb.append(total / (int)Math.pow(B, i)).append(" ");
			total = total % (int)Math.pow(B, i);
		}
		
	System.out.println(sb);
		
		
	}	
}
