package chep04;

import java.util.Scanner;

public class Question1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = 0;
		double sum = 0;
		int[] score = new int[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			if(m<score[i]) {
				m = score[i];
			}
			sum += score[i];
		}
		
		System.out.printf("%f", sum/m*100/n);
		
		sc.close();
	}
}
