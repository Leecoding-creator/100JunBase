package chep11;

import java.util.Scanner;

public class Question24267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		System.out.println((((n-1)*n*(2*n-1)/6) - ((n-1)*n/2))/2);
		System.out.println(3);
	}
}

/*
1
2(34567) 3(4567) 4(567) 5(67) 6(7) = 1+2+3+4+5 => (n-2)*(n-1)/2
2
3(4567) 4(567) 5(67) 6(7) = 1+2+3+4 => (n-3)*(n-2)/2
3
4(567) 5(67) 6(7) = 1+2+3 => (n-4)*(n-3)/2
4
5(67) 6(7) = 1+2 => (n-5)*(n-4)/2
5
6(7) = 1 => (n-6)*(n-5)/2

하키 스틱 항등식(Hockey-stick)

T(n) = C(n,3) = n! / 3!(n-3)! = n(n-1)(n-2)/6
=1*2/2 + 2*3/2 + ... + (n-2)*(n-1)/2
*/

