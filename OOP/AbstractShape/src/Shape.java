// Абстрактный класс Shape
public abstract class Shape {
    // Абстрактный метод для вычисления площади
    public abstract double getArea();

    // Подкласс Shape.Circle
    public static class Circle extends Shape {
        private double radius; // Радиус круга

        // Конструктор
        public Circle(double radius) {
            this.radius = radius;
        }

        // Реализация метода getArea() для круга
        @Override
        public double getArea() {
            return Math.PI * radius * radius; // Формула площади круга: π * r^2
        }
    }

    // Подкласс Shape.Rectangle
    public static class Rectangle extends Shape {
        private double width;  // Ширина прямоугольника
        private double height; // Высота прямоугольника

        // Конструктор
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Реализация метода getArea() для прямоугольника
        @Override
        public double getArea() {
            return width * height; // Формула площади прямоугольника: ширина * высота
        }
    }
}
