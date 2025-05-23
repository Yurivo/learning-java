
import java.util.Arrays;

public class SortLetter {
    public static void main(String[] args) {
        char[] letters = {'d', 'a', 'c', 'b', 'e'};
        System.out.println("Буквы до сортировки" + Arrays.toString(letters));

        Arrays.sort(letters);

        System.out.println("Отсортированные буквы: " + Arrays.toString(letters));
    }
}

