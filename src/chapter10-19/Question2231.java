package chep12;
import java.util.Scanner;

public class Question2231 {
	public static int SumOfDigits(int n) {
		int sum = n;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int result = 0;
		
		for(int i=1; i<n; i++) {
			if(SumOfDigits(i)==n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
