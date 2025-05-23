public class EvenOdd {
    public static void main(String[] args) {
        checkEvenOdd(7);
        checkEvenOdd(10);
    }

    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - четное число");
        } else {
            System.out.println(number + " - нечетное число");
        }
    }
}