package Base;

import java.util.Scanner;

class Circle {
	int x, y, r;
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
}

public class Question1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		int[] count = new int[Test]; //Test 번째에 몇 번을 지나가야 하는 지
		
		int x1, y1, x2, y2, cx, cy, cr; //-1000 ≤ x1, y1, x2, y2, cx, cy ≤ 1000
		int circleNum; //circle 개수
		
		int line1, line2, linecr; //출발지와 도착지와 원의 거리, 반지름 제곱
		
		for(int i=0; i<Test; i++)
			count[i] = 0; //초기화
		
		//Test 횟수 만큼 반복
		for(int test=0; test<Test; test++) {
			//출발지와 도착지 입력
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			//원의 개수
			circleNum = sc.nextInt();
			
			Circle[] circle = new Circle[circleNum]; //원의 개수 만큼 Circle 객체 배열 생성
			
			for(int i=0; i<circleNum; i++) {
				
				cx = sc.nextInt();
				cy = sc.nextInt();
				cr = sc.nextInt();
				
				circle[i] = new Circle(cx, cy, cr); // 배열 각자 내부 객체 생성
				
				//거리별 연산 과정
				line1 = (circle[i].x - x1)*(circle[i].x - x1) + (circle[i].y - y1)*(circle[i].y - y1);
				line2 = (circle[i].x - x2)*(circle[i].x - x2) + (circle[i].y - y2)*(circle[i].y - y2);
				linecr = circle[i].r*circle[i].r;
				
				if(linecr > line1 && linecr < line2 || linecr < line1 && linecr > line2)
					count[test]++; //test 번째 지나는 횟수
				//이후 예외 처리는 필요 없을 것으로 예상
			}
		}
		
		//출력
		for(int i=0; i<Test; i++) {
			System.out.println(count[i]);
		}
		
		sc.close();
	}
}
