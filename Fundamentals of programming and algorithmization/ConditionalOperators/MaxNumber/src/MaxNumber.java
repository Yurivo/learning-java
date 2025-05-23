
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();

        int max = Math.max(number1, number2);
        System.out.println("Большее число: " + max);
        input.close();
    }
}
