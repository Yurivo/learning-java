import java.util.Scanner;

public class StrTransformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        System.out.print("Введите третью строку: ");
        String thirdString = scanner.nextLine();

        System.out.println("Третья строка: " + thirdString);

        System.out.println("Вторая строка в верхнем регистре: " + secondString.toUpperCase());

        System.out.println("Первая строка в нижнем регистре: " + firstString.toLowerCase());

        scanner.close();
    }
}