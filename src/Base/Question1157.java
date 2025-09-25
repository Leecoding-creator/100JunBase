package chep06;

import java.util.Scanner;

public class Question1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase(); //입력 받은 값을 대문자로 변환
		int[] al = new int[26];
		int maxNum = 0, alNum = -1; //알파벳 나온 횟수, 알파벳 넘버
		boolean same = false; //같은 레벨이 있다.
		
		for(int i=0; i<al.length; i++) {
			al[i] = 0;
		}
		for(int i=0; i<str.length(); i++) {
			al[str.charAt(i)-'A']++;
			if(maxNum < al[str.charAt(i)-'A']) {
				alNum = str.charAt(i)-'A';
				maxNum = al[str.charAt(i)-'A'];
			}
		}

		for(int i=0; i<al.length; i++) {
			if(alNum != i && maxNum == al[i]) {
				same = true;
			}else {
				
			}
		}
		
		System.out.print(same ? "?": (char)(alNum+'A'));
		sc.close();
	}
}
