
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();

        // нахождение минимального числа
        int min = Math.min(number1, number2);

        System.out.print("Минимальное число: " + min);

        input.close();
    }
}
