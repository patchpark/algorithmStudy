import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/17298

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		String[] A = br.readLine().split(" ");

		Integer[] arr = new Integer[A.length];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(A[i]);
		}

		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
			
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int i=0; i<N; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);

	}

}
