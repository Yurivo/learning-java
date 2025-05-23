import java.util.Arrays;

public class RemoveOdds {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int[] result = removeOddNumbers(array);
        System.out.println("Без нечетных: " + Arrays.toString(result));
    }

    public static int[] removeOddNumbers(int[] arr) {

        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
        }


        int[] result = new int[evenCount];
        int index = 0;


        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}