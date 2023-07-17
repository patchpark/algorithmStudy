import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//
//// https://www.acmicpc.net/problem/1406
//
//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuffer sb = new StringBuffer();
//		
//		String word = br.readLine();
//		
//		sb.append(word);
//		
//		int num = Integer.parseInt(br.readLine());
//		
//		int cursor = word.length();
//		
//		for(int i=0; i<num; i++) {
//			
//			String instruction = br.readLine();
//			
//			if(instruction.equals("L")) {
//				if(cursor != 0) {
//					cursor--;
//				}
//			}else if(instruction.equals("D")) {
//				if(cursor != sb.length()) {
//					cursor++;
//				}
//			}else if(instruction.equals("B")) {
//				if(cursor != 0) {
//					sb.deleteCharAt(cursor-1);
//					cursor--;
//				}
//			}else {
//				String[] arr = instruction.split(" ");
//				sb.insert(cursor, arr[1]);
//				cursor++;
//			}
//		}
//		System.out.println(sb);
//		
//		
//	}
//	
//} // 시간 초과

// 스택을 이용한 풀이

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> leftStack = new Stack<Character>();
		Stack<Character> rightStack = new Stack<Character>();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			leftStack.push(str.charAt(i));
		}

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			String order = br.readLine();
			switch (order.charAt(0)) {
			case 'L':
				if (!leftStack.isEmpty()) {
					rightStack.push(leftStack.pop());
				}
				break;
			case 'D':
				if (!rightStack.isEmpty()) {
					leftStack.push(rightStack.pop());
				}
				break;
			case 'B':
				if (!leftStack.isEmpty()) {
					leftStack.pop();
				}
				break;
			case 'P':
				leftStack.push(order.charAt(2));
			}

		}
		
        while(!leftStack.isEmpty())
            rightStack.push(leftStack.pop());
 
        StringBuilder sb = new StringBuilder();
 
        while(!rightStack.isEmpty())
            sb.append(rightStack.pop());
 
        System.out.print(sb);

	}
}





