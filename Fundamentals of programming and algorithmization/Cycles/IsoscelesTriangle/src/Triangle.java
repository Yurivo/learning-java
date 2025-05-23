
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = sc.nextInt();

        for (int i = 0; i <= height; i++) {
            System.out.println(" ".repeat(height - i - 1) + "*".repeat(2 * i + 1));
        }

        sc.close();

    }
}
