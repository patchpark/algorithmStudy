import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//
//// https://www.acmicpc.net/problem/10799
//
//
//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		
//		Stack <Character> stack = new Stack<Character>();
//		
//		int result = 0;
//		
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == '('){
//				stack.push('(');
//				continue;
//			}
//			if(str.charAt(i) == ')') {
//				stack.pop();
//				
//				if(str.charAt(i-1) == '(') {
//					result += stack.size();
//				}else {
//					result++;
//				}
//			}
//		}
//		System.out.println(result);
//		
//	}
//	
//} // 스택 풀이법


public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String str2 = str.replace("()", ".");
		
		
		int count = 0;
		int answer = 0;
		
		for(int i=0; i<str2.length(); i++) {
			
			if(str2.charAt(i) == '(') {
				count++;
			}else if(str2.charAt(i) == ')') {
				count--;
				answer += 1;
			}else if(str2.charAt(i) == '.') {
				answer += count;
			}
			
		}
		System.out.println(answer);
		
	}

}












