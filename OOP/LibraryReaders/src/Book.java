public class Book {
    private String title;  // Название книги
    private String author; // Автор книги

    // Конструктор
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " (" + author + ")";
    }
}

