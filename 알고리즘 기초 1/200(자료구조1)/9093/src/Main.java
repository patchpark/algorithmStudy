import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// https://www.acmicpc.net/problem/9093

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
		
			
			String sentence = br.readLine();
			
			String sentence_reverse = "";
			
			for(int j=0; j<sentence.length(); j++) {
				
				sentence_reverse = sentence_reverse + sentence.charAt(sentence.length()-j-1);
				
			}
			
			String[] answer = sentence_reverse.split(" ");
			
			for(int j =0 ; j < answer.length; j++) {
				sb.append(answer[answer.length-j-1]).append(" ");	
			}
			
			
			System.out.println(sb);
			
			sentence_reverse = "";
			sb.setLength(0);
		}
		
		
		
	}
	
	
}
