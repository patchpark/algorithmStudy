import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17413

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();
		String reverse = "";
		int i = 0;
		
		while(reverse.length() != sentence.length()) {			
			if(sentence.charAt(i) == '<') {
				while(sentence.charAt(i) != '>') {
					reverse = reverse + sentence.charAt(i);
					i++;
				}
			}else if(sentence.charAt(i) == '>'){
				reverse += '>';
				i++;
			}else if(sentence.charAt(i) == ' '){
				reverse = reverse + sentence.charAt(i);
				i++;
				
			}else{
				String arr = ""; 
				while(sentence.charAt(i) != ' ' && i<sentence.length()-1 && sentence.charAt(i) != '<') {
					arr += sentence.charAt(i);
					i++;					
				}
				StringBuffer sb = new StringBuffer(arr);
				reverse += sb.reverse();
				
				
			}
			
			
		}
		System.out.println(reverse);
		
		
		
		
		
	}
	
}
