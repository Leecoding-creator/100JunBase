package chep05;

import java.util.Scanner;

public class Question10809 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        String str = sc.next();
        
        for(int i=0; i<n; i++) {
            sum += str.charAt(i) - '0'; // ex) '3' - '0' -> 51 - 48
        }
        
        System.out.println(sum);
        sc.close();
    }
}
