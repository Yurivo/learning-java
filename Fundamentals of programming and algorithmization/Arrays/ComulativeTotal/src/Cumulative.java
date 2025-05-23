
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Cumulative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");

        int n = sc.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];

        for (int i = 0; i < n; i++) {
            arrayA[i] = i + 1;
        }
        arrayB[0] = arrayA[0];
        for (int i = 1; i < n; i++) {
            arrayB[i] = arrayA[i] + arrayB[i - 1];
        }
        System.out.println("Массив A = " + Arrays.toString(arrayA));
        System.out.print("Массив B = " + Arrays.toString(arrayB));


    }
}
