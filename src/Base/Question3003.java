package chep06;

import java.util.Scanner;

public class Question3003 {
	static void need(byte pie, byte player) {
		System.out.printf("%d ",pie - player);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final byte king = 1, queen = 1, rook = 2
				, bishop = 2, night = 2, pawn = 8;
		byte pk = sc.nextByte(), pq = sc.nextByte(), pr = sc.nextByte()
			, pb = sc.nextByte(), pn = sc.nextByte(), pp = sc.nextByte();
		
		need(king, pk);
		need(queen, pq);
		need(rook, pr);
		need(bishop, pb);
		need(night, pn);
		need(pawn, pp);
		
		sc.close();
	}
}
