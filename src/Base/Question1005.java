package Base;

import java.util.Scanner;


/** 규칙 X, Y
 * W 값으로 가는 가장 빠른 길을 알기 위해 W 값에
 * Y 값이 동일한 부분에 X 값이 가진 딜레이가 가장 많은 순으로 더해서
 * 값을 저장.
*/
public class Question1005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		int[] bt = new int[T];
		for(int Test=0; Test<T; Test++) {
		
			int N = sc.nextInt(); // 건물 개수 N
			int K = sc.nextInt(); // 규칙 개수 K
		
			int[][] rule = new int[K][2]; // 규칙 X, Y 저장
			int[] buildTime = new int[N+1]; // 건물 당 걸리는 시간
		
			int[] bestTime = new int [N+1]; // 각 건물까지 도달하는 데 걸리는 최대 시간
		
			for(int i=1; i<=N; i++) { //N 건물 건설 시간 입력 |0번 인덱스 비워둠
				buildTime[i] = sc.nextInt();
				bestTime[i] = buildTime[i];
			}
		
			for(int i=0; i<K; i++) { //K 규칙 입력
				rule[i][0] = sc.nextInt();
				rule[i][1] = sc.nextInt();
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<K; j++) {
					int X = rule[j][0];
					int Y = rule[j][1];
					if(bestTime[Y] < bestTime[X] + buildTime[Y])
						bestTime[Y] = bestTime[X] + buildTime[Y];
				}
			}
			
			int W = sc.nextInt();
			
			bt[Test] = bestTime[W];
		}
		for(int i=0; i<T; i++) {
			System.out.println(bt[i]);
		}
		sc.close();
	}
}
