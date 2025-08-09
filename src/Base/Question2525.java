package chep02;
import java.util.Scanner;

public class Question2525 {
	public static void main(String[] args) {
		int h, m, t;
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		
		h += (m + t)/60;
		h %= 24;
		m = (m + t)%60;
		System.out.printf("%d %d", h, m);
		
		sc.close();
	}
}
