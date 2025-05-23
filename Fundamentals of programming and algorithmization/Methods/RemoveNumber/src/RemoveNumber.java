import java.util.Arrays;

public class RemoveNumber {
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 2, 5, 3, 8, 3};
        int target = 3;
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int[] result = removeAllOccurrences(array, target);
        System.out.println("После удаления " + target + ": " + Arrays.toString(result));
    }

    public static int[] removeAllOccurrences(int[] arr, int target) {
        
        int count = 0;
        for (int num : arr) {
            if (num != target) count++;
        }


        int[] result = new int[count];
        int index = 0;


        for (int num : arr) {
            if (num != target) {
                result[index++] = num;
            }
        }

        return result;
    }
}