
import java.util.Scanner;

public class SumFormul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        int s = 0;
        for (int k = 1; k <= n; k++) {
         s += k * k + 1;
        }
        System.out.println("S= Сумме от К = 1 до n (k * k + 1)= " + s);

    }
}
