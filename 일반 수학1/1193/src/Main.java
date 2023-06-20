import java.util.Scanner;

// https://www.acmicpc.net/problem/1193

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int add = 0;
		int i = 0;
		
		while(num > add) {
			add += i;
			i++;
		}
		
		int d = num - add + i - 1;
		
		if(i%2==0) {
			System.out.println((i-d)+"/"+ d);
		}else {
			System.out.println(d +"/"+(i-d));
		}
		
	}
	
	
	
}
