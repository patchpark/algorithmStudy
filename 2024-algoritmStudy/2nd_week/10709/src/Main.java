import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] cloud = new int[H][W];
		
		for(int i=0; i<H; i++) {
			
			String str = sc.next();
			
			int temp = -1;
			
			boolean check = false;
			
			for(int j=0; j<W; j++) {
				
				
				char c = str.charAt(j);
				
				if(c == 'c') {
					check = true;
					cloud[i][j] = 0;
					temp = j;
				}else {
					if(check == true) {
						int t = j-temp;
						cloud[i][j] = t;
					}else {
						cloud[i][j] = -1;
					}
				}
				
			}
			check = false;
		}		
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				System.out.print(cloud[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
}
