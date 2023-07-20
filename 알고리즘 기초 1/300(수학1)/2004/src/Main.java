//import java.util.Scanner;
//
//// https://www.acmicpc.net/problem/2004
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int twoCount = 0;
//		int fiveCount = 0;
//		
//		// ���� ���
//		
//		for(int i=0; i<m; i++) {
//			int num = n-i;
//			
//			while(num%2 != 0) {
//				num = num/2;
//				twoCount++;
//			}
//			while(num%5 != 0) {
//				num = num/5;
//				fiveCount++;
//			}
//		}
//		
//		// �и� ���
//		for(int i=1; i<=m; i++) {
//			int num = i;
//			while(num%2 != 0) {
//				num = num/2;
//				twoCount--;
//			}
//			while(num%5 != 0) {
//				num = num/5;
//				fiveCount--;
//			}
//			
//		}
//		
//		if(twoCount<0 || fiveCount<0) {
//			System.out.println(0);
//		}else {
//			System.out.println(twoCount>fiveCount?fiveCount:twoCount);
//		}
//		
//		
//	}
//	
//} // �ð� �ʰ�

import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long N = in.nextLong();
		long M = in.nextLong();
		
		// ������ �¼��� �����ش�.
		long count5 = five_power_n(N) - five_power_n(N - M) - five_power_n(M);
		long count2 = two_power_n(N) - two_power_n(N - M) - two_power_n(M);
        
		System.out.println(Math.min(count5, count2));
		
	}
	
	// 5�� �¼��� ���ϴ� �Լ� 
	static long five_power_n(long num) {
		int count = 0;
		
		while(num >= 5) {
			count += (num / 5);
			num /= 5;
		}
		return count;
	}
	
	// 2�� �¼��� ���ϴ� �Լ�
	static long two_power_n(long num) {
		int count = 0;
		
		while(num >= 2) {
			count += (num / 2);
			num /= 2;
		}
		return count;
	}
 
}