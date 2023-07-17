import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/11655

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(((int)c >=65 && (int)c <= 77 ) || ((int)c >= 97 && (int)c <= 109)) {
				char cPlus = (char)((int)c + 13);
				sb.append(cPlus);				
			}
			else if((int)c >=78 && (int)c <= 90){
				char cPlus = (char)(65 + 13-(90-(int)c + 1));
				sb.append(cPlus);
			}else if((int)c >= 110 && (int)c <= 122) {	
				char cPlus = (char)(97 + 13-(122-(int)c + 1));
				sb.append(cPlus);
			}			
			else {
				sb.append(str.charAt(i));
			}
			
			
		}
		System.out.println(sb);
		
		
	}
	
	
}
