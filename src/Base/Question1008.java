package Base;
import java.util.Scanner;

public class Question1008 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;

        while (true) {
            a = sc.nextDouble();
            b = sc.nextDouble();

            if (a > 0 && b < 10 && b != 0) {
                System.out.printf("%.10f\n", a / b);
                break;
            }
        }

        sc.close();
    }
}
