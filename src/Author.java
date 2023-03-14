public class Author {
    String name;
    String surName;
    String patronymic;

    public Author (String name, String surName, String patronymic) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
    }
    // Создайте геттер для всех полей
    private String getName() {
        return this.name;
    }
    private String getSurName() {
        return this.surName;
    }
    private String getPatronymic() {
        return this.patronymic;
    }
}


