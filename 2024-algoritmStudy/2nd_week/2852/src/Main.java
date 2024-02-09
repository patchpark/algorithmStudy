import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int lastTime = 0;

		int a = 0;
		int b = 0;
		int aTime = 0;
		int bTime = 0;

		for (int i = 0; i < n; i++) {

			int team = sc.nextInt();
			String time = sc.next();
			
			
			if (team == 1) {
				a++;
				if(a == b) {
					bTime += Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5)) - lastTime;
					lastTime = Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5));
				}else if(a-b == 1){
					lastTime = Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5));
				}
			} else {
				b++;
				if(a == b) {
					aTime += Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5)) - lastTime;
					lastTime = Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5));
				}else if(b-a == 1){
					lastTime = Integer.valueOf(time.substring(0, 2)) * 60 + Integer.valueOf(time.substring(3, 5));
				}
			}
		}
	
		if(a > b)
			aTime += 2880 - lastTime;
		if(a < b)
			bTime += 2880 - lastTime;

		System.out.printf("%02d:%02d\n", aTime/60, aTime%60);
		System.out.printf("%02d:%02d", bTime/60, bTime%60);
	}

}
