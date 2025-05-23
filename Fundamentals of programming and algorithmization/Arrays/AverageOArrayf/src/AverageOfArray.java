
import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {

        float array[] = new float[5];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        float average = 0;
        for (float value : array) {
            average += value;
        }
        System.out.println("Среднее арифметическое массива: " + average/array.length);


        }

        }
