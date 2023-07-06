import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



// https://www.acmicpc.net/problem/10828


public class Main {

	public static void main(String[] args) throws IOException{

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			
			String[] instruction = br.readLine().split(" ");
			
			if(instruction[0].equals("push")) {
				arr.add(Integer.parseInt(instruction[1]));
			}else {
				if(instruction[0].equals("pop")) {
					if(arr.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(arr.get(arr.size()-1));
						arr.remove(arr.size()-1);
					}
				}else if(instruction[0].equals("size")) {
					System.out.println(arr.size());
				}else if(instruction[0].equals("empty")) {
					if(arr.size() == 0) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
				}else if(instruction[0].equals("top")){
					if(arr.size() == 0) {
						System.out.println(-1);
					}else {
						System.out.println(arr.get(arr.size()-1));
					}
				}
				
				
				
				
				
				
				
			}
		}
				
	}
	

	
}









