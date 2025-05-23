import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Проверка, содержит ли строка "!!!"
        boolean containsWithTripleExclamation = input.contains("!!!");

        System.out.println(containsWithTripleExclamation);

        // Явное закрытие ресурса
        scanner.close();

    }
}
