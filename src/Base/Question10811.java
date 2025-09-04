package chep04;

import java.util.Scanner;

public class Question10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[] box = new int[n+1], box2 = new int[n+1];
		int i, j;
		
		for(int bId=1; bId<=n; bId++) {
			box[bId] = bId;
		}
		
		for(int mi=0; mi<m; mi++) {
			i = sc.nextInt();
			j = sc.nextInt();
			
			box2 = box.clone();
			for(int a=0; a<=j-i; a++) {
				box2[i+a] = box[j-a];
			}
			box = box2.clone();
		}
		
		
		
		for(int a=1; a<=n; a++) {
			System.out.printf("%d ",box[a]);
		}
		
		sc.close();
		
	}
}
