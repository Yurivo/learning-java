
import java.util.Arrays;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));

    }
}
