package chep06;

import java.util.Scanner;

public class Question10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next(), str2 = "";
		for(int i=str1.length()-1; i>=0; i--) {
			str2 += str1.charAt(i);
		}
		System.out.println(str1.equals(str2)==true?"1":"0");
		
		sc.close();
	}
}
