package chep08;

import java.util.Scanner;

public class Question2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 1, result = 1;
		sc.close();
		
		while(max<num) { //입력한 숫자가 벌집의 max 값보다 작을 때까지
			result++;
			max += (result-1)*6; //max 1 7 19 37 61 | 6의 배수로 증가함.
		}
		
		System.out.println(result);
		
	}
}
