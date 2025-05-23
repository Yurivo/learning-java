import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите оператор (+, -, *, /, ^): ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.println("Результат: " + add(num1, num2));
                break;
            case "-":
                System.out.println("Результат: " + subtract(num1, num2));
                break;
            case "*":
                System.out.println("Результат: " + multiply(num1, num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль недопустимо!");
                } else {
                    System.out.println("Результат: " + divide(num1, num2));
                }
                break;
            case "^":
                if (num2 < 0) {
                    System.out.println("Ошибка: возведение в отрицательную степень недоступно!");
                } else {
                    System.out.println("Результат: " + power(num1, num2));
                }
                break;
            default:
                System.out.println("Ошибка: неизвестный оператор!");
        }

        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}