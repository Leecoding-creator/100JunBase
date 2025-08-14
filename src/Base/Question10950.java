package chep03;

import java.util.Scanner;

public class Question10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] answer = new int[T];
		int a, b;
		for(int i=0; i<T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			answer[i] = a + b;
		}
		
		for(int i=0; i<T; i++) {
			System.out.println(answer[i]);
		}
		sc.close();
	}
}
