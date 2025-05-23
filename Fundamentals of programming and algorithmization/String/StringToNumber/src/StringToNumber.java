import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Удаление всех нецифровых символов
        String digitsOnly = input.replaceAll("[^0-9]", "");

        if (digitsOnly.isEmpty()) {
            System.out.println("В строке нет цифр!");
        } else {
            // Преобразование в число
            try {
                int number = Integer.parseInt(digitsOnly);
                System.out.println("Полученное число: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Слишком большое число для типа int!");
            }
        }

        scanner.close();
    }
}