
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaxOfArray {
    public static void main(String[] args) {
        int size = 10;
        int array[] = new int[size];
        Random random = new Random();
        List<Integer> maxIndices = new ArrayList<>();

        System.out.println("Заполнение массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Создание случайного порядка:");
        for (int i =  size - 1; i > 0; i--){
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Поиск максимального значения массива: ");
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndices.clear();
                maxIndices.add(i);
            }
            else if (array[i] == max) {
                maxIndices.add(i);
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Индекс(отсчет начинается с 0): " + maxIndices);


    }
}
