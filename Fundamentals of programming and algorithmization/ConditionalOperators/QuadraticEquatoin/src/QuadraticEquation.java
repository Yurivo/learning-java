
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите коэффициенты квадратного уравнения ax²+bx+c=0");
        System.out.print("a = ");
        double a = input.nextDouble();

        System.out.print("b = ");
        double b = input.nextDouble();

        System.out.print("c = ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("Уравнение имеет 2 корня: x1 = %.2f, x2 = %.2f%n", x1, x2);
        }
        else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.printf("Уравнение имеет 1 корень: x = %.2f%n", x);
        }
        else {
            System.out.println("Уравнение не имеет корней:");
        }
        input.close();

    }
}
