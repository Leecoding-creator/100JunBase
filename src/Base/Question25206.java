package chep06;

import java.util.Scanner;

public class Question25206 {

    static double scorecal(double grade, String str) {
        double score = 0;

        if(str.equals("A+")) {
            score = 4.5 * grade;
        } else if(str.equals("A0")) {
            score = 4.0 * grade;
        } else if(str.equals("B+")) {
            score = 3.5 * grade;
        } else if(str.equals("B0")) {
            score = 3.0 * grade;
        } else if(str.equals("C+")) {
            score = 2.5 * grade;
        } else if(str.equals("C0")) {
            score = 2.0 * grade;
        } else if(str.equals("D+")) {
            score = 1.5 * grade;
        } else if(str.equals("D0")) {
            score = 1.0 * grade;
        } else if(str.equals("F")) {
            score = 0;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double scoreSum = 0; // 점수 합계
        double gradeSum = 0; // 학점 합계

        for(int i = 0; i < 20; i++) {
            String subject = sc.next();  // 과목명
            double grade = sc.nextDouble();    // 학점
            String score = sc.next();    // 등급

            if(!score.equals("P")) { // "P"는 계산에서 제외
                gradeSum += grade;
                scoreSum += scorecal(grade, score);
            }
        }

        System.out.printf("%.6f\n", scoreSum / gradeSum);
        sc.close();
    }
}
