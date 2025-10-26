package chep08;

import java.util.Scanner;

public class Question1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //사용자가 입력한 숫자
		sc.close();
		
		int fractionSum = 0; // 분모 분자 합
		int sum = 0; //다음 분자 분모의 합 현재보다 + 1
		
		for(int i=1; sum<num; i++) {
			sum += i;
			fractionSum = i + 1; //분모와 분자의 합 + 1
		}
		
		int start = sum - num + 1; //[라인의 n 번째] = 사용자 입력한 수 - (다음 분모분자 합 - 라인)
		
		if(fractionSum%2==0) { //분자 분모의 합이 짝수일 때마다 반대 방향
			System.out.printf("%d/%d", start, fractionSum-(start));
		}else {
			System.out.printf("%d/%d", fractionSum-(start), start);
		}
		
	}
}
