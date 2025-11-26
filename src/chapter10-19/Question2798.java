package chep12;

import java.util.Scanner;

public class Question2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드의 개수
		int m = sc.nextInt(); // 숫자
		
		int sum, closeSum = 0; // 합과 가장 가까운 값
		
		int[] cardNum = new int[n];
		
		for(int i=0; i<n; i++) {
			cardNum[i] = sc.nextInt();
		}
		
		target : // target 레이블
		for(int c1=0; c1<n-2; c1++) {
            for(int c2=c1+1; c2<n-1; c2++) {
                for(int c3=c2+1; c3<n; c3++) {
                    sum = cardNum[c1] + cardNum[c2] + cardNum[c3];

                    if (sum <= m && sum > closeSum) {
                        closeSum = sum;
                        
                        // M을 정확히 찾았다면 더 이상 탐색할 필요 없이 종료
                        if (closeSum == m) {
                            break target; // target 레이블로 지정된 루프(가장 바깥쪽 루프)를 탈출
                        }
                    }
                }
            }
        }
		sc.close();
		
		System.out.println(closeSum);
	}
}
