import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// https://www.acmicpc.net/problem/1181

public class Main {	

	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<String> arr = new ArrayList<>();
		
		int num = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<num; i++) {
			String check = bf.readLine();
			if(arr.contains(check) == false) {
				arr.add(check);
			}
		}
		
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length()-s2.length();
				}
			}
		});
		
		
		for(String i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		
		
	}
	
}
