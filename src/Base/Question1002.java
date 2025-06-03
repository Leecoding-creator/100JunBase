package Base;

import java.util.Scanner;

public class Question1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = sc.nextInt();
		while(Test-- > 0) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			long dx = x1-x2;
			long dy = y1-y2;
			
			long rSum = r1 + r2;
			long rDif = Math.abs(r1-r2);
			long xy = dx*dx + dy*dy;
			
			if(x1==x2 && y1==y2 && r1==r2) {
				System.out.println(-1);
			}else if(x1==x2 && y1==y2 && r1 != r2) {
				System.out.println(0);
			}else if(xy > rSum*rSum) {
				System.out.println(0);
			}else if(xy < rDif*rDif) {
				System.out.println(0);
			}else if(xy == rSum*rSum || xy == rDif*rDif) {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
		}
		sc.close();
	}
}