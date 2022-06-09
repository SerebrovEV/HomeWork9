package pro.sky.java.course8.homework9;

public class Book {
    private String nameBook;
    private Author author;
    private int yearOfPublication;

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }
    public String getAuthorName (Book book) {
        return book.getAuthor().getNameAuthor() + " " + book.getAuthor().getSurnameAuthor();
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }


}
