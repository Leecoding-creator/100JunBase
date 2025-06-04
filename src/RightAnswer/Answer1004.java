package RightAnswer;

import java.util.Scanner;

//원을 표현하는 클래스
class Circle {
	int x, y, r; // 원의 중심 좌표 (x, y)와 반지름 r

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
}

public class Answer1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수 입력
		int testCaseCount = sc.nextInt();

		// 각 테스트 케이스별로 출발점과 도착점이 원 경계를 몇 번 넘는지 저장할 배열
		int[] crossCounts = new int[testCaseCount];

		// 각 테스트 케이스 반복
		for (int test = 0; test < testCaseCount; test++) {
			// 출발점(x1, y1)과 도착점(x2, y2) 입력
			int x1 = sc.nextInt(), y1 = sc.nextInt();
			int x2 = sc.nextInt(), y2 = sc.nextInt();

			// 포함된 원의 개수 입력
			int circleNum = sc.nextInt();

			// 각 원에 대해 반복
			for (int i = 0; i < circleNum; i++) {
				// 원의 중심 좌표와 반지름 입력
				int cx = sc.nextInt(), cy = sc.nextInt(), cr = sc.nextInt();

				// 반지름의 제곱 (거리 제곱 비교를 위해 사용)
				int r2 = cr * cr;

				// 출발점과 원의 중심 간 거리의 제곱 함수
				int dist1 = getSquaredDistance(cx, cy, x1, y1);
				// 도착점 ''
				int dist2 = getSquaredDistance(cx, cy, x2, y2);

				// 출발점과 도착점 중 하나는 원 안에 있고, 다른 하나는 원 밖에 있을 경우
				boolean startInside = dist1 < r2; //출발점이 원 안에 있는 경우
				boolean endInside = dist2 < r2; //도착점이 원 안에 있는 경우

				// 한 점만 원 안에 있을 때만 카운트 증가 (즉, 원의 경계를 통과)
				if (startInside != endInside) { //둘 중 하나만 안에 있는 경우
					crossCounts[test]++;
				}
			}
		}

		// 각 테스트 케이스별 결과 출력
		for (int cnt : crossCounts) { //for-each 구문
			System.out.println(cnt);
		}

		sc.close();
	}

	/**
	 * 두 점 (x1, y1)과 (x2, y2) 사이의 거리의 제곱을 계산하는 메서드
	 * √를 쓰지 않고 거리 비교를 가능하게 하기 위해 제곱으로 반환
	 */
	private static int getSquaredDistance(int x1, int y1, int x2, int y2) {
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
}
