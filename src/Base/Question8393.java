package chep03;

import java.util.Scanner;

public class Question8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		long result = 0;
		for(int i=1; i<=num; i++) {
			result += i;
		}
		System.out.println(result);
		
		sc.close();
	}
}
