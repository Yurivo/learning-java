
import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Проверка, начинается ли строка на "!!!"
        boolean startsWithTripleExclamation = input.startsWith("!!!");

        System.out.println(startsWithTripleExclamation);

        // Явное закрытие ресурса
        scanner.close();
    }
}
