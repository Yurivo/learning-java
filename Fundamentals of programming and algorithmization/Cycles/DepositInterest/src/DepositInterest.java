
import java.util.Scanner;

public class DepositInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double amountDeposit = sc.nextDouble();
        System.out.print("Введите количество месяцев: ");
        double numOfDeposit = sc.nextDouble();


        double finalAmount = amountDeposit + (amountDeposit * 0.07 * numOfDeposit);

            System.out.println("Конечная сумма вклада с учетом процентов: " + finalAmount);
        }






    }