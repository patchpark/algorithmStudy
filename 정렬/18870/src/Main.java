import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/18870


public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[num];
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		for(int i=0; i<num; i++) {
			if(!arr2.contains(arr[i])) {
				arr2.add(arr[i]);
			}
		}
		Collections.sort(arr2);

		for(int i : arr) {
			sb.append(arr2.indexOf(i)).append(" ");
		}
		
		System.out.println(sb);
		
		
	}
	
} // 시간 초과

// Hash Map 사용
/* 
 * import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> sortedlist = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        sortedlist.addAll(list);
        Collections.sort(sortedlist);

        int value = 0;
        for(int i=0; i<sortedlist.size(); i++){
            if(!map.containsKey(sortedlist.get(i))){
                map.put(sortedlist.get(i), value++);
            }
        }
        for(int i=0; i<arr.length; i++){
            if (map.containsKey(list.get(i))) {
                list.set(i, map.get(list.get(i)));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
 * 
 * */


