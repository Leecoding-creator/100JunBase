package chep09;

import java.util.Scanner;

public class Question2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(); // 자연수
		int q = sc.nextInt(); // k 번째
		sc.close();
		
		int count = 0;
		
		for(int i=1; i<=p; i++) {
			if(p % i == 0) {
				count++;
			}
			
			if(count == q) {
				System.out.println(i);
				return; // 프로그램 종료
			}
		}
		System.out.println(0);
	}
}
