import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();
			boolean check = true;

			if (str.equals(".")) {
				break;
			}

			Stack<Character> stack = new Stack<Character>();
			for (int i = 0; i < str.length(); i++) {

				char c = str.charAt(i);

				if (c == '(' || c == '[') {
					stack.push(c);
				}

				else if (c == ')') {
					if (stack.empty() || stack.peek() != '(') {
						check = false;
					} else {
						stack.pop();
					}
				}

				else if (c == ']') {
					if (stack.empty() || stack.peek() != '[') {
						check = false;
					} else {
						stack.pop();
					}
				}
			}

			if (!stack.empty())
				check = false;

			if (check == true)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}

}
