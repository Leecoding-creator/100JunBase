package chep04;

import java.util.Scanner;

public class Question10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[] box = new int[n+1];
		int i, j;
		
		for(int a=1; a<n+1; a++) {
			box[a] = a;
		}
		
		for(int a=0; a<m; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			
			box[0] = box[i];
			box[i] = box[j];
			box[j] = box[0];
		}
		
		for(int a=1; a<n+1; a++) {
			System.out.printf("%d ", box[a]);
		}
		
		sc.close();
	}
}
