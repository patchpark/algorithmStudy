import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


// https://www.acmicpc.net/problem/11656

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		String[] str2 = new String[str.length()];
		
		for(int i=0; i<str2.length; i++) {
			
			int num = i;
			
			str2[num] = str.substring(num);
		}
		
		
		Arrays.sort(str2);

		
		for(int i=0; i<str2.length; i++) {
			sb.append(str2[i]).append("\n");
		}
		System.out.println(sb);
	}
	
}
