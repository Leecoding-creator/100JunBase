package chep06;

import java.util.Scanner;

public class Question1316 {
	public static boolean GroupWord(String word) {
        boolean[] alphabet = new boolean[26]; // 알파벳 사용 여부
        char preAl = 0; // 이전 문자 저장

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            // 이전 문자와 다를 경우만 확인
            if (current != preAl) {
                if (alphabet[current - 'a']) {
                    // 이미 사용한 문자가 다시 나오면 그룹 단어가 아님
                    return false;
                }
                alphabet[current - 'a'] = true; // 현재 문자 사용 기록
            }

            preAl = current; // 이전 문자 갱신
        }
        return true;
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 단어 개수
        int count = 0; // 그룹 단어 카운트

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (GroupWord(word)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
