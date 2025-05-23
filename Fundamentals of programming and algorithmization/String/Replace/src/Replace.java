
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        // Замена символов 'a' и 'b'
        String replacedString = input.replace('a' , 'b');
        System.out.println(replacedString);

        scanner.close();
    }
}
