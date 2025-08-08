package chep02;

import java.util.Scanner;

public class Question2884 {
	public static void main(String[] args) {
		byte h, m;
		Scanner sc = new Scanner(System.in);
		
		h = sc.nextByte();
		m = sc.nextByte();
		
		if(m>=45)
			m-=45;
		else if(h!=0){
			h--; m+=15;
		}else {
			h=23; m+=15;
		}
			
		System.out.printf("%d %d", h, m);
		
		sc.close();
	}
}
