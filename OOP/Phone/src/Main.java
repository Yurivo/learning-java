public class Main {
    public static void main(String[] args) {
        // Создание объектов с использованием разных конструкторов
        Phone phone1 = new Phone("123-456-789", "Samsung", 0.2);
        Phone phone2 = new Phone("987-654-321", "iPhone");
        Phone phone3 = new Phone();

        // Вывод значений переменных объектов
        System.out.println("Телефон 1: номер = " + phone1.getNumber() + ", модель = " + phone1.getModel() + ", вес = " + phone1.getWeight());
        System.out.println("Телефон 2: номер = " + phone2.getNumber() + ", модель = " + phone2.getModel() + ", вес = " + phone2.getWeight());
        System.out.println("Телефон 3: номер = " + phone3.getNumber() + ", модель = " + phone3.getModel() + ", вес = " + phone3.getWeight());

        // Вызов метода receiveCall
        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария");
        phone3.receiveCall("Иван");

        // Вызов перегруженного метода receiveCall
        phone1.receiveCall("Алексей", "111-222-333");
        phone2.receiveCall("Мария", "444-555-666");
        phone3.receiveCall("Иван", "777-888-999");

        // Вызов метода getNumber
        System.out.println("Номер телефона 1: " + phone1.getNumber());
        System.out.println("Номер телефона 2: " + phone2.getNumber());
        System.out.println("Номер телефона 3: " + phone3.getNumber());

        // Вызов метода sendMessage
        phone1.sendMessage("111-222-333", "444-555-666", "777-888-999");
        phone2.sendMessage("123-456-789", "987-654-321");
        phone3.sendMessage("555-555-555");
    }
}
