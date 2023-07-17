import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10808

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[26];
		
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {

			
			arr[(int)str.charAt(i) - 97] += 1;
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}
	
}
