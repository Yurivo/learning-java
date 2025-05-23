public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        // Вызов методов
        creditCardPayment.pay(1000);
        payPalPayment.pay(500);
    }

    // Интерфейс Payment
    public interface Payment {
        void pay(double amount);
    }

    // Класс для оплаты кредитной картой
    public static class CreditCardPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Оплачено " + amount + " руб. с помощью кредитной карты.");
        }
    }

    // Класс для оплаты через PayPal 
    public static class PayPalPayment implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Оплачено " + amount + " руб. через PayPal.");
        }
    }
}