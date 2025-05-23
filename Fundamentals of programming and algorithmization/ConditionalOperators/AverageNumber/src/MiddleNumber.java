
import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = input.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = input.nextInt();

        int middle = (number1 + number2 + number3) - Math.min(Math.min(number1 , number2), number3) - Math.max(Math.max(number1 , number2), number3);
        System.out.println("Среднее число: " + middle);
        input.close();
    }
}
