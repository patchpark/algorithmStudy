import java.util.Scanner;

// https://www.acmicpc.net/problem/1107

public class Main {    
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[] arr = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();
            arr[n] = true;
        }
        
        int result = Math.abs(num - 100); // + - 만 사용
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(arr[str.charAt(j) - '0']) { // 고장
                    isBreak = true; 
                    break; 
                }
            }
            if(!isBreak) { // 고장 x
                int min = Math.abs(num - i) + len; //i 클릭후 이동
                result = Math.min(min, result);
            }
        }        
        System.out.println(result);
    }
}