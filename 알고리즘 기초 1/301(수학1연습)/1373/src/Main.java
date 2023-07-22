import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1373

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		
		String str = br.readLine();
		
		sb = new StringBuilder(str);
		
		String reverse = sb.reverse().toString();
		
		int total = 0;
		
		sb.setLength(0);
		
		for(int i=0; i<reverse.length();i++) {
			if(i%3 == 0) {
				total += Character.getNumericValue(reverse.charAt(i));
			}else if(i%3 == 1) {
				total += Character.getNumericValue(reverse.charAt(i))*2;
			}else {
				total += Character.getNumericValue(reverse.charAt(i))*4;
				sb.insert(0, total);
				total=0;
			}
			
			if(i==reverse.length()-1 && i%3!=2) {
				sb.insert(0,total);
			}
			
			
		}
		System.out.println(sb);
		
		
	}
	
}
