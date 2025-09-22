package chep06;

import java.util.Scanner;

public class Question2444 {
	static void space(int n) {
		for(int i=0; i<n; i++)
			System.out.print(" ");
	}
	static void star(int n) {
		for(int i=0; i<n; i++)
			System.out.print("*");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), k;
		for(int i=1; i<num*2; i++) { //i는 줄
			space(k = Math.abs((num-i)));
			star(2*num-2*k-1);
			System.out.println();
		}
		
		sc.close();
	}
}
