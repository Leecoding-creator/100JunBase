package chep08;

import java.util.Scanner;

public class Question2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int QUEARTER = 25, DIME = 10, NICKEL = 5, PENNY = 1;
		int[] quNum, diNum, niNum, peNum;
		
		int T = sc.nextInt();
		
		quNum = new int[T];
		diNum = new int[T];
		niNum = new int[T];
		peNum = new int[T];
		
		for(int i=0; i<T; i++) {
			int money = sc.nextInt();
			quNum[i] = money / QUEARTER;
			money %= QUEARTER;
			diNum[i] = money / DIME;
			money %= DIME;
			niNum[i] = money / NICKEL;
			money %= NICKEL;
			peNum[i] = money / PENNY; //1이기 때문에 peNum = PENNY도 가능
		}
		
		for(int i=0; i<T; i++) {
			System.out.printf("%d %d %d %d\n",quNum[i], diNum[i], niNum[i], peNum[i]);
		}
		sc.close();
	}
}
