
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        int n = sc.nextInt();
        int numOfEven = 0;

        if (n >= 0){
            for (int i = 1; i <= n; i++){
                if (i % 2 == 0){
                    numOfEven++;
                }
            }
        } else{
            System.out.println("Введено не натуральное число!");
        }

        System.out.println("Количество натуральных чисел: " + numOfEven);
     sc.close();
    }
}
