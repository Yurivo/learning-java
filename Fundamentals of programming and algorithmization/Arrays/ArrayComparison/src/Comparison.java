import java.util.Scanner;
import java.util.Arrays;

public class Comparison {

    // Метод для печати двумерного массива
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrayA = new int[5][5];
        int[][] arrayB = new int[5][5];

        System.out.println("Введите элементы первого массива 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayA[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nПервый массив:");
        printArray(arrayA);

        System.out.println("\nВведите элементы второго массива 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayB[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nВторой массив:");
        printArray(arrayB);

        boolean isEqual = Arrays.deepEquals(arrayA, arrayB);
        System.out.println("\nРезультат сравнения:");
        System.out.println("Массивы " + (isEqual ? "идентичны" : "различны"));

        sc.close();
    }
}