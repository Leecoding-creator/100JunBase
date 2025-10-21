package chep08;

import java.util.Scanner;

public class Question11005 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt(); //10진수 입력
		int formation = sc.nextInt(); // 변환할 진법 입력;
		sc.close();
		
		String str = new String();
		
		while(base > 0) {
			int remainder = base % formation;
			if(remainder >= 10) { // 알파벳 A부터
				str += (char) ('A' + (remainder-10));
			}else {
				str += (char) ('0' + remainder); //아스키 코드이므로 0을 더함
			}
			base /= formation; //나눗셈 진행
				
		}
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
