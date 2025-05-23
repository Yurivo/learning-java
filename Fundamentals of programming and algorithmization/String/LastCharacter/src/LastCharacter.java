import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();


        if (inputString.length() > 0) {
            // Получаем последний символ
            char lastChar = inputString.charAt(inputString.length() - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Вы ввели пустую строку!");
        }

        scanner.close();
    }
}