import java.util.Scanner;
import java.util.Stack;

//  https://www.acmicpc.net/problem/1874
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int num = sc.nextInt();

		int[] arr = new int[num];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 2;
		boolean check = true;
		
		stack.push(1);
		sb.append("+").append("\n");
		
		for(int i = 0; i <num; i++) {
			
			int search = arr[i];
			
			while((stack.isEmpty() == false && search > stack.peek() || stack.isEmpty() == true)) {
				stack.push(count);
				sb.append("+").append("\n");
				count++;
			}
			
			if(search == stack.peek()) {
				stack.pop();
				sb.append("-").append("\n");
			}else {
				check = false;
			}
		
			
			
			
		}
		if(check) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
		
		
		
	}

}
