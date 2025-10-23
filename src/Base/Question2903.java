package chep08;

import java.util.Scanner;

public class Question2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inDot;
		int dot = 2;
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			inDot = dot -1;
			dot += inDot;
		}
		System.out.println(dot*dot);
		sc.close();
	}
}
