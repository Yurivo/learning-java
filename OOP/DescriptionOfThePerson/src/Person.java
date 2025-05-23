public class Person {
    // Приватные поля
    private String name;
    private int age;

    // Конструктор для инициализации полей
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Инкапсуляция для доступа к полям
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

