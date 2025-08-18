package chep03;

import java.util.Scanner;

public class Question11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int a, b;
		int[] k = new int[T];
		
		for(int i=0; i<T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			k[i] = a + b;
		}
		
		for(int i=0; i<T; i++) {
			System.out.printf("Case #%d: %d\n", i+1, k[i]);
		}
		sc.close();
	}
}
