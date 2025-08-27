package chep04;
import java.util.Scanner;

public class Question10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = sc.nextInt();
		int[] number = new int[num];
		
		for(int i=0; i<num; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			if(number[i]<a) {
				System.out.print(number[i]);
				System.out.print(" ");
			}
		}
		
		sc.close();
	}
}
