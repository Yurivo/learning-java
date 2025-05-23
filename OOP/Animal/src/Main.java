// Главный класс
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}

// Базовый класс Animal
class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака лает: Гав-гав!");
    }
}

// Подкласс Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Кошка мяукает: Мяу-мяу!");
    }
}