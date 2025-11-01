package chep09;

import java.util.Scanner;

public class Question9506 {
	public static  void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			
			if(n == -1) { // 입력한 수 -1인 경우 프로그램 종료
				break;
			}
			
			int factorSum = 0; // 약수들의 합
			int lastFact = 0; // 마지막 약수 초기화
			
			for(int i=1; i<n; i++) { //약수들의 합
				if(n%i == 0) {
					factorSum += i;
					lastFact = i; //마지막 약수를 저장
				}
			}
			
			if(n == factorSum) { // 완전수인 경우
				System.out.printf("%d = ", n);
				for(int i=1; i<n; i++) {
					if(n%i == 0) {
						System.out.printf("%d", i);
						if(i!=lastFact) {
							System.out.printf(" + ");
						}
					}
				}
				
			}else { // 아닌 경우
				System.out.printf("%d is NOT perfect.", n);
			}
			System.out.println();
		}
		sc.close();
	}
}
