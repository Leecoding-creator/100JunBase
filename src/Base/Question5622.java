package chep05;
import java.util.Scanner;

public class Question5622 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int count = 0, num; // a = 0 z = 25
        for(int i=0; i<str.length(); i++) {
            if((num = (str.charAt(i) - 'A')) >= 0 && num <= 2) { // 0 1 2 / n 2
                count += 3;
            } else if(num <6) {// 3 4 5 / n3
                count += 4;
            } else if(num <9) { // 6 7 8 / n4
                count += 5;
            } else if(num <12) { // 9 10 11 / n5
                count += 6;
            } else if(num <15) { // 12 13 14 / n6
                count += 7;
            } else if(num <19) { // 15 16 17 18 / n7
                count += 8;
            } else if(num <22) { // 19 20 21 / n8
                count += 9;
            } else { // 22 23 24 25 / n9
                count += 10;
            }
            
        }
        System.out.println(count);
        sc.close();
    }    
}
