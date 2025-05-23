
import java.util.Scanner;

public class EndsWithCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        // Проверка условия
        boolean endsWithTripleExslamation = input.endsWith("!!!");

        System.out.println(endsWithTripleExslamation);

        scanner.close(); //Явное закрытие ресура
    }
}