import java.util.Scanner;
import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;
        String input;

        System.out.println("Вводите целые числа (для завершения введите 'end'):");

        while (true) {
            input = scanner.next();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);


                if (count == array.length) {
                    int[] newArray = new int[array.length + 10];
                    System.arraycopy(array, 0, newArray, 0, array.length);
                    array = newArray;
                    System.out.println("Массив расширен до " + array.length + " элементов");
                }

                array[count] = number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число или 'end' для завершения");
            }
        }


        int[] finalArray = new int[count];
        System.arraycopy(array, 0, finalArray, 0, count);

        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(finalArray));

        scanner.close();
    }
}