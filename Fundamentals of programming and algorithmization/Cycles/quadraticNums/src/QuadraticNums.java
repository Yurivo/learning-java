
import java.util.Scanner;

public class QuadraticNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число диапазона: a = ");
        int a = sc.nextInt();
        System.out.print("Введите второе число диапазона: b = ");
        int b = sc.nextInt();
        System.out.println("Квадрат чисел последовательности от а до b ");
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i * i);
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i * i);
            }
        }

        sc.close();
    }
}
