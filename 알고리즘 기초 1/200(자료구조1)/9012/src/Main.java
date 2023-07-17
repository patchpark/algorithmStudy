import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9012


public class Main {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<num; i++) {
			
			String VPS = br.readLine();
			
			int count = 0;
			
			for(int j=0; j<VPS.length(); j++) {
				if(VPS.charAt(j) == '(') {
					count++;
				}else {
					count--;
				}
				
				if(count < 0) {
					break;
				}
				
			}
			
			if(count == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			
		}
		
		
	}
	
}
