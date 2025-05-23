
import java.util.Arrays;
import java.util.Random;

public class MaxNumOfSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Сортируеммый массив: " + Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число массива: " + max);


    }
}
