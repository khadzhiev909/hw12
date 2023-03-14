public class Book {
    String name;
    String authorName;
    int year;

    public Book(String name, Author authorName, int year) {
        this.year = year;
        this.name = name;
        this.authorName = authorName.toString();
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
    public String getAuthor() {
        return this.authorName;
    }
    //Создайте сеттер для поля «Год публикации» у книги.
    public int setYear(int year) {
        this.year = year;
        return year;
    }
}
