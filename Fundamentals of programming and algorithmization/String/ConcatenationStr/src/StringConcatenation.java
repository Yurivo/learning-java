import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        // Конкатенация строк
        String concatenatedString = firstString.concat(secondString);

        // Вывод результата заглавными буквами
        System.out.println("Результат склеивания: " + concatenatedString.toUpperCase());

        scanner.close();
    }
}