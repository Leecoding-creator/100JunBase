package chep08;

import java.util.Scanner;

public class Question2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), v = sc.nextInt();
		sc.close();
		
		int lastDay = v - a; //달성 하루 전 길이
		int oneDay = a - b; //하루동안 가는 길이
		
		int day = lastDay / oneDay;
		if(lastDay % oneDay != 0) { // 나누어 떨어지지 않으면 + 1
			day++;
		}
		
		System.out.println(day+1); //+ 마지막 날
	}
}
