import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/14425

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<String> arr = new ArrayList<String>();
		String[] arr2 = new String[M];
		
		for(int i=0; i<N; i++) {
			arr.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			arr2[i] = br.readLine();
		}
		
		int count =0;
		
		for(int i=0; i<M; i++) {
			if(arr.contains(arr2[i])) {
				count++;
			}
		}

		
		System.out.println(count);
		
	}
	
	
}
