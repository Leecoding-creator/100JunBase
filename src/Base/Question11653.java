package chep09;

import java.util.Scanner;

public class Question11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int primeFact = 2; //소인수
		while(n!=1) { // 입력한 수가 더이상 안 나눠질 때까지
			if(n%primeFact==0) { // 나눠지는 소인수가 있는 경우
				n/=primeFact;
				System.out.println(primeFact);
			}else {
				primeFact += 1;
			}
		}
	}
}
