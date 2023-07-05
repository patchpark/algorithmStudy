import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


// https://www.acmicpc.net/problem/11478


public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=1; i<=word.length(); i++) {
			
			for(int j=0; j<=word.length()-i; j++) {
				set.add(word.substring(j, j+i));
			}
			
		}
		
		System.out.println(set.size());
		
		
		
	}
	
}
