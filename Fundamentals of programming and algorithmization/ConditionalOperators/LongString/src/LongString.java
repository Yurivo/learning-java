
import java.util.Scanner;

public class LongString {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите первую строку: ");
    String str1 = sc.nextLine();
    System.out.println("Введите вторую строку: ");
    String str2 = sc.nextLine();
    System.out.println("Введите третью строку: ");
    String str3 = sc.nextLine();

    String longest = str1;
    // Сравниваем длины строк
    if (str2.length() > longest.length()) {
        longest = str2;
    }
    if (str3.length() > longest.length()) {
        longest = str3;
    }
    System.out.println("Самая длинная строка :" +longest);
    System.out.println("Ее длина: " +longest.length() + "символов");

    sc.close();
}
}
