package chep04;

import java.util.Scanner;

public class Question3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numId, count = 0;
		boolean[] ft = new boolean[42];
		
		for(int i=0; i<10; i++) {
			numId = sc.nextInt()%42;
			//System.out.println(numId);
			ft[numId] = true;
		}
		
		for(int i=0; i<42; i++) {
			if(ft[i]==true) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
