//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//// https://www.acmicpc.net/problem/17413
//
//public class Main {
//
//	public static void main(String[] args) throws IOException{
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String sentence = br.readLine();
//		String reverse = "";
//		int i = 0;
//		
//		while(reverse.length() != sentence.length()) {			
//			if(sentence.charAt(i) == '<') {
//				while(sentence.charAt(i) != '>') {
//					reverse = reverse + sentence.charAt(i);
//					i++;
//				}
//			}else if(sentence.charAt(i) == '>'){
//				reverse += '>';
//				i++;
//			}else if(sentence.charAt(i) == ' '){
//				reverse = reverse + sentence.charAt(i);
//				i++;
//				
//			}else{
//				String arr = ""; 
//				while(sentence.charAt(i) != ' ' && i<sentence.length()-1 && sentence.charAt(i) != '<') {
//					arr += sentence.charAt(i);
//					i++;					
//				}
//				StringBuffer sb = new StringBuffer(arr);
//				reverse += sb.reverse();
//				
//				
//			}
//			
//			
//		}
//		System.out.println(reverse);
//		
//		
//		
//		
//		
//	}
//	
//}	�ð��ʰ�


import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ���ڿ� S�Է�
        String str = br.readLine();

        // ��� ���� ����� StringBuilder
        StringBuilder sb = new StringBuilder();

        // ���� ������ ���� ������ �Ǻ��ϱ� ���� flag
        boolean flag = false;

        // ���Լ��� ����� �̿��ϱ� ���� �ڷᱸ�� Stack
        Stack < Character > stack = new Stack < > ();

        // ���ڿ� S�� ���̸�ŭ �ݺ��� ����
        for (int i = 0; i < str.length(); i++) {
            // ���� ������ ������ ���, stack�� ������� �ʴٸ� ��� ���Ҹ� ������ flag�� true
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                flag = true;
            }
            // ���� ������ ������ ���, flag�� false�� �Է� �� '>'����
            else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            // flag�� true�� ���, '>'�� ������ ������ �״�� �Է�
            if (flag == true) {
                sb.append(str.charAt(i));
            }
            // flag�� false�� ���, ��ȣ �̿��� ���ڸ� ó��
            else if (flag == false) {
                // �ش� �ε����� i��° ���ڰ� ������ ���, ��� ���Ҹ� POP���� �� ���� �߰�
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    // �׿��� ���, Stack�� ���� �߰�
                    stack.push(str.charAt(i));
                }
            }

            // �ݺ����� ������ Ƚ���� ��, ������ ������� �ʴٸ� ���� �߰�
            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        // ����� ���
        System.out.println(sb);
    }
}
