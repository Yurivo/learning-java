import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        boolean caseSensitiveCompare = firstString.equals(secondString);
        System.out.println("Сравнение с учетом регистра: " + caseSensitiveCompare);

        boolean caseInsensitiveCompare = firstString.equalsIgnoreCase(secondString);
        System.out.println("Сравнение без учета регистра: " + caseInsensitiveCompare);

        scanner.close();
    }
}