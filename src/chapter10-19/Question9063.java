package chep10;
import java.util.Scanner;

public class Question9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int xMax = 0, yMax = 0;
		int xMin = 0, yMin = 0;
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(i==0 ) { // 최대 최소 좌표 초기화
				xMin = x;
				yMin = y;
				xMax = x;
				yMax = y;
			}
			
			if(xMin>x) { 
				xMin = x;
			}else if(xMax<x) {
				xMax = x;
			}
			
			if(yMin>y) {
				yMin = y;
			}else if(yMax<y) {
				yMax = y;
			}
		}
		
		int area = (xMax - xMin) * (yMax - yMin); // 직사각형 넓이
		System.out.println(area);
	}
}
