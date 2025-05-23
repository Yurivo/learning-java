
import java.util.Scanner;

public class FindCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = sc.nextLine();

        boolean findCat = input.contains("cat");
        System.out.println("Вывод без учета регистра: " + findCat);

        boolean containsCat = input.toLowerCase().contains("cat");
        System.out.println("Вывод с учетом регистра: " + containsCat);

        sc.close();
    }
}
