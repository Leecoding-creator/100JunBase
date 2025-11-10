package chep10;

import java.util.Scanner;

public class Question1085 {
	public static int min(int x, int y) {
		return x<y?x:y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		
		int left = x;
		int right = w - x;
		int bottom = y;
		int top = h - y;
		
		int min = min(min(left, right), min(bottom, top));
		
		System.out.println(min);
	}
}
