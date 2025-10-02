package chep07;

import java.util.Scanner;

public class Question2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper = sc.nextInt();
		
		boolean[][] total = new boolean[101][101]; //(0,0)~(100, 100)
		
		// [개선 포인트 1] 불필요한 초기화
		// boolean 배열은 기본값이 false라서 이중 for문으로 초기화할 필요가 없음.
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				total[i][j] = false; //비어있음
			}
		}
		for(int i=0; i<paper; i++) {
			// [개선 포인트 2] 변수명 가독성
			// height, width 보다는 x, y 좌표로 이름을 짓는 것이 더 직관적임.
			int height = sc.nextInt();
			int width = sc.nextInt();
			
			for(int x=width+1; x<width+11; x++) {
				for(int y=height+1; y<height+11; y++) {
					total[x][y] = true; // 채워짐
				}
			}
		}
		
		int extent = 0;// 넓이
		// [개선 포인트 3] 좌표 보정(+1)
		// 배열을 [101][101]로 선언했으므로 (0,0)~(100,100)까지 다루기 위해 +1 보정을 둔 것.
		// 굳이 줄이지 않고 이렇게 두는 편이 좌표계를 이해하는 데 더 직관적임.
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(total[i][j]==true) { // 채워져 있다면
					extent += 1;
				}
			}
		}
		
		System.out.println(extent);
		sc.close();
	}
}
