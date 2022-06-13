package pro.sky.java.course8.homework9;

public class App {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Lev", "Tolstoy");
        Author secondAuthor = new Author("Dmitriy", "Glushovskiy");
        Book firstBook = new Book ("War and piece", firstAuthor, 1865);
        Book secondBook = new Book("Metro 2033", secondAuthor, 2005);
        System.out.println(firstBook.getNameBook() + ". " + firstBook.getAuthorName(firstBook) + ". " + firstBook.getYearOfPublication());
        System.out.println(secondBook.getNameBook() + ". " + secondBook.getAuthorName(secondBook) + ". " + secondBook.getYearOfPublication());
        firstBook.setYearOfPublication(2022);
        System.out.println(firstBook.getYearOfPublication());
        String bookFirstInfo = firstBook.toString();
        System.out.println(bookFirstInfo);
    }
    }
