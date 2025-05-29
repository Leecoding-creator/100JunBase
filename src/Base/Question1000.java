package Base;

import java.util.Scanner;

public class Question1000 { //upload (class name) -> Main
	
	static int sum(int num1, int num2) { 
		return num1 + num2;
	} // end sum()
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b; //0 < a, b < 10
		
		do {
			a = sc.nextInt();
			b = sc.nextInt();
		}while(!(0<a) || !(b<10));
		
		System.out.print(sum(a, b));
		
		sc.close();
	}
}

/*
 * memory : 17680 KB
 * code Length : 379 B
 */