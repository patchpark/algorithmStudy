import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// https://www.acmicpc.net/problem/10845

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
		
		String instruction = br.readLine();
		
		if(instruction.equals("front")){
			if(arr.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(arr.get(0)).append("\n");
			}
		}else if(instruction.equals("back")) {
			if(arr.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(arr.get(arr.size()-1)).append("\n");
			}
		}else if(instruction.equals("size")) {
			sb.append(arr.size()).append("\n");
		}else if(instruction.equals("empty")) {
			if(arr.isEmpty()) {
				sb.append("1").append("\n");
			}else {
				sb.append("0").append("\n");
			}
		}else if(instruction.equals("pop")) {
			if(arr.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(arr.get(0)).append("\n");
				arr.remove(0);
			}
		}else {
			String[] check = instruction.split(" ");
			
			arr.add(Integer.parseInt(check[1]));
		}
			
		
		
		}
		
		System.out.println(sb);
	}
		
	
}
