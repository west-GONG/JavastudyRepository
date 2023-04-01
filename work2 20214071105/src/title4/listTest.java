package title4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Head First Java", 39.99, "O'Reilly Media", "Kathy Sierra"));
        books.add(new Book("Thinking in Java", 45.99, "Prentice Hall", "Bruce Eckel"));
        books.add(new Book("Java Concurrency in Practice", 49.99, "Addison-Wesley Professional", "Brian Goetz"));
        books.add(new Book("Effective Java", 35.99, "Addison-Wesley Professional", "Joshua Bloch"));
        books.add(new Book("Java Performance", 42.99, "Addison-Wesley Professional", "Charlie Hunt"));
        books.add(new Book("Java Puzzlers", 29.99, "Addison-Wesley Professional", "Joshua Bloch"));
        books.add(new Book("Java Cookbook", 38.99, "O'Reilly Media", "Ian F. Darwin"));
        books.add(new Book("Java Swing", 33.99, "O'Reilly Media", "James Elliott"));
        books.add(new Book("Java Network Programming", 36.99, "O'Reilly Media", "Elliotte Rusty Harold"));
        books.add(new Book("Java for Dummies", 19.99, "For Dummies", "Barry Burd"));

        // Sort by price
        Collections.sort(books, (book1, book2) -> Double.compare(book1.getPrice(), book2.getPrice()));
        System.out.println("Sort by price:");
        for (Book book : books) {
            System.out.println(book.getName() + " - $" + book.getPrice());
        }

        // Find books with "java" in name
        List<Book> javaBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().toLowerCase().contains("java")) {
                //toLowerCase方法忽略大小差异
                javaBooks.add(book);
            }
        }
        System.out.println("\nBooks with 'java' in name:");
        for (Book book : javaBooks) {
            System.out.println(book.getName());
        }
    }
}
