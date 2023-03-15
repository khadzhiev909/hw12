public class Book {
    String name;
    Author author;
    int year;

    public Book(String name, Author author, int year) {
        this.year = year;
        this.name = name;
        this.author = author;
    }

    public String getTatle() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public Author getAuthor() {
        return this.author;
    }
    //Создайте сеттер для поля «Год публикации» у книги.
    public int setYear(int year) {
        this.year = year;
        return year;
    }
}
