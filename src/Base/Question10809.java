package chep05;

import java.util.Scanner;

public class Question10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] index = new int[26];
		for(int i=0; i<index.length; i++) {
			index[i] = -1;
		}
		
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			if(index[(str.charAt(i)- 'a')] == -1) {
				index[(str.charAt(i)- 'a')] = i;
			}
		}
		
		for(int i=0; i<index.length; i++) {
			System.out.printf("%d ", index[i]);
		}
		sc.close();
	}

}
