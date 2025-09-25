package chep06;

import java.util.Scanner;

public class Question2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char al, nextAl; //현재 alphabet, next alphabet
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			al = str.charAt(i);
			
			if(al == 'd' && i + 2 < str.length()
			&& str.charAt(i+1) == 'z' && str.charAt(i+2) == '=') { //dz= 우선으로 처리
				i += 2;	
			}else if(i + 1 < str.length()) { // 나머지 처리
				nextAl = str.charAt(i+1);
				if(al == 'c' && (nextAl =='-' || nextAl =='=') ||
				(al == 'd' && nextAl == '-') ||
				(al == 'l' && nextAl == 'j') ||
				(al == 'n' && nextAl == 'j') ||
				(al == 's' && nextAl == '=') ||
				(al == 'z' && nextAl == '=')) {
					i++;
				}
			}
			
			count++;
		}
			
		System.out.println(count);
		sc.close();
	}
}
