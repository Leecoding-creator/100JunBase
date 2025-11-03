package chep09;

import java.util.Scanner;

public class Question1978 {
	public static boolean primeNum(int num) {
		if (num < 2) return false;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false; // 나누어 떨어지면 소수가 아님
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n-->0) {
			int num = sc.nextInt();
			if(primeNum(num)) {
				count++;
			}
		}
		sc.close();
		
		System.out.println(count);
	}
}
