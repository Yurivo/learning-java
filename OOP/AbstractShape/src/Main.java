// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        // Создание объектов
        Shape circle = new Shape.Circle(5); // Полиморфизм: переменная типа Shape ссылается на объект Shape.Circle
        Shape rectangle = new Shape.Rectangle(4, 6); // Полиморфизм: переменная типа Shape ссылается на объект Shape.Rectangle

        // Вызов методов
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
