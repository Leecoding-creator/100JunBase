package chep05;

import java.util.Scanner;

public class Question2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next(), num2 = sc.next();
		String str1 = "", str2 = "";
		for(int i=num1.length()-1; i>=0; i--) {
			str1 += num1.charAt(i);
			str2 += num2.charAt(i);
		}
		int n1, n2;
		if((n1= Integer.parseInt(str1)) > (n2 = Integer.parseInt(str2))) {
			System.out.println(str1);
		} else if (n1 == n2) {
			System.out.println(str1);
		} else {
			System.out.println(str2);
		}
		sc.close();
	}
}
