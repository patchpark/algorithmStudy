import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int precedence(char c){
        if (c=='(') return 0;
        if (c=='+' || c=='-') return 1;
        else return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>='A' && c<='Z'){
                System.out.print(c);
            } else if (c==')'){
                while (!stack.isEmpty()){
                    char tmp = stack.pop();
                    if (tmp=='(') break;
                    System.out.print(tmp);
                }
            } else if (c=='('){
                stack.push(c);
            } else {
                while (!stack.isEmpty() && precedence(stack.peek())>=precedence(c)){
                    System.out.print(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}