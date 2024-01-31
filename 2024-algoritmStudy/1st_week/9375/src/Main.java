import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			HashMap<String, Integer> clothes = new HashMap<>();

			int n = sc.nextInt();

			for (int j = 0; j < n; j++) {

				String clothesName = sc.next();
				String clothesType = sc.next();

				if (clothes.containsKey(clothesType)) {
					clothes.put(clothesType, clothes.get(clothesType) + 1);
				} else {
					clothes.put(clothesType, 1);
				}
			}
			
			int total = 1;
			for(int value:clothes.values()) {
				total = total * (value+1);
			}
			System.out.println(total-1);
		}

	}

}
