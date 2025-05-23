public class Reader {
    private String fullName;        // ФИО
    private int libraryCardNumber;  // Номер читательского билета
    private String faculty;         // Факультет
    private String birthDate;       // Дата рождения
    private String phoneNumber;     // Телефон

    // Конструктор
    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    // Перегруженный метод takeBook (количество книг)
    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги.");
    }

    // Перегруженный метод takeBook (названия книг)
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Перегруженный метод takeBook (объекты Book)
    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    // Перегруженный метод returnBook (количество книг)
    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книги.");
    }

    // Перегруженный метод returnBook (названия книг)
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Перегруженный метод returnBook (объекты Book)
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}
