package chep04;

import java.util.Scanner;

public class Question2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[9];
		int max = 0;
		
		for(int i=0; i<9; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			if(max<number[i])
				max = number[i];
		}
		
		System.out.println(max);
		for(int i=0; i<9; i++) {
			if(max==number[i])
				System.out.println(i+1);
		}
		
		sc.close();
	}
}
