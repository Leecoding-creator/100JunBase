package chep07;

import java.util.Scanner;

public class Question2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] pro = new int[n][m]; //procession
		int[][] pro2 = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				pro[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				pro2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%d ", pro[i][j] + pro2[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
