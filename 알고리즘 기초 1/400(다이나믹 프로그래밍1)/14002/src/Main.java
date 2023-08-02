import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/14002
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];  
        int[] dp = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
        	arr[i] = sc.nextInt();
        	dp[i] = 1;  
        }
        int max = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j]+1);
                
            }
            max = Math.max(max, dp[i]);  
        }
        System.out.println(max);
		
        int value = max;
        Stack<Integer> stack = new Stack<>();

        for (int i = n; i >= 1; i--) {
            if (value == dp[i]) {
                stack.push(arr[i]);
                value--;
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }

	}

}
