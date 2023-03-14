public class Book {
    String name;
    String author;
    int year;

    public Book (String name, String author, int year){
        this.year = year;
        this.name = name;
        this.author = author;
    }

    //Создайте геттер для всех полей
    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
    //Создайте сеттер для поля «Год публикации» у книги.
    public int setYear(int year) {
        this.year = year;
        return year;
    }

}




