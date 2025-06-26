package Base;

import java.util.Scanner;

public class Question18108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y;
		while(true) {
			y = sc.nextInt();
			if(1000 <= y && y <= 3000)
				break;
		}
		
		System.out.println(y-543);
		
		sc.close();
	}
}
