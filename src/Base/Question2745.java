package chep08;

import java.util.Scanner;

public class Question2745 {
	public static int charToValue(char c) { // 문자 -> 숫자
		int num = 0;
		if(c>='0' && c<='9') {
			num = c - '0';
		}else {
			num = c - 'A' + 10;
		}
		return num;
	}
	
	public static int exponent(int e, int f) { // 지수 변환
		int num = 1;
		for(int i=0; i<e; i++) {
			num *= f;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		int formation = sc.nextInt();
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			int e = str.length()-1-i;
			result += charToValue(str.charAt(i))*exponent(e,formation);
		}
		
		System.out.println(result);
		sc.close();
	}
}
