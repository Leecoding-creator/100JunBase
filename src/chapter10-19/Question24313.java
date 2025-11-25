package chep11;

import java.util.Scanner;

public class Question24313 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fn = sc.nextInt();
		int f0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		sc.close();
		
		boolean result = true;
		
		for(int i=n0; i<100; i++) { //i>=n0
			int f = fn*i + f0;
			int cg = c*i;
			if (f > cg) {
				result = false;
	            break;
	        }
		}
		
		System.out.println(result?"1":"0");
	}
}
