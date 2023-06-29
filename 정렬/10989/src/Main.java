import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


//https://www.acmicpc.net/problem/10989

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // collection 사용시 list 객체 사용하므로 메모리 부족
		
		for(int i : arr) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
		
		
	}
	
}
