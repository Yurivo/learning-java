
import java.util.Scanner;

public class MathRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число с плавающей запятой: ");
        double num1 = sc.nextDouble();
        System.out.println("Введите второе число с плавающей запятой: ");
        double num2 = sc.nextDouble();

        double roundedNum1 = Math.round(num1  * 100) / 100.0;
        double roundedNum2 = Math.round(num2  * 100) / 100.0;
        boolean result = roundedNum1 == roundedNum2;

        System.out.println("Введеные числа: " + num1 + " и " + num2 + " совпадают до 3 знака после запятой: " + result);

        sc.close();

    }
}
