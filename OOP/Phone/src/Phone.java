public class Phone {
    // Переменные класса
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)
    public Phone(String number, String model) {
        this(number, model, 0.0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор без параметров
    public Phone() {
        this("", "", 0.0); // Вызов конструктора с тремя параметрами
    }

    // Метод receiveCall с одним параметром (имя звонящего)
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод receiveCall с двумя параметрами (имя и номер звонящего)
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    // Метод getNumber
    public String getNumber() {
        return number;
    }

    // Метод sendMessage с переменным числом аргументов (номера телефонов)
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

