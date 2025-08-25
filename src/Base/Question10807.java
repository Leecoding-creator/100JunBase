package chep04;
import java.util.Scanner;

public class Question10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		
		for(int i=0; i<b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		int c = sc.nextInt();
		int count = 0;
		for(int i=0; i<b.length; i++) {
			if(c == b[i])
				count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
