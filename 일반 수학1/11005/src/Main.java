import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11005
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, jinbub;
		
		num = sc.nextInt();
		jinbub = sc.nextInt();
		
		int i = 0;
				
		while(num >= Math.pow(jinbub, i)) {
			i++;
		}
		i--;
		
		int[] arr = new int[i+1];
		
		for(int j=0; j<arr.length; j++) {
			arr[j] = (int)(num / Math.pow(jinbub, i));
			num = (int)(num % Math.pow(jinbub, i));
			i--;
		}

		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>=10) {
				System.out.print((char)(arr[j]+55));
			}else {
				System.out.print(arr[j]);
			}
		}
	}
	
}
