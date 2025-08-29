package chep04;

import java.util.Scanner;

public class Question10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[] box = new int[n];
		
		for(int a=0; a<n; a++) {
			box[a] = 0;
		}
		
		int i, j, k;
		
		for(int a=0; a<m; a++) {
			i = sc.nextInt();
			//System.out.print(i);
			j = sc.nextInt();
			//System.out.print(j);
			k = sc.nextInt();
			//System.out.print(k);
			for(int b=i; b<=j; b++) {
				//System.out.printf("  [%d]%d  ", b, k); 
				box[b-1] = k;
			}
		}
		
		for(int a=0; a<n; a++) {
			System.out.printf("%d ",box[a]);
		}
		sc.close();
	}
}
