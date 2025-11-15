package chep10;

import java.util.Scanner;

class Question10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        sc.close();
        
        if(angle1+angle2+angle3!=180) {
            System.out.println("Error");
        }else { // 세 각의 합 180인 경우
            if(angle1 == 60 && angle2 == 60) { //정삼각형
                System.out.println("Equilateral");
            } else if(angle1!=angle2&&angle2!=angle3&&angle3!=angle1) { //세 각이 다른 경우우
                System.out.println("Scalene");
            } else { //두 각이 같은 경우
                System.out.println("Isosceles");
            }
        }
    }
}