package chep05;

import java.util.Scanner;

public class Question9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] str = new String[T];
		for(int i=0; i<T; i++) {
			str[i] = sc.next();
		}
		for(int i=0; i<T; i++) {
			System.out.printf("%c%c\n",str[i].charAt(0), str[i].charAt(str[i].length()-1));
		}
		sc.close();
	}
}
