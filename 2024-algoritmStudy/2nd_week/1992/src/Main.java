import java.util.Scanner;

public class Main {

	static int[][] pic;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		pic = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String temp = sc.next();
			
			for(int j=0; j<n; j++) {
				pic[i][j] = temp.charAt(j)-'0';
			}
			
		}
		
		function(0, 0, n);
		System.out.println(sb);
		
	}
	
	public static void function(int x, int y, int size) {
		if(changeable(x,y,size)) {
			sb.append(pic[x][y]);
			return;
		}
		
		int newSize = size/2;
		
		sb.append('(');
		function(x, y, newSize);
		function(x, y + newSize, newSize);
		function(x + newSize, y, newSize);
		function(x + newSize, y + newSize, newSize);
		sb.append(')');
		
	}
	
	public static boolean changeable(int x, int y, int size) {
		
		int value = pic[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != pic[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
}

















