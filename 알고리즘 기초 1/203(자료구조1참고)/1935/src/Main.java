import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/1935

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		double[] arr = new double[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Stack<Double> stack = new Stack<Double>();
		
		int arr_count = 0;
		double answer = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '+') {
				double a = stack.pop();
				double b = stack.pop();
				answer = a + b;
				stack.push(answer);
			}else if(str.charAt(i) == '-') {
				double a = stack.pop();
				double b = stack.pop();
				answer = b - a;
				stack.push(answer);
			}else if(str.charAt(i)== '*') {
				double a = stack.pop();
				double b = stack.pop();
				answer = a * b;
				stack.push(answer);
			}else if(str.charAt(i) == '/') {
				double a = stack.pop();
				double b = stack.pop();
				answer = b / a;
				stack.push(answer);
			}else {
				stack.push(arr[(int)str.charAt(i) - 65]); 
				arr_count++;
			}
		}
		System.out.printf("%.2f", answer);
	}
	
}
