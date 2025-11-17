package chep10;

import java.util.Scanner;

public class Question14215 {
	public static int[] sortNum(int[] num) { //버블 정렬
        int temp;
        boolean swapped; //교환 여부 체크하는 변수 
        for(int i=0; i<num.length-1; i++) { 
            swapped = false;
            for(int j=0; j<num.length-1-i; j++) {
                if(num[j]>num[j+1]) {
                    temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                    swapped = true; //교환이 일어남
                }
            }
            
            if(!swapped) { //배열이 정렬 된 경우
                break;
            }
        }
        return num;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		//정렬
		sortNum(num);
		
		if(num[0]+num[1]<=num[2]) { //삼각형의 조건이 아닌 경우
			//가장 긴 막대의 최대 거리
			int numMax = num[0]+num[1]-1;
			System.out.println(num[0]+num[1]+numMax);
		}else { // 삼각형 조건을 충족 한 경우
			System.out.println(num[0]+num[1]+num[2]);
		}
		
		sc.close();
	}
}
