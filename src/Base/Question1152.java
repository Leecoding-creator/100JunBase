package chep05;

import java.util.Scanner;

public class Question1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim(); // 앞뒤 공백 제거
		
		if(str.isEmpty()) { // 비어있는 경우
			System.out.println(0);
			sc.close();
			return;
		}
		
		int count = 1;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				if(i>0 && str.charAt(i-1) != ' ') //연속 공백 경우
					count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}

}
