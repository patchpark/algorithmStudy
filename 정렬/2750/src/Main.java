import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2750


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<num; i++) {
			set.add(sc.nextInt());
		}
		
		Iterator<Integer> iter = set.iterator();
		
		Integer[] arr = set.toArray(new Integer[0]);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
