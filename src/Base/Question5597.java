package chep04;
import java.util.Scanner;

public class Question5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] th = new boolean[30];
		int a;
		//boolean 초기화 필요
		for(int i=0; i<28; i++) {
			a = sc.nextInt();
			th[a-1] = true;
		}
		
		for(int i=0; i<30; i++) {
			if(th[i]==false) {
				System.out.println(i+1);
			}
		}
		
		sc.close();
	}
}
