package RightAnswer;

import java.util.Scanner;

public class Answer1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스 수
        int[] nums = new int[T]; //테스트 케이스 배열
        int max = 0; //테스트 케이스 배열 중 가장 큰 수

        // 입력 및 최댓값 계산
        for (int i = 0; i < T; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // 0과 1이 호출되는 횟수를 저장
        int[][] dp = new int[max + 2][2]; // [n][0]: 0의 호출 수, [n][1]: 1의 호출 수

        // 초기값 설정
        dp[0][0] = 1; // fibonacci(0)은 0을 1번 호출
        dp[0][1] = 0;

        dp[1][0] = 0;
        dp[1][1] = 1; // fibonacci(1)은 1을 1번 호출

        // 동적 프로그래밍으로 모든 경우의 수 미리 계산
        for (int i = 2; i <= max; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        // 출력
        for (int i = 0; i < T; i++) {
            System.out.printf("%d %d\n", dp[nums[i]][0], dp[nums[i]][1]);
        }

        sc.close();
    }
}
