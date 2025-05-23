
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для проверки на четность :");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " - четное");
        }
        else {
        System.out.println(number + " - нечетное");
        }


    }
}
