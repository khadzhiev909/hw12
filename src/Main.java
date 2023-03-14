public class Main {
    public static void main(String[] args) {


        //создайте несколько объектов «Книга» (достаточно двух) и
        // несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.

        //book
        Book book1 = new Book("Living Time", "Гоголь",1890);
        Book book2 = new Book("Гордость и предубеждения", "Толстой", 1222);


        //author
        Author author = new Author("Лев", "Толстой", "Николаевич");
        Author author2 = new Author("Гузель", "Яхина", "Шамилевна");


        //В том же методе main измените год публикации одной из книг с помощью сеттера.

        book1.setYear(1120);
        System.out.println("book1.year = " + book1.year);
    }
}
