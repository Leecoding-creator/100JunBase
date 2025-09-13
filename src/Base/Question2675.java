package chep05;

import java.util.Scanner;

public class Question2675{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] str = new String[T];
		int[] num = new int[T];
		
		for(int t=0; t<T; t++) {
			num[t] = sc.nextInt();
			str[t] = sc.next();
		}
		
		for(int t=0; t<T; t++) {
			for(int i=0; i<str[t].length(); i++) {
				for(int j=0; j<num[t]; j++) {
					System.out.printf("%c", str[t].charAt(i));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}