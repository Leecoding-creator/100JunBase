package chep09;

import java.util.Scanner;

public class Question5086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b==0) {
				break;
			}
			
			if(a<b && b%a==0) {
				str += "factor ";
			}else if(a>b && a%b==0) {
				str += "multiple ";
			}else {
				str += "neither ";
			}
			
		}
		sc.close();
		
		// str 을 strMember 배열로 분배해서 저장.
		
		int count = 1;
		for(int i=0; i<str.length(); i++) {
			if(' ' == str.charAt(i)) {
				count++;
			}
		}
		
		String[] strMember = new String[count];
		for(int i=0; i<count; i++) {
			strMember[i] = "";
		}
		
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
		        strMember[index] += str.charAt(i);
			} else if (str.charAt(i) == ' ' && strMember[index].length() > 0) { //빈 인덱스 예외 처리
		        index++;
		    }
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(strMember[i]);
		}
	}
}
