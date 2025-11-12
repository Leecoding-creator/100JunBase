package chep10;

import java.util.Scanner;
import java.math.BigInteger;

public class Question15894 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger num = sc.nextBigInteger();
		
		System.out.println(num.multiply(BigInteger.valueOf(4)));
		sc.close();
	}
}
