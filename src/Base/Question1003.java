/*package Base;

import java.util.Scanner;

public class Question1003 {
	static int fibonacci(int n) {
		if(n < 0) { // -1 예외 처리
			return 1;
		}else if (n == 0) {
	        return 0;
	    } else if (n == 1) {
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = sc.nextInt(); 
		int num[] = new int[Test];
		
		for(int i=0; i<Test; i++) { //입력
			num[i] = sc.nextInt();
		}
		for(int i=0; i<Test; i++) { //출력
			System.out.printf("%d %d\n", fibonacci(num[i]-1), fibonacci(num[i]));
		}
		sc.close();
	}
}
*/ //위 코드는 실행 시간 초과 시간 복잡도 O(n^2) -> O(n)

package Base;

import java.util.Scanner;

public class Question1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = sc.nextInt();
		int[] num = new int[Test];
		int max = 0;
		
		for(int i=0; i<Test; i++) { //입력 받은 수에 가장 큰 값
			num[i] = sc.nextInt();
			if(max < num[i])
				max = num[i];
		}
		
		int[] dp = new int[max+2]; //가장 큰 값으로 배열 생성 예외 방지 + 2
		//0과 1의 출력 횟수 n-1, n
		dp[0] = 0; dp[1] = 1; //0, 1, 0+1, 1+(0+1), 0+1+(1+(0+1)), ...
		
		for(int i=2; i <= max; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		for(int i=0; i<Test; i++) {
			if(num[i]==0)
				System.out.println("1 0");
			else
				System.out.printf("%d %d\n",dp[num[i]-1], dp[num[i]]);
		}
		sc.close();
	}
}
