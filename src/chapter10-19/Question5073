package chep10;

import java.util.Scanner;

public class Question5073 {
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
        int[] side = new int[3];
        
        while(true) {
            for(int i=0; i<3; i++) { // 세 변 입력
                side[i] = sc.nextInt();
            }
            
            if(side[0]==0&&side[1]==0&&side[2]==0) { //종료
                break;
            }
            
            //세 변 정렬
            sortNum(side);
            
            if(side[0] + side[1] <= side[2]) { //삼각형 조건 X
                System.out.println("Invalid");
            }else { //삼각형일 때
                if(side[0]==side[1]&&side[1]==side[2]) { //세 변이 같은 경우 
                    System.out.println("Equilateral");
                }else if(side[0]!=side[1]&&side[1]!=side[2]&&side[2]!=side[0]) { //세 변이 모두 다른 경우
                    System.out.println("Scalene");
                }else {
                    System.out.println("Isosceles");
                }
            }
        }
        
        sc.close();
    }
}
