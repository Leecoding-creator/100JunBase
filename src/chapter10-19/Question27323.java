package chep10;
import java.util.Scanner;

public class Question27323 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt(); // 너비
		int height = sc.nextInt(); // 높이
		sc.close();
		
		System.out.println(width*height);
	}
}
