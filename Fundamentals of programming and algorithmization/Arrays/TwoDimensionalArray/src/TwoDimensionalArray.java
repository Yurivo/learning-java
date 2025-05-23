
import java.util.Scanner;
import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинку строки матрицы: ");
        int m = sc.nextInt();
        System.out.println("Введите длину столбца матрицы: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        int num = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        System.out.println("Итоговая матрица: " );
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}