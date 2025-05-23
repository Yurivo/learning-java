
import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите основание (число): ");
        double base = scanner.nextDouble();


        System.out.print("Введите степень (целое число): ");
        int exponent = scanner.nextInt();


        double result = power(base, exponent);
        System.out.printf("%.2f^%d = %.2f", base, exponent, result);

        scanner.close();
    }

    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

