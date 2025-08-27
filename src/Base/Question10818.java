package chep04;
import java.util.Scanner;

public class Question10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int max, min;
		int[] number = new int[num];
		
		for(int i=0; i<num; i++) {
			number[i] = sc.nextInt();
		}
		max = number[0];
		min = number[0];
		
		for(int i=0; i<num; i++) {
			if(max < number[i])
				max = number[i];
			if(min > number[i])
				min = number[i];
		}
		
		System.out.printf("%d %d", min, max);
		
		sc.close();
	}
}
