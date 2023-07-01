import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//  https://www.acmicpc.net/problem/10814


public class Main {

	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(bf.readLine());
		
		String[][] arr = new String[num][2];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.valueOf(s1[0])-Integer.valueOf(s2[0]);
			}
		});
		
		for(int i=0; i<num; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
		
	}


}
