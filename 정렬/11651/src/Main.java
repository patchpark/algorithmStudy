import java.io.*;
import java.util.*;
import java.util.Comparator;

// https://www.acmicpc.net/submit/11651

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Integer arr[][] = new Integer[N][2];

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<Integer[]>() { // 정렬 방식 재정의
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[1].equals(o2[1])) { // 같으면 x비교
					return o1[0] - o2[0];
				}
				else {					  // 다르면 y비교
					return o1[1] - o2[1];
				}
			}
		});	

		for(int i=0; i<N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}

		System.out.println(sb);
	}
}