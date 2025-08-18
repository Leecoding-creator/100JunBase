package chep03;

import java.util.Scanner;

public class Question11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] a = new int[T], b = new int[T];
		int[] k = new int[T];
		
		for(int i=0; i<T; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			k[i] = a[i] + b[i];
		}
		
		for(int i=0; i<T; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a[i], b[i], k[i]);
		}
		sc.close();
	}
}
