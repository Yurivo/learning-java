
import java.util.Arrays;

public class SumOfNegative {
    public static void main(String[] args) {
        int sum = 0;
       int[] array = {100, -100, -15, -20, 5, 16, 77, -49, 9, -12};
        System.out.println(Arrays.toString(array));
       for (int num : array) {
        if (num < 0) {
            sum += num;

        }
       }
       System.out.println("Сумма отрицательных элементов массива: " + sum);

    }

}
