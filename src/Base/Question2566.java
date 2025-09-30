package chep07;

import java.util.Scanner;

public class Question2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = -1, row = 0, col = 0; // row, column
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int num = sc.nextInt();
				if(maxNum<num) {
					maxNum = num;
					row = i+1;
					col = j+1;
				}
			}
		}
		System.out.printf("%d\n%d %d", maxNum, row, col);
		sc.close();
	}
}
