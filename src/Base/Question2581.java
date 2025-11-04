package chep09;

import java.util.Scanner;

public class Question2581 {
	public static boolean primeNum(int n) { //소수일 때, true
		if(n<2) {
			return false;
		}
		for(int i=2; i<n; i++) { // i -> i*i로 루트n까지만 검사해도 괜찮음
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(); //m 이상 n 이하 소수
		int sum = 0; //소수의 합
		int min = 0; //최소값
		sc.close();
		
		for(int i=m; i<=n; i++) {
			if(primeNum(i)) { //소수일 때
				if(min==0) { min = i; }
				sum += i;
			}
		}
		if(min!=0) {
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}
	}
}
