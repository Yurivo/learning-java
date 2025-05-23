public class Main {
    public static void main(String[] args) {
        // Создание объектов класса Person
        Person person1 = new Person("Дмитрий", 23);
        Person person2 = new Person("Юлия", 32);

        // Вывод информации о каждом человеке
        System.out.println("Информация о первом человеке:");
        person1.displayInfo();
        System.out.println("\nИнформация о втором человеке:");
        person2.displayInfo();
    }
}