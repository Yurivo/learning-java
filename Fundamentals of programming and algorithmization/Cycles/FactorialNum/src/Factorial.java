
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число (от 1 до 12): ");
        int n = sc.nextInt();
        int factorial = 1;

        if (n <= 12){
            for (int i = 1; i <= n; i++){
              factorial  *= i ;
            }
            System.out.println("Факториал числа n = " + factorial);
        } else {
            System.out.println("Недопустимое значение");
        }
    }
}
