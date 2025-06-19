package Base;

import java.util.Scanner;

public class Question10869 {
	static void p(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a > 0 && b > 0 && a < 10000 && b < 10000) //b<10000
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
		p(a+b);
		p(a-b);
		p(a*b);
		p(a/b);
		p(a%b);
		
		sc.close();
		
	}
}
