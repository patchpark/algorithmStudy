import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	static int n, m, min;
	static int[][] map;
	static ArrayList<Coor> house;
	static ArrayList<Coor> chicken;
	static boolean[] check;
	
	static class Coor{
		int x, y;
		
		public Coor(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		house = new ArrayList<>();
		chicken = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j] == 1)
					house.add(new Coor(i, j));
				else if(map[i][j] == 2)
					chicken.add(new Coor(i,j));
			}
		}
		
		min = Integer.MAX_VALUE;
		check = new boolean[chicken.size()];
		
		fun(0,0);
		System.out.println(min);
	}
	
	public static void fun(int num, int index) {
		if(num == m) { // m개의 치킨집일 경우
			int total = 0;
			for(int i=0; i<house.size(); i++) {
				int sum = Integer.MAX_VALUE;
				for(int j=0; j<chicken.size(); j++) {
					if(check[j]) {
						int distance = Math.abs(house.get(i).x - chicken.get(j).x) + Math.abs(house.get(i).y - chicken.get(j).y);
						sum = Math.min(sum, distance);
					}
				}
				total += sum;
			}
			min = Math.min(total, min);
			return;
		}
		
		for(int i=index; i<chicken.size(); i++) {
				check[i] = true;
				fun(num+1, i+1);
				check[i] = false;
		}
		
		
	}
}













