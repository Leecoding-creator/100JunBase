package chep07;

import java.util.Scanner;

public class Question10789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] c = new char[5][15];
		for(int i=0; i<5; i++) {
			String str = sc.next();
			for(int j=0; j<str.length(); j++) { //입력 받을 때 줄의 길이만큼 입력 받음
				c[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(c[j][i] != '\0') { // 값이 존재할 경우
					System.out.print(c[j][i]);
				}
			}
		}
		sc.close();
	}
}
