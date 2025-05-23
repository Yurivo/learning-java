
import java.util.Scanner;
import java.util.Arrays;


public class Fill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int n = sc.nextInt();
        System.out.println("Введите число, которым заполнить массив: ");
        int number = sc.nextInt();
        int[] arr = new int[n];
        Arrays.fill(arr, number);
        System.out.println("результат заполнения: " + Arrays.toString(arr));

        sc.close();

    }
}
