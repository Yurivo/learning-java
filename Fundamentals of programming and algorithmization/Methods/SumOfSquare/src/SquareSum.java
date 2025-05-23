public class SquareSum {
    public static void main(String[] args) {
        System.out.println("Сумма квадратов: " + sumOfSquares(3, 4));
    }

    public static int square(int num) {
        return num * num;
    }

    public static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }
}